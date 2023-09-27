package model.yal;

public class PaymentYal extends Yal {
    private String paymentId, time, price;

    public PaymentYal(String[] inputs) {
        from = inputs[0];
        to = inputs[1];
        paymentId = inputs[2];
        time = inputs[3];
        price = inputs[4];
    }

    @Override
    public String toString() {
        return "transaction-yal:{from: " + from + ", to: " + to + ", transaction id: " + paymentId + ", time: " + time + ", price: "
                + price + "}";
    }
}
