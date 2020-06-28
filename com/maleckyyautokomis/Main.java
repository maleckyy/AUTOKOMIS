package com.maleckyyautokomis;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Player player = new Player();
        player.kasa = 20000.00;
        int mycia;


//INTRO GIERKI
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w swoim nowym komisie samochodowym, mam nadzieje że zostało Ci jeszcze troche kasy po kupnie tej nieruchomości.");
        System.out.println("bo przydałoby sie jeszze kupić samochochody bo w koncu czymś musisz handlować.");
        System.out.println("Ale gdzie moje maniery...");
        System.out.println("Jak sie nazywasz?");
        player.playerName = scanner.nextLine();



        System.out.println("Witaj " + player.playerName.substring(0, 1).toUpperCase() + player.playerName.substring(1) + " widze że zostało ci " + player.kasa + " złoty na koncie, to rozsądna ilość kaski żeby zaczać handlować");
        System.out.println("Zostało mi życzyć ci powodzenia, do dzieła!");


//DO SAMOCHODÓW
    String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};

    String kolorsamo[] = {"Czerwony", "Czarny", "Szary", "Niebieski", "Żółty"};

    String segmentsamo[] = {"Premium", "Standard", "Budget"};

//IMIONa KLIENTÓW ,jest ich 15.
    String klientName[] = {"Paweł", "Marcin", "Roman", "Rysiek", "Michał", "Patryk", "Adam", "Janek", "Szymon", "Mikołaj", "Olaf", "Wojtek", "Matuesz", "Oskar", "Daniel"};

//LISTY
    ArrayList<Car>posiadaneSamochody = new ArrayList<Car>();
    ArrayList<Customer> potKlienci = new ArrayList<Customer>();
    ArrayList<Car>samochoduDoKupienia = new ArrayList<Car>();
    ArrayList hisNapraw = new ArrayList();
    ArrayList<Car> hisTranzakcjiKupno = new ArrayList<Car>();
    ArrayList<Car>hisTranzakcjiSprzedarz = new ArrayList<Car>();

    ArrayList <Car>samochody = new ArrayList<Car>();
    ArrayList <Customer>klienci = new ArrayList<Customer>();
    ArrayList <Mechanicy>mechanicy = new ArrayList<Mechanicy>();


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

    c4 = random.nextInt(40000) + 15000;

    //GENERATOR PRZEBIEGÓW
    int p1 = random.nextInt(100000) + 100000;

//mechanicy
        Mechanicy janusz=new Mechanicy();
        janusz.imie="Janusz";
        janusz.cenaMechanika=1000;

        Mechanicy marian=new Mechanicy();
        marian.imie="Marian";
        marian.skutecznosc=random.nextInt(10);
        marian.cenaMechanika=600;


        Mechanicy adrian=new Mechanicy();
        adrian.imie="Adrian";
        adrian.skutecznosc=random.nextInt(10);
        adrian.cenaMechanika=400;
//dokonczyc

        mechanicy.add(0,janusz);
        mechanicy.add(1,marian);
        mechanicy.add(2,adrian);

    //TWORZENIE KLIENTA
        Customer customer1 = new Customer();
        customer1.favMarka1=markisamo[4];
        customer1.kasaKlienta=17392;
        potKlienci.add(customer1);

        Customer customer2 = new Customer();
        customer2.favMarka1=markisamo[3];
        potKlienci.add(customer2);

        Customer customer3 = new Customer();
        klienci.add(customer3);

        Customer customer4 = new Customer();
        klienci.add(customer4);

        Customer customer5 = new Customer();
        klienci.add(customer5);

        Customer customer6 = new Customer();
        klienci.add(customer6);

        Customer customer7 = new Customer();
        klienci.add(customer7);

        Customer customer8 = new Customer();
        klienci.add(customer8);

        Customer customer9 = new Customer();
        klienci.add(customer9);

        Customer customer10 = new Customer();
        klienci.add(customer10);

        Customer customer11 = new Customer();
        klienci.add(customer11);

        Customer customer12 = new Customer();
        klienci.add(customer12);

        Customer customer13 = new Customer();
        klienci.add(customer13);

        Customer customer14 = new Customer();
        klienci.add(customer14);

        Customer customer15 = new Customer();
        klienci.add(customer15);

        Customer customer16 = new Customer();
        klienci.add(customer16);

        Customer customer17 = new Customer();
        klienci.add(customer17);
