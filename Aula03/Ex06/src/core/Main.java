package core;

import hardware.IOChannelHeater;
import hardware.IOChannelThermometer;
import interfaces.Heater;
import interfaces.Thermometer;

public class Main {
    public static void main(String[] args) {
        Thermometer thermometer = new IOChannelThermometer();
        Heater heater = new IOChannelHeater();

        Regulator regulator = new Regulator(thermometer, heater);

        double minTemperature = 20.0;
        double maxTemperature = 25.0;
        regulator.regulate(minTemperature, maxTemperature);
    }
}