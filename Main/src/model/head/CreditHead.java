package model.head;

public class CreditHead extends Head {
    private String sheba, bankName, creditNumber;

    public CreditHead(String[] inputs) {
        bankName = inputs[1];
        sheba = inputs[2];
        nationalCode = inputs[0];
        creditNumber = inputs[3];
    }

    @Override
    public String toString() {
        return "credit-head:{national code: " + nationalCode + ", sheba: " + sheba + ", bank name: " + bankName
                + ", credit number: " + creditNumber + "}";
    }
}
