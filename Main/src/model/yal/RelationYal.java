package model.yal;

public class RelationYal extends Yal {
    private String relation, time;

    public RelationYal(String[] inputs) {
        from = inputs[0];
        to = inputs[1];
        relation = inputs[2];
        time = inputs[3];
    }

    @Override
    public String toString() {
        return "relationship-yal:{from: " + from + ", to: " + to + ", relation: " + relation + ", time: " + time + "}";
    }
}
