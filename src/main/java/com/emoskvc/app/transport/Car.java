package com.emoskvc.app.transport;

public class Car extends Transport {
    //Класс автомобиль
    public Car() {
        super("Автомобиль", (byte) 4, 150);
    }

    //На всякий случай
    public Car(String name, byte wheelsCount, double maxSpeed ) {
        super(name, wheelsCount, maxSpeed);
    }

}
