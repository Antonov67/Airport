package com.company;


import com.skillbox.airport.Airport;
import com.skillbox.airport.Terminal;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Список Терминалов
        List<Terminal> terminalList = Airport.getInstance().getTerminals();
        //всего самолетов, припаркованных в терминалах
        int totalCountAircrafts=0;
        for (Terminal value : terminalList) {
            totalCountAircrafts = totalCountAircrafts + value.getParkedAircrafts().size();
        }
        System.out.println("Всего самолетов " + totalCountAircrafts);
        //печатаем список терминалов с количеством самолетов, количеством рейсов и списком самолетов в каждом терминале
        terminalList.forEach((Terminal terminal)->{
            System.out.println("Количество рейсов в терминале: " +
                    terminal.getName() + " - " + terminal.getFlights().size());
            System.out.println("Количество самолетов в терминале: " +
                    terminal.getName() + " - " +
                    terminal.getParkedAircrafts().size());

            System.out.println(terminal.getParkedAircrafts());
        });
    }
}