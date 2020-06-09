package com.maleckyyautokomis;

import java.util.*;

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


//DO SAMOCHODÓW
        String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};

        String kolorsamo[] = {"Czerwony", "Czarny", "Szary", "Niebieski", "Żółty"};

        String segmentsamo[] = {"Premium", "Standard", "Budget"};

//IMIONa KLIENTÓW ,jest ich 15.
        String klientName[] = {"Paweł", "Marcin", "Roman", "Rysiek", "Michał", "Patryk", "Adam", "Janek", "Szymon", "Mikołaj", "Olaf", "Wojtek", "Matuesz", "Oskar", "Daniel"};

//LISTY ZMIENIAJĄCE SIE
        ArrayList<Object> posiadaneSamochody= new ArrayList();
        ArrayList potKlienci= new ArrayList();
        ArrayList samochoduDoKupienia= new ArrayList();
        ArrayList hisNapraw= new ArrayList();
        ArrayList hisTranzakcji= new ArrayList();



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
        Customer customer1;
        customer1 = new Customer();
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
        potKlienci.add(customer1);









//TWORZENIE SAMOCHODU

        Car car1;
        car1 = new Car();
        numerek = random.nextInt(5);
        car1.marka = markisamo[numerek];
        numerek = random.nextInt(5);
        car1.kolor = kolorsamo[numerek];
        car1.przebieg = p1;
        car1.segment = segmentsamo[numerek1];
        posiadaneSamochody.add(car1);

        //różne wartosći samochodów dla każdej z marki w zależności od segmentu

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

        //Mnożnik do cen naprawiania samochodu
        if (car1.marka == markisamo[2]) {
            car1.mnoznikCeny=3;
        }else if(car1.marka==markisamo[0]||car1.marka==markisamo[1]){
            car1.mnoznikCeny=2;
        }else{
            car1.mnoznikCeny=1;
        }


        System.out.println(car1.toString());

        System.out.println(customer1.toString());

        Car sam = new Car();

        sam.setMarka(markisamo[numerek]);
        sam.setSegment(segmentsamo[numerek1]);
        sam.setKolor(markisamo[numerek]);
        sam.setPrzebieg(p1);
        posiadaneSamochody.add(sam);


//OPCJE UŻYTKOWNIKA
        int liczbaTur=0;

boolean menuLoop=true;
do {

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
    System.out.println("testowanie tur gracza trzeba schować i dacan koniec"+liczbaTur);
    System.out.println("WPISZ NUMER ABY WYBRAĆ OPCJE");
    int x = scanner.nextInt();
    switch (x) {
        case 1://pokazuje samochody do kupienia
            for(int liczba=0; liczba<samochoduDoKupienia.size();liczba++){
                System.out.println(liczba+1 +"." +samochoduDoKupienia.get(liczba));

                break;
            }

        case 2://kupuje samochody
            for(int liczba=0; liczba<samochoduDoKupienia.size();liczba++){
                System.out.println(liczba+1 +"." +samochoduDoKupienia.get(liczba));



break;
            }

        case 3:
            //pokazuje posiadane samochody
            for(int liczba=0; liczba<posiadaneSamochody.size();liczba++){
                System.out.println(liczba+1 +"." +posiadaneSamochody.get(liczba));
            }
            break;

        case 4:
            //pokazuje i naprawia samochody+tura lub wraca do menu
            System.out.println("");
            System.out.println("Który samochód chciałbyś naprawić?");

            for(int liczba=0; liczba<posiadaneSamochody.size();liczba++){
                System.out.println(liczba+1 +"." +posiadaneSamochody.get(liczba));
            }


            System.out.println("Co chciałbyś naprawić?");
            System.out.println("");
            System.out.println("1.Hamulce, podniosą wartość auta o 10% - koszt to " + 200 * car1.mnoznikCeny + " złotych.");
            System.out.println("2.Zawieszenie, podniesie wartość auta o 20% - koszt to " + 600 * car1.mnoznikCeny + "złotych.");
            System.out.println("3.Silnik, podniesie wartość auta o 100% - koszt to " + 3000 * car1.mnoznikCeny + "złotych.");
            System.out.println("4.Karoseria, podniesie wartość auta o 50% - koszt to " + 1500 * car1.mnoznikCeny + "złotych.");
            System.out.println("5.Skrzynia biegów, podniesie wartość auta o 50% - koszt to " + 1500 * car1.mnoznikCeny + "złotych.");
            System.out.println("6.Powrót.");
            int naprawa = scanner.nextInt();
            switch (naprawa) {
                case 1:
                    //usuwanie kassy

                    //pomnozenie wartosci samochodu
                    liczbaTur+=1;break;
                case 2:
                    //dodanie tury
                    liczbaTur+=1;break;
                case 3:
                    liczbaTur+=1;break;
                case 4:
                    liczbaTur+=1;break;
                case 5:
                    liczbaTur+=1;break;
                case 6://cofnij do menu


                }

            break;

        case 5:
            System.out.println(potKlienci);



        case 6:
            //dodaje ture

            liczbaTur+=1;break;
        case 7:
            System.out.println("Którą reklame chcesz kupić");
            System.out.println("");
            System.out.println("1.Reklama w lokalnej gazecie- 1000złotych.");
            System.out.println("2.Reklama w internecie- 200złotych.");
            System.out.println("3.Powrót");
            int z = scanner.nextInt();
            switch (z){
                case 1:
                //dodać 2 nowych klientów
                player.kasa-=1000;
                liczbaTur+=1;
                System.out.println("Kupiłeś reklame w lokalnej gazecie. Przyszło 2 nowych klientów.");break;
                case 2:
                    liczbaTur+=1;
                int szansa = random.nextInt(2);
                if (szansa == 1) {
                    System.out.println("Kupiłes reklame w internecie. Pozyskałeś nowego klienta.");
                    player.kasa-=200;
                    //dodać i klienta
                } else {
                    System.out.println("Kupiłes reklame w internecie. Niestety nie pozyskałeś żadnego nowego klienta.");
                    player.kasa-=200;

                }break;
                case 3:
                break;


            }break;



        case 8:
            System.out.println("Stan konta wynosi " + player.kasa + " złotych.");break;

        case 9:
//historia tranzakcji

        case 10:


        case 11:


    }
}while(menuLoop=true);

    }
    
}