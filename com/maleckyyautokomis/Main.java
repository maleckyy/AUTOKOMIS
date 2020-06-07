package com.maleckyyautokomis;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.kasa = 20000.00;


//INTRO GIERKI
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w swoim nowym komisie samochodowym, mam nadzieje że zostało Ci jeszcze troche kasy po kupnie tej nieruchomości.");
        System.out.println("bo przydałoby sie jeszze kupić samochochody bo w koncu czymś musisz handlować.");
        System.out.println("Ale gdzie moje maniery...");
        System.out.println("Jak sie nazywasz?");
        player.playerName = scanner.nextLine();
        //String imiegraczaintro= player.playerName.substring(0,1).toUpperCase()+player.playerName.substring(1);

        System.out.println("Witaj " + player.playerName.substring(0, 1).toUpperCase() + player.playerName.substring(1) + " widze że zostało ci " + player.kasa + " złoty na koncie, to rozsądna ilość kaski żeby zaczać handlować");
        System.out.println("Zostało mi życzyć ci powodzenia, do dzieła!");


//LISTY DO SAMOCHODÓW
        String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};

        String kolorsamo[] = {"Czerwony", "Czarny", "Szary", "Niebieski", "Żółty"};

        String segmentsamo[] = {"Premium", "Standard", "Budget"};

//LISTY IMION KLIENTÓW jest ich 15.
        String klientName[] = {"Paweł", "Marcin", "Roman", "Rysiek", "Michał", "Patryk", "Adam", "Janek", "Szymon", "Mikołaj", "Olaf", "Wojtek", "Matuesz", "Oskar", "Daniel"};


//GENERATORY LOSOWYCH LICZB
        //ZAKRES 5 LICZB i 3 LICZB i 15
        Random random = new Random();
        int numerek;
        int numerek1;
        int numerek2;
        numerek = random.nextInt(5);//do samochdów i kolorów
        numerek1 = random.nextInt(3);//do segmentów
        numerek2 = random.nextInt(15);//do klientów

        //GENERATOR CENY
        int c1, c2, c3, c4;//c1 tania(fiat opel),c2 srednia(volvo bmw) c3 droga(merc), c4 to kasa klienta
        c1 = random.nextInt(7000) + 5000;

        c2 = random.nextInt(10000) + 15000;

        c3 = random.nextInt(20000) + 27000;

        c4 = random.nextInt(45000) + 10000;

        //GENERATOR PRZEBIEGÓW
        int p1 = random.nextInt(100000) + 100000;


//TWORZENIE KLIENTA
        Customer customer1 = new Customer();
        customer1.customerName = klientName[numerek2];
        customer1.kasaKlienta = c4;
        numerek = random.nextInt(5);
        customer1.favMarka1 = markisamo[numerek];
        numerek = random.nextInt(5);
        customer1.favMarka2 = markisamo[numerek];
        if (customer1.favMarka1 == customer1.favMarka2) {
            while (customer1.favMarka1 != customer1.favMarka2) ;
            numerek = random.nextInt(5);
            customer1.favMarka2 = markisamo[numerek];
        }

//TWORZENIE SAMOCHODU

        Car car1 = new Car();
        numerek = random.nextInt(5);
        car1.marka = markisamo[numerek];
        numerek = random.nextInt(5);
        car1.kolor = kolorsamo[numerek];
        car1.przebieg = p1;
        car1.segment = segmentsamo[numerek1];

        if (car1.marka == markisamo[3] || car1.marka == markisamo[4]) {
            if (car1.segment == segmentsamo[0]) {
                car1.wartosc = c1 + 10000;
            } else if (car1.segment == segmentsamo[1]) {
                car1.wartosc = c1 + 5000;
            } else {
                car1.wartosc = c1;
            }
        } else if (car1.marka == markisamo[0] || car1.marka == markisamo[1]) {
            if (car1.segment == segmentsamo[0]) {
                car1.wartosc = c2 + 10000;
            } else if (car1.segment == segmentsamo[1]) {
                car1.wartosc = c2 + 5000;
            } else {
                car1.wartosc = c2;
            }
        } else {
            if (car1.segment == segmentsamo[0]) {
                car1.wartosc = c3 + 10000;
            } else if (car1.segment == segmentsamo[1]) {
                car1.wartosc = c3 + 5000;
            } else {
                car1.wartosc = c3;
            }
        }


        System.out.println(car1.toString());
        System.out.println(customer1.toString());
