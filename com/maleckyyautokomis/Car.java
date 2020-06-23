package com.maleckyyautokomis;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Car {

    public Car(){
        Random random = new Random();
        int  numerek1 = random.nextInt(3);//do segmentów
        int numerek = random.nextInt(5);
        int p1 = random.nextInt(100000) + 100000;
        int c1, c2, c3, c4;//c1 tania(fiat opel),c2 srednia(volvo bmw) c3 droga(merc), c4 to kasa klienta
        c1 = random.nextInt(7000) + 5000;

        c2 = random.nextInt(10000) + 15000;

        c3 = random.nextInt(20000) + 27000;

        marka=markisamo[numerek];
        kolor=kolorsamo[numerek];
        segment=segmentsamo[numerek1];
        przebieg=p1;

        if (marka == markisamo[3] || marka == markisamo[4]) {
            if (segment == segmentsamo[0]) {
                wartosc = c1 + 10000;
            } else if (segment == segmentsamo[1]) {
                wartosc = c1 + 5000;
            } else {
                wartosc = c1;
            }
        } else if (marka == markisamo[0] || marka == markisamo[1]) {
            if (segment == segmentsamo[0]) {
                wartosc = c2 + 10000;
            } else if (segment == segmentsamo[1]) {
                wartosc = c2 + 5000;
            } else {
                wartosc = c2;
            }
        } else {
            if (segment == segmentsamo[0]) {
                wartosc = c3 + 10000;
            } else if (segment == segmentsamo[1]) {
                wartosc = c3 + 5000;
            } else {
                wartosc = c3;
            }
        }
        if (marka == markisamo[2]) {
            mnoznikCeny = 3;
        } else if (marka == markisamo[0] || marka == markisamo[1]) {
            mnoznikCeny = 2;
        } else {
            mnoznikCeny = 1;
        }
    }

    String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};

    String kolorsamo[] = {"Czerwony", "Czarny", "Szary", "Niebieski", "Żółty"};

    String segmentsamo[] = {"Premium", "Standard", "Budget"};


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

    public String getMarka() {
        this.marka = marka;
        return marka;
    }

    public void setMarka(String marka) {

        Random random = new Random();
        int numerek = random.nextInt(5);
        this.setMarka(markisamo[numerek]);
        numerek = random.nextInt(5);



    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        Random random = new Random();
        int p1 = random.nextInt(100000) + 100000;

        this.przebieg = p1;
    }

    public String getKolor() {

        return kolor;
    }

    public void setKolor(String kolor) {
        Random random = new Random();

        int numerek = random.nextInt(5);
        this.setKolor(kolorsamo[numerek]);

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

    public String toString() {
        String samochodInfo = getKolor() + " " + getMarka() + " w wersji " + getSegment() + " z przebiegiem " + getPrzebieg() + " o wartości " + getWartosc();
        return samochodInfo;
    }


    public int getMnoznikCeny() {
        return mnoznikCeny;
    }

    public void setMnoznikCeny(int mnoznikCeny) {
        this.mnoznikCeny = mnoznikCeny;
    }

    public void setWartosc(int wartosc) {


        Random random = new Random();

        int c1, c2, c3, c4;//c1 tania(fiat opel),c2 srednia(volvo bmw) c3 droga(merc), c4 to kasa klienta
        c1 = random.nextInt(7000) + 5000;

        c2 = random.nextInt(10000) + 15000;

        c3 = random.nextInt(20000) + 27000;

        c4 = random.nextInt(45000) + 10000;

        String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};

        String kolorsamo[] = {"Czerwony", "Czarny", "Szary", "Niebieski", "Żółty"};

        String segmentsamo[] = {"Premium", "Standard", "Budget"};


        if (getMarka() == markisamo[3] || getMarka() == markisamo[4]) {
            if (getSegment() == segmentsamo[0]) {
                this.setWartosc(c1 + 10000);
            } else if (getSegment() == segmentsamo[1]) {
                this.setWartosc(c1 + 5000);
            } else {
                this.setWartosc(c1);
            }
        } else if (getMarka() == markisamo[0] || getMarka() == markisamo[1]) {
            if (getSegment() == segmentsamo[0]) {
                this.setWartosc(c2 + 10000);
            } else if (getSegment() == segmentsamo[1]) {
                this.setWartosc(c2 + 5000);
            } else {
                this.setWartosc(c2);
            }
        } else {
            if (getSegment() == segmentsamo[0]) {
                this.setWartosc(c3 + 10000);
            } else if (getSegment() == segmentsamo[1]) {
                this.setWartosc(c3 + 5000);
            } else {
                this.setWartosc(c3);
            }


        }
    }
}