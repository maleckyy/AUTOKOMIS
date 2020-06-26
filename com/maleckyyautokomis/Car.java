package com.maleckyyautokomis;

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


        int losDostawczy= random.nextInt(5);
        if(losDostawczy==3){
            //fira dostawcza
            setDostawcza(true);
            marka=markisamo[numerek];
            kolor=kolorsamo[numerek];
            segment=segmentsamo[1];
            przebieg=p1;
            pladunkowa=random.nextInt(8)+2;


        }else{
            setDostawcza(false);
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


    }

    String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};

    String kolorsamo[] = {"Czerwony", "Czarny", "Szary", "Niebieski", "Żółty"};

    String segmentsamo[] = {"Premium", "Standard", "Budget"};


    public String carName;
    public double wartosc;
    public String marka;
    public int przebieg;
    public String kolor;
    public String segment;
    public int mnoznikCeny;//do naprawiania samochodów

    //dodać info o tym czy fura dostawcza
    public boolean dostawcza;
    public int pladunkowa;




    public String getCarName() {
        return carName;
    }

    public String getMarka() {
        this.marka = marka;
        return marka;
    }

    public void setMarka(String marka) {

       this.marka=marka;

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
        this.kolor=kolor;

    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public double getWartosc() {
        return wartosc;
    }

    public String toString() {
        if(dostawcza==true){
            String samochodInfo ="Dostawczy "+ getKolor() + " " + getMarka() + " w wersji " + getSegment() + " z przebiegiem " + getPrzebieg() + " o wartości $"
                    + getWartosc()+" o przestrzeni ładunkowej " +pladunkowa;
        return samochodInfo;
        }else {
            String samochodInfo =getKolor() + " " + getMarka() + " w wersji " + getSegment() + " z przebiegiem " + getPrzebieg() + " o wartości $" + getWartosc();
        return samochodInfo;
        }
    }
    public String kupny(){
        String kupne= getKolor()+" "+getMarka()+" w wersji "+getSegment();

 return kupne;   }


    public int getMnoznikCeny() {
        return mnoznikCeny;
    }

    public void setMnoznikCeny(int mnoznikCeny) {
        this.mnoznikCeny = mnoznikCeny;
    }

    public void setWartosc(double wartosc) {
        this.wartosc=wartosc;

    }

    public boolean isDostawcza() {
        return dostawcza;
    }

    public void setDostawcza(boolean dostawcza) {
        this.dostawcza = dostawcza;
    }
}