//3 startowe samochody
        Car pierwszy =new Car();
        pierwszy.marka=markisamo[4];
        pierwszy.wartosc=c2;
        pierwszy.segment=segmentsamo[2];
        pierwszy.dostawcza=false;
        pierwszy.wartosc=random.nextInt(8000)+8000;


        c2 = random.nextInt(10000) + 15000;

        Car drugi =new Car();
        drugi.marka=markisamo[4];
        drugi.wartosc=c2;
        drugi.segment=segmentsamo[1];
        drugi.dostawcza=false;


        c2 = random.nextInt(10000) + 15000;

        Car trzeci =new Car();
        trzeci.marka=markisamo[3];
        trzeci.wartosc=c2;
        trzeci.segment=segmentsamo[2];
        trzeci.dostawcza=false;

        samochoduDoKupienia.add(pierwszy);
        samochoduDoKupienia.add(drugi);
        samochoduDoKupienia.add(trzeci);


//TWORZENIE SAMOCHODU Z KONSTRUKTORa

        Car oktan =new Car();
        samochody.add(oktan);

        Car oktan1 =new Car();
        samochody.add(oktan1);

        Car oktan2 =new Car();
        samochody.add(oktan2);

        Car oktan3 =new Car();
        samochody.add(oktan3);

        Car oktan4 =new Car();
        samochody.add(oktan4);

        Car oktan5 =new Car();
        samochody.add(oktan5);

        Car oktan6 =new Car();
        samochody.add(oktan6);

        Car oktan7 =new Car();
        samochody.add(oktan7);

        Car oktan8 =new Car();
        samochody.add(oktan8);

        Car oktan9 =new Car();
        samochody.add(oktan9);

        Car oktan10 =new Car();
        samochody.add(oktan10);

        Car oktan11 =new Car();
        samochody.add(oktan11);

        Car oktan12 =new Car();
        samochody.add(oktan12);

        Car oktan13 =new Car();
        samochody.add(oktan13);

        Car oktan14 =new Car();
        samochody.add(oktan14);
