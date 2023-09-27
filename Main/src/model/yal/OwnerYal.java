package model.yal;

public class OwnerYal extends Yal {
    private String ownerId, ownerTime, price;

    public OwnerYal(String[] inputs) {
        from = inputs[0];
        to = inputs[1];
        ownerId = inputs[2];
        ownerTime = inputs[3];
        price = inputs[4];
    }

    @Override
    public String toString() {
        return "owner-yal:{from: " + from + ", to: " + to + ", owner id: " + ownerId + ", time: " + ownerTime
                + ", price: " + price + "}";
    }

    public String getOwnerTime() {
        return ownerTime;
    }

    public String getNationalCode() {
        return from;
    }
}
