package com.emoskvc.app;

import com.emoskvc.app.transport.Transport;
import com.emoskvc.app.transport.TransportSelector;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TransportSelector selector = new TransportSelector();
        List<Transport> transports = new ArrayList<>();
        int number;
        System.out.println("------------------------------------");
        for (String input : args) {
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод");
                System.out.println("------------------------------------");
                continue;
            }
            number = Integer.parseInt(input);
            Transport transport = selector.getTransportByNumber(number);
            if (transport == null)
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
            else {
                System.out.println(transport);
                transports.add(transport);
            }
            System.out.println("------------------------------------");
        }
    }
}