//OPCJE UŻYTKOWNIKA
            int liczbaTur = 0;

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

                System.out.println("testowanie tur gracza trzeba schować i dacan koniec " + liczbaTur);

                System.out.println(" ");
                System.out.println("WPISZ NUMER ABY WYBRAĆ OPCJE");
                int x = scanner.nextInt();
                System.out.println(" ");
                switch (x) {
                    case 1://pokazuje samochody do kupienia
                        for (int i = 0; i < samochoduDoKupienia.size();i++) {

                            System.out.println(i+1  + "."+samochoduDoKupienia.get(i));


                        }break;

                    case 2://kupuje samochody
                        for (int i = 0; i < samochoduDoKupienia.size(); i++) {
                            System.out.println(i + 1 + "." + samochoduDoKupienia.get(i));

                        }
                        System.out.println("");
                        System.out.println("Który samochod chcesz kupić?");
                        System.out.println("");
                        int wyborKupna=scanner.nextInt();
                        if(wyborKupna<=samochoduDoKupienia.size()) {
                            if (player.kasa > samochoduDoKupienia.get(wyborKupna - 1).getWartosc()) {
                                System.out.println("Kupiłeś " + samochoduDoKupienia.get(wyborKupna - 1).kupny());
                                player.kasa -=40+ (samochoduDoKupienia.get(wyborKupna - 1).getWartosc())*1.02;
                            //    samochoduDoKupienia.get(wyborKupna - 1).setLiczbaMyc(samochoduDoKupienia.get(wyborKupna - 1).getLiczbaMyc() + 1);
                                samochoduDoKupienia.get(wyborKupna - 1).liczbaMyc++;
                                posiadaneSamochody.add(samochoduDoKupienia.get(wyborKupna - 1));
                                hisTranzakcjiKupno.add(samochoduDoKupienia.get(wyborKupna - 1));
                                samochoduDoKupienia.remove(wyborKupna - 1);
                                samochoduDoKupienia.add(samochody.get(0));
                                samochody.remove(0);
                                samochoduDoKupienia.add(samochody.get(0));
                                samochody.remove(0);

                                liczbaTur++;

                            }else{
                                System.out.println("Nie masz tyle pieniędzy by kupić pojazd.");
                            }
                        }else{
                            System.out.println("Nie ma takiego samochodu.");
                        }

                        break;

                    case 3:
                        //pokazuje posiadane samochody
                        for (int i = 0; i < posiadaneSamochody.size(); i++) {

                            System.out.println(i + 1 + "." + posiadaneSamochody.get(i));
                        }
                        break;

                    case 4:
                        //pokazuje i naprawia samochody+tura lub wraca do menu

                        if (posiadaneSamochody.size()==0){
                            System.out.println("Nie masz żadnego samochodu.Kup jakiś żeby go naprawić.");
                            break;


                        }else {
                            System.out.println("Do jakiego mechanika chcesz sie udać?");
                            System.out.println("");
                            System.out.println("1. Janusz- drogi ale zawsze zrobi jak trzeba- " + janusz.cenaMechanika);
                            System.out.println("2. Marian- ceny zwyczajne ale czasem nie wyjdzie i Janusz bedzie musiał pomagać- " + marian.cenaMechanika);
                            System.out.println("3. Adrian- tania robota ale jak zepsuje to twoja strata- " + adrian.cenaMechanika);

                            int wybormechanika = scanner.nextInt();
//wybranie mechanika
                            System.out.println("");
                            System.out.println("Który samochód chciałbyś naprawić?");

                            for (int liczba = 0; liczba < posiadaneSamochody.size(); liczba++) {
                                System.out.println(liczba + 1 + "." + posiadaneSamochody.get(liczba));
                                System.out.println(" ");
                               if(posiadaneSamochody.get(liczba).sprawnosc==true){
                                   System.out.println("Ten samochod jest w pełni sprawny");
                                   System.out.println("");
                               }else {

                                   System.out.println("Sprawności elementów pojazdu.(sprawne=true)");
                                   System.out.println("            Hamulce: " + posiadaneSamochody.get(liczba).hamulce);
                                   System.out.println("            Zawieszenie: " + posiadaneSamochody.get(liczba).zawieszenie);
                                   System.out.println("            Silnik: " + posiadaneSamochody.get(liczba).silnik);
                                   System.out.println("            Karoseria: " + posiadaneSamochody.get(liczba).karoseria);
                                   System.out.println("            Skrzynia biegów: " + posiadaneSamochody.get(liczba).skrzyniaBiegow);
                                   if (posiadaneSamochody.get(liczba).dostawcza == true) {
                                       System.out.println("            Pojemność ładunkowa: " + posiadaneSamochody.get(liczba).pladunkowa);
                                   }
                               }
                            }

                            int wyborSamochoduDoNaprawy = scanner.nextInt();
//wybranie samochodu do naprawy
//warianty cen
                            if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sprawnosc==true){
                                System.out.println("Ten samochod jest sprawny nie ma czego naprawiać.");
                            }else{
                                double cenahamulce, cenazawieszenie, cenasilnik, cenakaroseria, cenaskrzynia;
                                cenahamulce = (200 * posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getMnoznikCeny()) + mechanicy.get(wybormechanika - 1).cenaMechanika;
                                cenazawieszenie = (600 * posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getMnoznikCeny()) + mechanicy.get(wybormechanika - 1).cenaMechanika;
                                cenasilnik = (3000 * posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getMnoznikCeny()) + mechanicy.get(wybormechanika - 1).cenaMechanika;
                                cenakaroseria = (1500 * posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getMnoznikCeny()) + mechanicy.get(wybormechanika - 1).cenaMechanika;
                                cenaskrzynia = (1500 * posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getMnoznikCeny()) + mechanicy.get(wybormechanika - 1).cenaMechanika;

                                ArrayList<Double> cennik = new ArrayList<Double>();
                                cennik.add(cenahamulce);
                                cennik.add(cenazawieszenie);
                                cennik.add(cenasilnik);
                                cennik.add(cenakaroseria);
                                cennik.add(cenaskrzynia);



                                System.out.println("Co chciałbyś naprawić?");
                                System.out.println("");
                                System.out.println("1.Hamulce, podniosą wartość auta o 10% - koszt to " + cenahamulce + " złotych.");
                                System.out.println("2.Zawieszenie, podniesie wartość auta o 20% - koszt to " + cenazawieszenie + "złotych.");
                                System.out.println("3.Silnik, podniesie wartość auta o 100% - koszt to " + cenasilnik + "złotych.");
                                System.out.println("4.Karoseria, podniesie wartość auta o 50% - koszt to " + cenakaroseria + "złotych.");
                                System.out.println("5.Skrzynia biegów, podniesie wartość auta o 50% - koszt to " + cenaskrzynia + "złotych.");
                                System.out.println("6.Powrót.");
                                int naprawa = scanner.nextInt();
//wybor czesci do naprawy
                                if (player.kasa < cennik.get(naprawa - 1)) {
                                    System.out.println("Nie masz wystarczająco pieniędzy na naprawe tego elementu.");
                                } else {
                                    //hamulce
                                    if(naprawa==1){
                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).hamulce==true){
                                            System.out.println("Ten element jest sprawny");
                                        }else {
                                            if (wybormechanika == 1) {
                                                //janusz
                                                System.out.println("Naprawa wyniosła $" + cenahamulce);
                                                double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.1;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                liczbaTur++;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                            } else if (wybormechanika == 2) {
                                                //marian
                                                int skutecznosc = random.nextInt(10);
                                                double cenahamulce1 = cenahamulce + 400;
                                                if (skutecznosc == 3) {
                                                    if (player.kasa > cenahamulce1) {

                                                        System.out.println("Naprawa poszła pomyślnie ale z pomocą Janusza, potrzebna była dopłata " +
                                                                "w wysokości 400$.Całkowita naprawa wyniosła $" + cenahamulce1);
                                                        double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.1;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).hamulce=true;
                                                        hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                        liczbaTur++;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;
                                                    } else {
                                                        System.out.println("Marianowi nie udało sie naprawić samemu twojego pojazdu" +
                                                                ", potrzebował pomocy Janusza ale nie stać cie na taki wydatek");
                                                        System.out.println("Samochoód nie został naprawiony i przepadły ci pieniądze.");
                                                        player.kasa -= cenahamulce;
                                                    }
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenahamulce);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.1;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenahamulce;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).hamulce=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;
                                                }

                                            } else {
                                                //adrian
                                                int skutecznos = random.nextInt(10);
                                                if (skutecznos == 2 || skutecznos == 5) {
                                                    System.out.println("Auta nie udało sie naprawić, kasa przepadła.");
                                                    player.kasa -= cenahamulce;
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenahamulce);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.1;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenahamulce;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).hamulce=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                                    int szansazepsucia = random.nextInt(100);
                                                    if (szansazepsucia == 53 || szansazepsucia == 11) {
                                                        //zepsucie innej czesci w poblizu naprawianej czesci
                                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).zawieszenie==true){
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).zawieszenie=false;
                                                            System.out.println("Niestety Adrian uszkodził przy tym zawieszenie.");
                                                        }else if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).karoseria==true) {
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).karoseria = false;
                                                            System.out.println("Niestety Ardian porysował przy tym karoserie");
                                                        }else{
                                                            System.out.println("");
                                                        }

                                                    }


                                                }
                                            }
                                        }
                                    }else if(naprawa==2){
                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).zawieszenie==true){
                                            System.out.println("Ten element jest sprawny");
                                        }else {
                                            if (wybormechanika == 1) {
                                                //janusz
                                                System.out.println("Naprawa wyniosła $" + cenazawieszenie);
                                                double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.2;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).zawieszenie=true;
                                                hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                liczbaTur++;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                            } else if (wybormechanika == 2) {
                                                //marian
                                                int skutecznosc = random.nextInt(10);
                                                double cenazawieszenie1 = cenazawieszenie + 400;
                                                if (skutecznosc == 3) {
                                                    if (player.kasa > cenazawieszenie1) {

                                                        System.out.println("Naprawa poszła pomyślnie ale z pomocą Janusza, potrzebna była dopłata " +
                                                                "w wysokości 400$.Całkowita naprawa wyniosła $" + cenazawieszenie1);
                                                        double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.2;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).zawieszenie=true;
                                                        hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                        liczbaTur++;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;
                                                    } else {
                                                        System.out.println("Marianowi nie udało sie naprawić samemu twojego pojazdu" +
                                                                ", potrzebował pomocy Janusza ale nie stać cie na taki wydatek");
                                                        System.out.println("Samochoód nie został naprawiony i przepadły ci pieniądze.");
                                                        player.kasa -= cenazawieszenie;
                                                    }
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenazawieszenie);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.2;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenazawieszenie;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).zawieszenie=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;
                                                }

                                            } else {
                                                //adrian
                                                int skutecznos = random.nextInt(10);
                                                if (skutecznos == 2 || skutecznos == 5) {
                                                    System.out.println("Auta nie udało sie naprawić, kasa przepadła.");
                                                    player.kasa -= cenazawieszenie;
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenazawieszenie);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.2;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenazawieszenie;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).zawieszenie=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                                    int szansazepsucia = random.nextInt(100);
                                                    if (szansazepsucia == 53 || szansazepsucia == 11) {
                                                        //zepsucie innej czesci w poblizu naprawianej czesci
                                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).hamulce==true){
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).hamulce=false;
                                                            System.out.println("Niestety Adrian uszkodził przy tym zawieszenie.");
                                                        }else if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).skrzyniaBiegow==true) {
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).skrzyniaBiegow= false;
                                                            System.out.println("Niestety Ardian porysował przy tym karoserie");
                                                        }

                                                    }


                                                }
                                            }
                                        }


                                    }else if (naprawa==3){
                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).silnik==true){
                                            System.out.println("Ten element jest sprawny");
                                        }else {
                                            if (wybormechanika == 1) {
                                                //janusz
                                                System.out.println("Naprawa wyniosła $" + cenasilnik);
                                                double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 2;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).silnik=true;
                                                hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                liczbaTur++;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;


                                            } else if (wybormechanika == 2) {
                                                //marian
                                                int skutecznosc = random.nextInt(10);
                                                double cenasilnik1 = cenasilnik + 400;
                                                if (skutecznosc == 3) {
                                                    if (player.kasa > cenasilnik1) {

                                                        System.out.println("Naprawa poszła pomyślnie ale z pomocą Janusza, potrzebna była dopłata " +
                                                                "w wysokości 400$.Całkowita naprawa wyniosła $" + cenasilnik1);
                                                        double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 2;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).silnik=true;
                                                        hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                        liczbaTur++;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                                    } else {
                                                        System.out.println("Marianowi nie udało sie naprawić samemu twojego pojazdu" +
                                                                ", potrzebował pomocy Janusza ale nie stać cie na taki wydatek");
                                                        System.out.println("Samochoód nie został naprawiony i przepadły ci pieniądze.");
                                                        player.kasa -= cenasilnik;
                                                    }
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenasilnik);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 2;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenasilnik;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).silnik=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;
                                                }

                                            } else {
                                                //adrian
                                                int skutecznos = random.nextInt(10);
                                                if (skutecznos == 2 || skutecznos == 5) {
                                                    System.out.println("Auta nie udało sie naprawić, kasa przepadła.");
                                                    player.kasa -= cenasilnik;
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenasilnik);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 2;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenasilnik;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).silnik=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                                    int szansazepsucia = random.nextInt(100);
                                                    if (szansazepsucia == 53 || szansazepsucia == 11) {
                                                        //zepsucie innej czesci w poblizu naprawianej czesci
                                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).skrzyniaBiegow==true){
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).skrzyniaBiegow=false;
                                                            System.out.println("Niestety Adrian uszkodził przy tym skrzynie biegów.");
                                                        }else if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).zawieszenie==true) {
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).zawieszenie=false;
                                                            System.out.println("Niestety Ardian uszkodził przy tym zawieszenie");
                                                        }

                                                    }


                                                }
                                            }
                                        }

                                    }else if(naprawa==4){
                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).karoseria==true){
                                            System.out.println("Ten element jest sprawny");
                                        }else {
                                            if (wybormechanika == 1) {
                                                //janusz
                                                System.out.println("Naprawa wyniosła $" + cenakaroseria);
                                                double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.5;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).karoseria=true;
                                                hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                liczbaTur++;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;


                                            } else if (wybormechanika == 2) {
                                                //marian
                                                int skutecznosc = random.nextInt(10);
                                                double cenakaroseria1 = cenakaroseria + 400;
                                                if (skutecznosc == 3) {
                                                    if (player.kasa > cenakaroseria1) {

                                                        System.out.println("Naprawa poszła pomyślnie ale z pomocą Janusza, potrzebna była dopłata " +
                                                                "w wysokości 400$.Całkowita naprawa wyniosła $" + cenakaroseria1);
                                                        double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.5;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).karoseria=true;
                                                        hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                        liczbaTur++;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;
                                                    } else {
                                                        System.out.println("Marianowi nie udało sie naprawić samemu twojego pojazdu" +
                                                                ", potrzebował pomocy Janusza ale nie stać cie na taki wydatek");
                                                        System.out.println("Samochoód nie został naprawiony i przepadły ci pieniądze.");
                                                        player.kasa -= cenakaroseria;
                                                    }
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenakaroseria);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.5;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenakaroseria;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).karoseria=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;
                                                }

                                            } else {
                                                //adrian
                                                int skutecznos = random.nextInt(10);
                                                if (skutecznos == 2 || skutecznos == 5) {
                                                    System.out.println("Auta nie udało sie naprawić, kasa przepadła.");
                                                    player.kasa -= cenakaroseria;
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenakaroseria);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.5;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenakaroseria;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).karoseria=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                                    int szansazepsucia = random.nextInt(100);
                                                    if (szansazepsucia == 53 || szansazepsucia == 11) {
                                                        //zepsucie innej czesci w poblizu naprawianej czesci
                                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).hamulce==true){
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).hamulce=false;
                                                            System.out.println("Niestety Adrian uszkodził przy tym hamulce.");
                                                        }else if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).zawieszenie==true) {
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).zawieszenie = false;
                                                            System.out.println("Niestety Ardian porysował przy tym zawieszenie");
                                                        }

                                                    }


                                                }
                                            }
                                        }


                                    }else if (naprawa==5){
                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).skrzyniaBiegow==true){
                                            System.out.println("Ten element jest sprawny");
                                        }else {
                                            if (wybormechanika == 1) {
                                                //janusz
                                                System.out.println("Naprawa wyniosła $" + cenaskrzynia);
                                                double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.5;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).skrzyniaBiegow=true;
                                                hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                liczbaTur++;
                                                posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;


                                            } else if (wybormechanika == 2) {
                                                //marian
                                                int skutecznosc = random.nextInt(10);
                                                double cenaskrzynia1 = cenaskrzynia + 400;
                                                if (skutecznosc == 3) {
                                                    if (player.kasa > cenaskrzynia1) {

                                                        System.out.println("Naprawa poszła pomyślnie ale z pomocą Janusza, potrzebna była dopłata " +
                                                                "w wysokości 400$.Całkowita naprawa wyniosła $" + cenaskrzynia1);
                                                        double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.5;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).skrzyniaBiegow=true;
                                                        hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                        liczbaTur++;
                                                        posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                                    } else {
                                                        System.out.println("Marianowi nie udało sie naprawić samemu twojego pojazdu" +
                                                                ", potrzebował pomocy Janusza ale nie stać cie na taki wydatek");
                                                        System.out.println("Samochoód nie został naprawiony i przepadły ci pieniądze.");
                                                        player.kasa -= cenaskrzynia;
                                                    }
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenaskrzynia);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.5;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenasilnik;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).skrzyniaBiegow=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;
                                                }

                                            } else {
                                                //adrian
                                                int skutecznos = random.nextInt(10);
                                                if (skutecznos == 2 || skutecznos == 5) {
                                                    System.out.println("Auta nie udało sie naprawić, kasa przepadła.");
                                                    player.kasa -= cenaskrzynia;
                                                } else {
                                                    System.out.println("Naprawa wyniosła $" + cenaskrzynia);
                                                    double nowaCena = posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).getWartosc() * 1.5;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).setWartosc(nowaCena);
                                                    player.kasa -= cenaskrzynia;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).skrzyniaBiegow=true;
                                                    hisNapraw.add(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1));
                                                    liczbaTur++;
                                                    posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).sumaKosztow+=nowaCena;

                                                    int szansazepsucia = random.nextInt(100);
                                                    if (szansazepsucia == 53 || szansazepsucia == 11) {
                                                        //zepsucie innej czesci w poblizu naprawianej czesci
                                                        if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).silnik==true){
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).silnik=false;
                                                            System.out.println("Niestety Adrian uszkodził przy tym silnik.");
                                                        }else if(posiadaneSamochody.get(wyborSamochoduDoNaprawy-1).zawieszenie==true) {
                                                            posiadaneSamochody.get(wyborSamochoduDoNaprawy - 1).zawieszenie= false;
                                                            System.out.println("Niestety Ardian porysował przy tym zawieszenie");
                                                        }

                                                    }


                                                }
                                            }
                                        }
                                    }else{
                                        System.out.println("Nie ma takiej części");
                                    }
                                }
                            }
                        }
                        break;

                    case 5:
                        for (int i = 0; i < potKlienci.size(); i++) {
                            System.out.println(i + 1 + "." + potKlienci.get(i));

                        }
                        break;

                    case 6:
                        if(posiadaneSamochody.size()==0){System.out.println("Nie posiadasz żadnego samochodu");}
                        else if(posiadaneSamochody.size()>0){
                            for (int i = 0; i < posiadaneSamochody.size(); i++) {
                                System.out.println(i + 1 + "." + posiadaneSamochody.get(i));
                            }
                            System.out.println("Ktory samochód chcesz sprzedać?");
                            int wyborSprzedania=scanner.nextInt();
                            System.out.println(" ");
                            System.out.println("Któremu klientowi chcesz sprzedać samcohód?");
                            for (int i = 0; i < potKlienci.size(); i++) {
                                System.out.println(i + 1 + "." + potKlienci.get(i));

                            }
                            int wyborKlienta=scanner.nextInt();



                            if(posiadaneSamochody.get(wyborSprzedania-1).getMarka()==potKlienci.get(wyborKlienta-1).favMarka1||
                                    posiadaneSamochody.get(wyborSprzedania-1).getMarka()==potKlienci.get(wyborKlienta-1).favMarka2){
                                if(potKlienci.get(wyborKlienta-1).kasaKlienta<posiadaneSamochody.get(wyborSprzedania-1).getWartosc()){
                                    System.out.println("Klient nie ma tyle gotówki aby kupić ten pojazd.");
                                }else {
                                    System.out.println("Sprzedałeś " + posiadaneSamochody.get(wyborSprzedania - 1).getKolor() + " "
                                            + posiadaneSamochody.get(wyborSprzedania - 1).getMarka()
                                            + " klientowi " + potKlienci.get(wyborKlienta - 1).customerName + " za $"
                                            + posiadaneSamochody.get(wyborSprzedania - 1).getWartosc());

                                    double cenaPodateMycie = posiadaneSamochody.get(wyborSprzedania - 1).getWartosc() -
                                            40 - (posiadaneSamochody.get(wyborSprzedania - 1).getWartosc()) * 0.02;

                                    player.kasa += cenaPodateMycie;
                                    posiadaneSamochody.get(wyborSprzedania - 1).liczbaMyc++;
                                    System.out.println("Po odliczeniu podatku i umyciu samochodu zarobiłeś $" + cenaPodateMycie);
                                    hisTranzakcjiSprzedarz.add(posiadaneSamochody.get(wyborSprzedania - 1));
                                    posiadaneSamochody.remove(wyborSprzedania - 1);
                                    potKlienci.add(klienci.get(0));
                                    klienci.remove(0);
                                    potKlienci.add(klienci.get(0));
                                    klienci.remove(0);
                                    potKlienci.remove(wyborKlienta - 1);

                                }
                            }else{
                                System.out.println("Klient nie lubi tej marki, spróbuj z innym.");
                            }
                        }





