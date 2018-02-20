package com.emoskvc.app.transport;

public class Bus extends Transport {
    //Класс автобус
    public Bus() {
        super("Автобус", (byte) 4, 100);
    }

    //На всякий случай
    public Bus(String name, byte wheelsCount, double maxSpeed) {
        super(name, wheelsCount, maxSpeed);
    }

}
