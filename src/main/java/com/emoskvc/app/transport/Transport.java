package com.emoskvc.app.transport;

public abstract class Transport {

    private String name;
    private byte wheelsCount;
    private double maxSpeed;

    public Transport() {

    }

    public Transport(String name, byte wheelsCount, double maxSpeed) {
        this.name = name;
        this.wheelsCount = wheelsCount;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(byte wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Наименование транспорта: " + name + "\n" +
                "Кол-во колес: " + wheelsCount + "\n" +
                "Максимальная скорость: " + Math.round(maxSpeed) + "км/ч";

    }
}
