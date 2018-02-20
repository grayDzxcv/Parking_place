package com.emoskvc.app.transport;

public class Scooter extends Transport {
    //Класс самокат
    public Scooter() {
        super("Самокат", (byte) 2, 10);
    }
    //На всякий случай
    public Scooter(String name, byte wheelsCount, double maxSpeed) {
        super(name, wheelsCount, maxSpeed);
    }

}