//sprzedawanie samochodu

                        liczbaTur++;
                        break;
                    case 7:
                        System.out.println("Którą reklame chcesz kupić");
                        System.out.println("");
                        System.out.println("1.Reklama w lokalnej gazecie- 1000złotych.");
                        System.out.println("2.Reklama w internecie- 200złotych.");
                        System.out.println("3.Powrót");
                        int z = scanner.nextInt();
                        switch (z) {
                            case 1:
                                int szansa = random.nextInt(2)+1;
                                player.kasa -= 1000;
                                liczbaTur += 1;
                                int nowiklienci;
                                if(szansa==1){
                                    nowiklienci=2;
                                }else if(szansa==2){
                                    nowiklienci=3;
                                }else{
                                    nowiklienci=4;
                                }
                               for(int i=0;i<nowiklienci;i++){
                                   potKlienci.add(klienci.get(0));
                                   klienci.remove(0);
                               }

                                System.out.println("Kupiłeś reklame w lokalnej gazecie. Przyszło "+nowiklienci+" nowych klientów.");
                                break;
                            case 2:
                                liczbaTur += 1;

                                    System.out.println("Kupiłes reklame w internecie. Pozyskałeś nowego klienta.");
                                    player.kasa -= 200;
                                    potKlienci.add(klienci.get(0));
                                    klienci.remove(0);

                                break;
                            case 3:
                                break;


                        }
                        break;


                    case 8:
                        System.out.println("Stan konta wynosi " + player.kasa + " złotych.");
                        break;

                    case 9:
                        System.out.println("HISTORIA KUPNA AUT.");
                        for(int i=0;i<hisTranzakcjiKupno.size();i++){
                            System.out.println(i+1+".Kupiono "+hisTranzakcjiKupno.get(i));}
                        System.out.println("HISTORIA SPRZEDARZY AUT");
                        for(int i=0;i<hisTranzakcjiSprzedarz.size();i++){
                            System.out.println(i+1+".Sprzedano "+hisTranzakcjiSprzedarz.get(i));}
//historia tranzakcji
break;
                    case 10:
                        for(int i=0;i<samochody.size();i++){
                        System.out.println(i+1+" "+samochody.get(i));}
break;
                    case 11:
                        for(int i=0;i<posiadaneSamochody.size();i++){
                            System.out.println(i+1+" "+posiadaneSamochody.get(i).liczbaMyc);}
                        break;

                    default:
                        System.out.println("Nie ma takiego numeru...jeszcze raz");
                }
            } while (player.kasa < 40000);
            System.out.println(liczbaTur);
//intro tutaj

        }



}

    

