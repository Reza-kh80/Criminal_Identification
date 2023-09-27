package model.head;

public class HomeHead extends Head {
    private String price, postalCode, address, area;

    public HomeHead(String[] inputs) {
        price = inputs[1];
        postalCode = inputs[2];
        nationalCode = inputs[0];
        area = inputs[3];
        address = inputs[4];
    }

    @Override
    public String toString() {
        return "home-head:{national code: " + nationalCode + ", price: " + price + ", postal code: " + postalCode
                + ", size: " + area + ", address: " + address + "}";
    }
}
