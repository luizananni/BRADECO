package core;

import interfaces.Heater;
import interfaces.Thermometer;

public class Regulator {
    private final Thermometer thermometer;
    private final Heater heater;

    public Regulator(Thermometer thermometer, Heater heater) {
        this.thermometer = thermometer;
        this.heater = heater;
    }

    public void regulate(double minTemp, double maxTemp) {
        double currentTemp = thermometer.read();
        System.out.println("Temperatura atual: " + currentTemp + "°C");

        if (currentTemp < minTemp) {
            System.out.println("Temperatura abaixo do mínimo (" + minTemp + "°C).");
            heater.engage();
        } else if (currentTemp > maxTemp) {
            System.out.println("Temperatura acima do máximo (" + maxTemp + "°C).");
            heater.disengage();
        } else {
            System.out.println("Temperatura dentro da faixa (" + minTemp + "°C - " + maxTemp + "°C).");
        }
    }
}