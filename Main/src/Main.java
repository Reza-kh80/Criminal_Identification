
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import controller.ReadFile;
import model.Entity;
import model.head.CarHead;
import model.head.CreditHead;
import model.head.HomeHead;
import model.head.PersonHead;
import model.head.PhoneNumberHead;
import model.yal.CallYal;
import model.yal.OwnerYal;
import model.yal.PaymentYal;
import model.yal.RelationYal;

public class Main {

    public static void main(String[] args) {
        int phase = 4;

        HashMap<String, Boolean> codes = new HashMap<>();
        ArrayList<PersonHead> personHeads = new ReadFile().readPeopleFile();
        ArrayList<PhoneNumberHead> phoneNumberHeads = new ReadFile().readPhonesFile();
        ArrayList<HomeHead> homeHeads = new ReadFile().readHomesFile();
        ArrayList<CarHead> carHeads = new ReadFile().readCarsFile();
        ArrayList<CreditHead> creditHeads = new ReadFile().readAccountsFile();
        ArrayList<CallYal> callYals = new ReadFile().readCallsFile();
        ArrayList<OwnerYal> ownerYals = new ReadFile().readOwnersFile();
        ArrayList<PaymentYal> paymentYals = new ReadFile().readPaymentsFile();
        ArrayList<RelationYal> relationYals = new ReadFile().readRelationsFile();
        if (phase == 1) {
            // phase one...
            for (Entity entity : personHeads) {
                System.out.println(entity.toString());
            }
            for (Entity entity : phoneNumberHeads) {
                System.out.println(entity.toString());
            }
            for (Entity entity : homeHeads) {
                System.out.println(entity.toString());
            }
            for (Entity entity : carHeads) {
                System.out.println(entity.toString());
            }
            for (Entity entity : creditHeads) {
                System.out.println(entity.toString());
            }
            for (Entity entity : callYals) {
                System.out.println(entity.toString());
            }
            for (Entity entity : ownerYals) {
                System.out.println(entity.toString());
            }
            for (Entity entity : paymentYals) {
                System.out.println(entity.toString());
            }
            for (Entity entity : relationYals) {
                System.out.println(entity.toString());
            }
        } else if (phase == 2) {
            Calendar calendar = Calendar.getInstance();
            int year = Integer.valueOf(calendar.getTime().toString().split(" ")[5]);
            for (OwnerYal ownerYal : ownerYals) {
                String[] date = ownerYal.getOwnerTime().split("-");
                if (Integer.valueOf(date[0]) >= year - 2) {
                    PersonHead head = null;
                    for (PersonHead personHead : personHeads) {
                        if ((personHead.getWorkPlace().equals("گمرک")
                                || personHead.getWorkPlace().equals("سازمان بنادر"))
                                && personHead.getNationalCode().equals(ownerYal.getNationalCode())) {
                            head = personHead;
                            if (!codes.containsKey(head.getNationalCode())) {
                                codes.put(head.getNationalCode(), true);
                                System.out.println(personHead.toString());
                            }
                            break;
                        }
                    }
                    if (head == null || head != null) {
                        RelationYal relation = null;
                        for (RelationYal relationYal : relationYals) {
                            if (relationYal.getFrom().equals(ownerYal.getNationalCode())
                                    || relationYal.getTo().equals(ownerYal.getNationalCode())) {
                                relation = relationYal;
                                String code, c;
                                if (relation.getFrom().equals(ownerYal.getNationalCode())) {
                                    code = relation.getTo();
                                    c = relation.getFrom();
                                } else {
                                    code = relation.getFrom();
                                    c = relation.getTo();
                                }
                                for (PersonHead personHead : personHeads) {
                                    if (personHead.getNationalCode().equals(code)
                                            && (personHead.getWorkPlace().equals("گمرک")
                                            || personHead.getWorkPlace().equals("سازمان بنادر"))) {
                                        head = personHead;
                                        break;
                                    }
                                }
                                if (head != null && !codes.containsKey(head.getNationalCode())) {
                                    codes.put(head.getNationalCode(), true);
                                    System.out.println("from " + c + " relation to: " + head.toString());
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } else if (phase == 3) {
        } else if (phase == 4) {
            for (PersonHead personHead : personHeads) {
                if (personHead.getWorkPlace().equals("قاچاقچی")) {
                    String number = "";
                    for (PhoneNumberHead phoneNumberHead : phoneNumberHeads) {
                        if (phoneNumberHead.getNationalCode().equals(personHead.getNationalCode())) {
                            for (CallYal callYal : callYals) {
                                if (callYal.getFrom().equals(phoneNumberHead.getSimCardNumber())) {
                                    number = callYal.getTo();
                                    break;
                                } else if (callYal.getTo().equals(phoneNumberHead.getSimCardNumber())) {
                                    number = callYal.getFrom();
                                    break;
                                }
                            }
                            if (number.length() > 0) {
                                break;
                            }
                        }
                    }
                    String id = "";
                    if (number.length() > 0) {
                        for (PhoneNumberHead phoneNumberHead : phoneNumberHeads) {
                            if (phoneNumberHead.getSimCardNumber().equals(number)) {
                                id = phoneNumberHead.getNationalCode();
                                break;
                            }
                        }
                        if (id.length() > 0) {
                            for (PersonHead personHead2 : personHeads) {
                                if (personHead2.getNationalCode().equals(id)) {
                                    if (!codes.containsKey(personHead2.getNationalCode())) {
                                        System.out.println(personHead2.toString());
                                        codes.put(personHead2.getNationalCode(), true);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
