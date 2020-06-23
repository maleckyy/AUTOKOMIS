package com.maleckyyautokomis;

import javax.swing.text.html.HTMLEditorKit;
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



        System.out.println("Witaj " + player.playerName.substring(0, 1).toUpperCase() + player.playerName.substring(1) + " widze że zostało ci " + player.kasa + " złoty na koncie, to rozsądna ilość kaski żeby zaczać handlować");
        System.out.println("Zostało mi życzyć ci powodzenia, do dzieła!");


//DO SAMOCHODÓW
    String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};

    String kolorsamo[] = {"Czerwony", "Czarny", "Szary", "Niebieski", "Żółty"};

    String segmentsamo[] = {"Premium", "Standard", "Budget"};

//IMIONa KLIENTÓW ,jest ich 15.
    String klientName[] = {"Paweł", "Marcin", "Roman", "Rysiek", "Michał", "Patryk", "Adam", "Janek", "Szymon", "Mikołaj", "Olaf", "Wojtek", "Matuesz", "Oskar", "Daniel"};

//LISTY ZMIENIAJĄCE SIE
    ArrayList posiadaneSamochody = new ArrayList();
    ArrayList potKlienci = new ArrayList();
    ArrayList samochoduDoKupienia = new ArrayList();
    ArrayList hisNapraw = new ArrayList();
    ArrayList hisTranzakcji = new ArrayList();

    ArrayList samochody = new ArrayList();
    ArrayList klienci = new ArrayList();

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
        klienci.add(customer1);

        Customer customer2 = new Customer();
        klienci.add(customer2);

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
        System.out.println(pierwszy+"to ten kdsaodacncans ");

        c2 = random.nextInt(10000) + 15000;

        Car drugi =new Car();
        drugi.marka=markisamo[4];
        drugi.wartosc=c2;
        drugi.segment=segmentsamo[1];
        System.out.println(drugi+"to ten kdsaodacncans ");

        c2 = random.nextInt(10000) + 15000;

        Car trzeci =new Car();
        trzeci.marka=markisamo[3];
        trzeci.wartosc=c2;
        trzeci.segment=segmentsamo[2];
        System.out.println(trzeci+"to ten kdsaodacncans ");
        samochoduDoKupienia.add(pierwszy);
        samochoduDoKupienia.add(drugi);
        samochoduDoKupienia.add(trzeci);


//TWORZENIE SAMOCHODU Z KONSTRUKTORA

        System.out.println(customer1.toString());

        Car oktan =new Car();
        System.out.println(oktan);
        samochody.add(oktan);

        Car oktan1 =new Car();
        System.out.println(oktan1);
        samochody.add(oktan1);

        Car oktan2 =new Car();
        System.out.println(oktan2);
        samochody.add(oktan2);

        Car oktan3 =new Car();
        System.out.println(oktan3);
        samochody.add(oktan3);

        Car oktan4 =new Car();
        System.out.println(oktan4);
        samochody.add(oktan4);

        Car oktan5 =new Car();
        System.out.println(oktan5);
        samochody.add(oktan5);

        Car oktan6 =new Car();
        System.out.println(oktan6);
        samochody.add(oktan6);

        Car oktan7 =new Car();
        System.out.println(oktan7);
        samochody.add(oktan7);

        Car oktan8 =new Car();
        System.out.println(oktan8);
        samochody.add(oktan8);

        Car oktan9 =new Car();
        System.out.println(oktan9);
        samochody.add(oktan9);

        Car oktan10 =new Car();
        System.out.println(oktan10);
        samochody.add(oktan10);

        Car oktan11 =new Car();
        System.out.println(oktan11);
        samochody.add(oktan11);

        Car oktan12 =new Car();
        System.out.println(oktan12);
        samochody.add(oktan12);

        Car oktan13 =new Car();
        System.out.println(oktan13);
        samochody.add(oktan13);

        Car oktan14 =new Car();
        System.out.println(oktan14);
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



                        }break;

                    case 3:
                        //pokazuje posiadane samochody
                        for (int i = 0; i < posiadaneSamochody.size(); i++) {

                            System.out.println(i + 1 + "." + posiadaneSamochody.get(i));
                        }
                        break;

                    case 4:
                        //pokazuje i naprawia samochody+tura lub wraca do menu
                        System.out.println("");
                        System.out.println("Który samochód chciałbyś naprawić?");

                        for (int liczba = 0; liczba < posiadaneSamochody.size(); liczba++) {
                            System.out.println(liczba + 1 + "." + posiadaneSamochody.get(liczba));
                        }


                  System.out.println("Co chciałbyś naprawić?");
                        System.out.println("");
                 /*       System.out.println("1.Hamulce, podniosą wartość auta o 10% - koszt to " + 200 * car1.mnoznikCeny + " złotych.");
                        System.out.println("2.Zawieszenie, podniesie wartość auta o 20% - koszt to " + 600 * car1.mnoznikCeny + "złotych.");
                        System.out.println("3.Silnik, podniesie wartość auta o 100% - koszt to " + 3000 * car1.mnoznikCeny + "złotych.");
                        System.out.println("4.Karoseria, podniesie wartość auta o 50% - koszt to " + 1500 * car1.mnoznikCeny + "złotych.");
                        System.out.println("5.Skrzynia biegów, podniesie wartość auta o 50% - koszt to " + 1500 * car1.mnoznikCeny + "złotych.");
                        System.out.println("6.Powrót.");*/
                        int naprawa = scanner.nextInt();
                        switch (naprawa) {
                            case 1:
                                //usuwanie kassy

                                //pomnozenie wartosci samochodu
                                liczbaTur += 1;
                                break;
                            case 2:
                                //dodanie tury
                                liczbaTur += 1;
                                break;
                            case 3:
                                liczbaTur += 1;
                                break;
                            case 4:
                                liczbaTur += 1;
                                break;
                            case 5:
                                liczbaTur += 1;
                                break;
                            case 6:break;


                        }

                        break;

                    case 5:
                        System.out.println(potKlienci);


                    case 6:
                        //dodaje ture
//sprzedawanie samochodu

                        liczbaTur += 1;
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
                                //dodać 2 nowych klientów
                                player.kasa -= 1000;
                                liczbaTur += 1;

                                System.out.println("Kupiłeś reklame w lokalnej gazecie. Przyszło 2 nowych klientów.");
                                break;
                            case 2:
                                liczbaTur += 1;
                                int szansa = random.nextInt(2);
                                if (szansa == 1) {
                                    System.out.println("Kupiłes reklame w internecie. Pozyskałeś nowego klienta.");
                                    player.kasa -= 200;
                                    //dodać i klienta
                                } else {
                                    System.out.println("Kupiłes reklame w internecie. Niestety nie pozyskałeś żadnego nowego klienta.");
                                    player.kasa -= 200;

                                }
                                break;
                            case 3:
                                break;


                        }
                        break;


                    case 8:
                        System.out.println("Stan konta wynosi " + player.kasa + " złotych.");
                        break;

                    case 9:posiadaneSamochody.add(samochody.get(0));
                    samochody.remove(0);
//historia tranzakcji
break;
                    case 10:
                        for(int i=0;i<samochody.size();i++){
                        System.out.println(i+1+" "+samochody.get(i));}
break;
                    case 11:
                        player.kasa+=22000;
                        System.out.println(player.kasa+" masz i wygRAŁDS");
                        break;

                    default:
                        System.out.println("Nie ma takiego numeru...jeszcze raz");
                }
            } while (player.kasa < 40000);
            System.out.println(liczbaTur);


        }



}

    

