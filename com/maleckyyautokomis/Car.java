package com.maleckyyautokomis;

import java.util.Random;

public class Car {


public String carName;
    public int wartosc;
    public String marka;
    public int przebieg;
    public String kolor;
    public String segment;
    public int mnoznikCeny;//do naprawiania samochodów

    //dodać info o tym czy fura dostawcza
    public boolean dostawcza;


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        int kolejnaLiczba = 0;
        this.carName = "Car "+kolejnaLiczba;
        kolejnaLiczba++;
    }


    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public String getMarka() {
        this.marka=marka;
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public int getWartosc() {
        return wartosc;
    }
    public String toString(){
        String samochodInfo =getKolor()+" "+ getMarka() +" w wersji "+ getSegment()+" z przebiegiem "+getPrzebieg()+" o wartości "+ getWartosc();
        return samochodInfo;
    }


    public void carMaker() {

        Random random = new Random();
        int c1, c2, c3, c4;//c1 tania(fiat opel),c2 srednia(volvo bmw) c3 droga(merc), c4 to kasa klienta
        c1 = random.nextInt(7000) + 5000;

        c2 = random.nextInt(10000) + 15000;

        c3 = random.nextInt(20000) + 27000;


        int numerek;
        int numerek1;
        int numerek2;
        numerek = random.nextInt(5);//do samochdów i kolorów
        numerek1 = random.nextInt(3);//do segmentów

        String markisamo1[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};

        String kolorsamo1[] = {"Czerwony", "Czarny", "Szary", "Niebieski", "Żółty"};

        String segmentsamo1[] = {"Premium", "Standard", "Budget"};

        int p1 = random.nextInt(100000) + 100000;









/*
    //lista elementów samochodu
    public int hamulce;
    public int zawieszenie;
    public int silnik;
    public int karoseria;
    public int skrzyniaBiegow;


*/


    }
}
