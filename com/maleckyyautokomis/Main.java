package com.maleckyyautokomis;

import javax.swing.text.html.HTMLEditorKit;
import java.io.Console;
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

//LISTY
    ArrayList<Car>posiadaneSamochody = new ArrayList<Car>();
    ArrayList<Customer> potKlienci = new ArrayList<Customer>();
    ArrayList<Car>samochoduDoKupienia = new ArrayList<Car>();
    ArrayList hisNapraw = new ArrayList();
    ArrayList hisTranzakcji = new ArrayList();

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
        if(marian.skutecznosc==4){
            //pomoc janusza
            marian.cenaMechanika=900;
        }else{
            marian.cenaMechanika=600;
        }

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
                        System.out.println("Wybierz numer od 1 do "+ samochoduDoKupienia.size());
                        int wyborKupna=scanner.nextInt();
                        if(wyborKupna<=samochoduDoKupienia.size()) {
                            if (player.kasa > samochoduDoKupienia.get(wyborKupna - 1).getWartosc()) {
                                System.out.println("Kupiłeś " + samochoduDoKupienia.get(wyborKupna - 1).kupny());
                                player.kasa -= samochoduDoKupienia.get(wyborKupna - 1).getWartosc();
                                posiadaneSamochody.add(samochoduDoKupienia.get(wyborKupna - 1));
                                samochoduDoKupienia.remove(wyborKupna - 1);
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
                        System.out.println("Do jakiego mechanika chcesz sie udać?");
                        System.out.println("");
                        System.out.println("1. Janusz- drogi ale zawsze zrobi jak trzeba- "+ janusz.cenaMechanika);
                        System.out.println("2. Marian- ceny zwyczajne ale czasem nie wyjdzie i Janusz bedzie musiał pomagać- "+marian.cenaMechanika);
                        System.out.println("3. Adrian- tania robota ale jak zepsuje to twoja strata- "+adrian.cenaMechanika);
                        int wybormechanika=scanner.nextInt();

                        System.out.println("");
                        System.out.println("Który samochód chciałbyś naprawić?");

                        for (int liczba = 0; liczba < posiadaneSamochody.size(); liczba++) {
                            System.out.println(liczba + 1 + "." + posiadaneSamochody.get(liczba));
                        }
                        int wyborNaprawy=scanner.nextInt();

                        int czynnikNaprawy=posiadaneSamochody.get(wyborNaprawy-1).getMnoznikCeny()+mechanicy.get(wybormechanika).cenaMechanika;

                        int cenahamulce,cenazawieszenie,cenasilnik,cenakaroseria,cenaskrzynia;
                        cenahamulce=(200*posiadaneSamochody.get(wyborNaprawy-1).getMnoznikCeny())+mechanicy.get(wybormechanika).cenaMechanika;
                        cenazawieszenie=(600*posiadaneSamochody.get(wyborNaprawy-1).getMnoznikCeny())+mechanicy.get(wybormechanika).cenaMechanika;
                        cenasilnik=(3000*posiadaneSamochody.get(wyborNaprawy-1).getMnoznikCeny())+mechanicy.get(wybormechanika).cenaMechanika;
                        cenakaroseria=(1500*posiadaneSamochody.get(wyborNaprawy-1).getMnoznikCeny())+mechanicy.get(wybormechanika).cenaMechanika;
                        cenaskrzynia=(1500*posiadaneSamochody.get(wyborNaprawy-1).getMnoznikCeny())+mechanicy.get(wybormechanika).cenaMechanika;


                  System.out.println("Co chciałbyś naprawić?");
                        System.out.println("");
                        System.out.println("1.Hamulce, podniosą wartość auta o 10% - koszt to " + cenahamulce+ " złotych.");
                        System.out.println("2.Zawieszenie, podniesie wartość auta o 20% - koszt to " + cenazawieszenie+ "złotych.");
                        System.out.println("3.Silnik, podniesie wartość auta o 100% - koszt to " + cenasilnik + "złotych.");
                        System.out.println("4.Karoseria, podniesie wartość auta o 50% - koszt to " + cenakaroseria + "złotych.");
                        System.out.println("5.Skrzynia biegów, podniesie wartość auta o 50% - koszt to " +cenaskrzynia + "złotych.");
                        System.out.println("6.Powrót.");
                        int naprawa = scanner.nextInt();
                        switch (naprawa) {
                            case 1:
                                if(player.kasa>cenahamulce){
                                    System.out.println("Naprawiłeś "+posiadaneSamochody.get(wyborNaprawy-1).kupny()+" i zapłaciłeś "+cenahamulce);
                                player.kasa-=cenahamulce;
                                double nowaCena=posiadaneSamochody.get(wyborNaprawy-1).getWartosc()*1.1;
                                    posiadaneSamochody.get(wyborNaprawy-1).setWartosc(nowaCena);
                                    System.out.println(posiadaneSamochody.get(wyborNaprawy-1));
                                }else{

                            }


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
                        for (int i = 0; i < potKlienci.size(); i++) {
                            System.out.println(i + 1 + "." + potKlienci.get(i));

                        }
                        break;

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
                                potKlienci.add(klienci.get(0));
                                klienci.remove(0);

                                potKlienci.add(klienci.get(0));
                                klienci.remove(0);

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
                                    potKlienci.add(klienci.get(0));
                                    klienci.remove(0);
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

                    case 9:


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

    

