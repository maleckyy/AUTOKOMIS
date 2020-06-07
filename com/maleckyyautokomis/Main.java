package com.maleckyyautokomis;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {


//LISTY DO SAMOCHODÓW
        String markisamo[]= {"Volvo","BMW","Mercedes","Opel","Fiat"};

        String kolorsamo[]={"Czerwony","Czarny","Szary","Niebieski","Żółty"};

        String segmentsamo[]={"Premium","Standard","Budget"};

//GENERATORY LOSOWYCH LICZB
        //ZAKRES 5 LICZB i 3 LICZB
        Random random = new Random();
        int numerek;
        int numerek1;
        numerek = random.nextInt(5);
        numerek1= random.nextInt(3);

        //GENERATOR CENY






        Car car1 = new Car();
        car1.marka = markisamo[numerek];
        car1.kolor = kolorsamo[numerek];
        car1.przebieg = 130392.0;
        car1.segment =segmentsamo[numerek1];
        car1.wartosc = 12000.0;

        System.out.println(car1.kolor +" "+ car1.segment +" "+ car1.marka);

        Player player =new Player();
        player.kasa=20000.00;


//INTRO GIERKI
        Scanner scanner =new Scanner(System.in);
        System.out.println("Witaj w swoim nowym komisie samochodowym, mam nadzieje że zostało Ci jeszcze troche kasy po kupnie tej nieruchomości.");
        System.out.println("bo przydałoby sie jeszze kupić samochochody bo w koncu czymś musisz handlować.");
        System.out.println("Ale gdzie moje maniery...");
        System.out.println("Jak sie nazywasz?");
        player.playerName= scanner.nextLine();

        System.out.println("Witaj " + player.playerName +" widze że zostało ci "+ player.kasa + " złoty na koncie, to rozsądna ilość kaski żeby zaczać handlować");
        System.out.println("Zostało mi życzyć ci powodzenia, do dzieła!");


    }




}
