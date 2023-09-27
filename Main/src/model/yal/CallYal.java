package model.yal;

public class CallYal extends Yal {
    private String callId, time, period;

    public CallYal(String[] inputs) {
        from = inputs[0];
        to = inputs[1];
        callId = inputs[2];
        time = inputs[3];
        period = inputs[4];
    }

    @Override
    public String toString() {
        return "call-yal:{from: " + from + ", to: " + to + ", call id: " + callId + ", time: " + time + ", period: "
                + period + "}";
    }
}
