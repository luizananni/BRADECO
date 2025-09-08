package hardware;

import interfaces.Heater;

public class IOChannelHeater implements Heater {
    @Override
    public void engage() {
        System.out.println("Aquecedor Ligado!");
    }

    @Override
    public void disengage() {
        System.out.println("Aquecedor Desligado!");
    }
}