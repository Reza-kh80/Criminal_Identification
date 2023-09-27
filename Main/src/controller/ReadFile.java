package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.head.CarHead;
import model.head.CreditHead;
import model.head.HomeHead;
import model.head.PersonHead;
import model.head.PhoneNumberHead;
import model.yal.CallYal;
import model.yal.OwnerYal;
import model.yal.PaymentYal;
import model.yal.RelationYal;

public class ReadFile {
    public ArrayList<PersonHead> readPeopleFile() {
        ArrayList<PersonHead> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\people.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"first_name\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                PersonHead personHead = new PersonHead(str);
                entities.add(personHead);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }

    public ArrayList<PhoneNumberHead> readPhonesFile() {
        ArrayList<PhoneNumberHead> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\phones.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"ssn\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                PhoneNumberHead phoneNumberHead = new PhoneNumberHead(str);
                entities.add(phoneNumberHead);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }

    public ArrayList<HomeHead> readHomesFile() {
        ArrayList<HomeHead> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\homes.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"ssn\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                HomeHead homeHead = new HomeHead(str);
                entities.add(homeHead);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }

    public ArrayList<CarHead> readCarsFile() {
        ArrayList<CarHead> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\cars.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"plate\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                CarHead carHead = new CarHead(str);
                entities.add(carHead);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }

    public ArrayList<CreditHead> readAccountsFile() {
        ArrayList<CreditHead> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\accounts.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"ssn\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                CreditHead creditHead = new CreditHead(str);
                entities.add(creditHead);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }

    public ArrayList<CallYal> readCallsFile() {
        ArrayList<CallYal> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\calls.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"from\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                CallYal callYal = new CallYal(str);
                entities.add(callYal);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }

    public ArrayList<OwnerYal> readOwnersFile() {
        ArrayList<OwnerYal> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\ownerships.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"from\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                OwnerYal ownerYal = new OwnerYal(str);
                entities.add(ownerYal);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }

    public ArrayList<PaymentYal> readPaymentsFile() {
        ArrayList<PaymentYal> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\transactions.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"from\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                PaymentYal paymentYal = new PaymentYal(str);
                entities.add(paymentYal);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }

    public ArrayList<RelationYal> readRelationsFile() {
        ArrayList<RelationYal> entities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("E:\\Term 3\\Sakhteman dadeh\\Project\\data\\relationships.csv"));
            String str[];
            while (scanner.hasNext()) {
                str = scanner.nextLine().split(",");
                if (str[0].equals("") || str[0].equals("\"from\""))
                    continue;
                for (int i = 0; i < str.length; i++) {
                    str[i] = str[i].replaceAll("\"", "");
                }
                RelationYal relationYal = new RelationYal(str);
                entities.add(relationYal);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }
}
