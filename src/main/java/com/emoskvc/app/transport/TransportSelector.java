package com.emoskvc.app.transport;

public class TransportSelector {
    /*
    *
    * Фабрика по созданию объектов
    */
    private Transport transport = null;
    private static TransportType[] transportTypes = TransportType.values();

    public TransportSelector() {

    }

    public Transport getTransportByNumber(int id) {
        if (id >= TransportSelector.transportTypes.length)
            return null;

        switch (TransportType.values()[id].ordinal()) {
            case 0: {
                transport = new Motorcycle();
                break;
            }
            case 1: {
                transport = new Scooter();
                break;
            }
            case 2: {
                transport = new Car();
                break;
            }
            case 3: {
                transport = new Bus();
                break;
            }
            default: {
                return null;
            }
        }

        return transport;
    }

    //На всякий случай
    public Transport getTransportByNumber(int id, String name, byte wheelsCount, double maxSpeed) {
        if (id >= TransportSelector.transportTypes.length)
            return null;
        switch (TransportType.values()[id].ordinal()) {
            case 0: {
                transport = new Motorcycle(name, wheelsCount, maxSpeed);
                break;
            }
            case 1: {
                transport = new Scooter(name, wheelsCount, maxSpeed);
                break;
            }
            case 2: {
                transport = new Car(name, wheelsCount, maxSpeed);
                break;
            }
            case 3: {
                transport = new Bus();
                break;
            }
        }

        return transport;
    }



}
