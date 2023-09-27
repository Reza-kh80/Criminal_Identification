package model.head;

public class CarHead extends Head {
    private String plate, model, color;
    public CarHead(String[] inputs) {
        plate = inputs[0];
        model = inputs[2];
        nationalCode = inputs[1];
        color = inputs[3];
    }
    
    @Override
    public String toString() {
        return "car-head:{national code: " + nationalCode + ", plate: " + plate + ", model: " + model + ", color: "
                + color + "}";
    }
    
    public String getPlate() {
        return this.plate;
    }
}
