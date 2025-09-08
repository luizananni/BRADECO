package hardware;

import interfaces.Thermometer;

public class IOChannelThermometer implements Thermometer {
    @Override
    public double read() {
        return 26.5;
    }
}