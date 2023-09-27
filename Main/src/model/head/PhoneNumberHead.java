package model.head;

public class PhoneNumberHead extends Head {
    private String simCardNumber, operatorName;

    public PhoneNumberHead(String[] inputs) {
        simCardNumber = inputs[1];
        operatorName = inputs[2];
        nationalCode = inputs[0];
    }

    @Override
    public String toString() {
        return "person-head:{national code: " + nationalCode + ", sim card number: " + simCardNumber + ", operator: "
                + operatorName + "}";
    }

    public String getSimCardNumber() {
        return simCardNumber;
    }
}