/*
        Player player =new Player();
        player.kasa=20000.00;


//INTRO GIERKI
        Scanner scanner =new Scanner(System.in);
        System.out.println("Witaj w swoim nowym komisie samochodowym, mam nadzieje że zostało Ci jeszcze troche kasy po kupnie tej nieruchomości.");
        System.out.println("bo przydałoby sie jeszze kupić samochochody bo w koncu czymś musisz handlować.");
        System.out.println("Ale gdzie moje maniery...");
        System.out.println("Jak sie nazywasz?");
        player.playerName= scanner.nextLine();
        //String imiegraczaintro= player.playerName.substring(0,1).toUpperCase()+player.playerName.substring(1);

        System.out.println("Witaj " + player.playerName.substring(0,1).toUpperCase()+player.playerName.substring(1) +" widze że zostało ci "+ player.kasa + " złoty na koncie, to rozsądna ilość kaski żeby zaczać handlować");
        System.out.println("Zostało mi życzyć ci powodzenia, do dzieła!");
        */

//OPCJE UŻYTKOWNIKA


            System.out.println("");
            System.out.println("OPCJA UŻYTKOWNIKA");
            System.out.println("");

            System.out.println("1.PRZEGLĄDAJ BAZE SAMOCHODÓW DO KUPIENIA");
            System.out.println("2.KUP SAMOCHOD");
            System.out.println("3.BAZA POSIADANYCH SAMOCHODÓW");
            System.out.println("4.NAPRAW SAMOCHÓD");
            System.out.println("5.POKAŻ POTENCJALNYCH KLIENTÓW");
            System.out.println("6.SPRZEDAJ SAMOCHÓD KLIENTOWI");
            System.out.println("7.KUP REKLAME");
            System.out.println("8.STAN KONTA");
            System.out.println("9.HISTORIA TRAKZAKCJI");
            System.out.println("10.HISTORIA NAPRAW SAMOCHODU");
            System.out.println("11.SUMA KOSZTÓW NAPRAW I MYCIA SAMOCHODU");
            System.out.println("");
            System.out.println("WPISZ NUMER ABY WYBRAĆ OPCJE");

            int x = scanner.nextInt();
            if (x == 1) {
                //baza samochodow do kupienia
            }
            if (x == 2) {
                //kupuje samcohdoy i dodaje ture
            }
            if (x == 3) {
                //pokazuje posiadane samochody
            }
            if (x == 4) {
                //pokazuje i naprawia samochody+tura lub wraca do menu
            }
            if (x == 5) {

            }
            if (x == 6) {

            }
            if (x == 7) {
                System.out.println("Którą reklame chcesz kupić");
                System.out.println("");
                System.out.println("1.Reklama w lokalnej gazecie- 1000złotych.");
                System.out.println("2.Reklama w internecie- 200złotych.");
                int z = scanner.nextInt();
                if(z==1){
                    //dodać 2 nowych klientów
                    // odjać 1000złotych
                    System.out.println("Kupiłeś reklame w lokalnej gazecie. Przyszło 2 nowych klientów.");
                }else if(z==2){
                    int szansa = random.nextInt(2);
                    if(szansa==1){
                        //dodać 1 klienta
                        //odjąć 200 złotych
                        System.out.println("Kupiłes reklame w internecie. Pozyskałeś nowego klienta.");
                    }else{
                        System.out.println("Kupiłes reklame w internecie. Niestety nie pozyskałeś żadnego nowego klienta.");
                        //odjąć 200 złotych
                    }
                }else{
                    //błąd
                }


            }
            if (x == 8) {
                System.out.println("Stan konta wynosi " + player.kasa + " złotych.");
            }
            if (x == 9) {

            }
            if (x == 10) {

            }
            if (x == 11) {

            } else {
                //wrocenie na start

            }



    }

}