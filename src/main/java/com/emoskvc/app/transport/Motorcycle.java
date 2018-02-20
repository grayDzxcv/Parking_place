package com.emoskvc.app.transport;

public class Motorcycle extends Transport {
    //Класс мотоцикл
    public Motorcycle() {
        super("Мотоцикл", (byte) 2, 200);
    }

    //На всякий случай
    public Motorcycle(String name, byte wheelsCount, double maxSpeed) {
        super(name, wheelsCount, maxSpeed);
    }


}
