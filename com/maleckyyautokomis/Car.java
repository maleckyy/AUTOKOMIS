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
            pladunkowa=random.nextInt(7)+3;
            if(pladunkowa <5){
                wartosc=c2;
            }else{
                wartosc=c3;
            }
            mnoznikCeny=1;
            int losElementow=random.nextInt(2)+1;
            if(losElementow==1){
                hamulce=false;
            }else{hamulce=true;}
            losElementow=random.nextInt(6)+1;
            if(losElementow==3){
                zawieszenie=false;
            }else{zawieszenie=true;}
            if(zawieszenie==true){silnik=false;}else{silnik=true;}


            if(losElementow==6){
                karoseria=false;
            }else{karoseria=true;}

            losElementow=random.nextInt(11)+1;

            if(karoseria==true){skrzyniaBiegow=false;}else{skrzyniaBiegow=true;}

            if(hamulce==true&&zawieszenie==true&&silnik==true&&karoseria==true&&skrzyniaBiegow==true){
                sprawnosc=true;
            }
            
        }else{
            setDostawcza(false);
            marka=markisamo[numerek];
            kolor=kolorsamo[numerek];
            segment=segmentsamo[numerek1];
            przebieg=p1;
            int losElementow=random.nextInt(2)+1;
            if(losElementow==1){
                hamulce=false;
            }else{hamulce=true;}
            losElementow=random.nextInt(6)+1;
            if(losElementow==3){
                zawieszenie=false;
            }else{zawieszenie=true;}
            if(zawieszenie==true){silnik=false;}else{silnik=true;}


            if(losElementow==6){
                karoseria=false;
            }else{karoseria=true;}

            losElementow=random.nextInt(11)+1;

            if(karoseria==true){skrzyniaBiegow=false;}else{skrzyniaBiegow=true;}

            if(hamulce==true&&zawieszenie==true&&silnik==true&&karoseria==true&&skrzyniaBiegow==true){
                sprawnosc=true;
            }


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


    private String naprawaHamulce="";
    private String naprawaZawieszenie="";
    private String naprawaSilnik="";
    private String naprawaKaroseria="";
    private String naprawaSkrzynia="";
    public double wartosc;
    public double wartoscK;
    public String marka;
    public int przebieg;
    public String kolor;
    public String segment;
    public int liczbaMyc;
    public double sumaKosztow;
    public double mnoznikCeny;//do naprawiania samochodów
    public boolean hamulce;
    public boolean zawieszenie;
    public boolean silnik;
    public boolean karoseria;
    public boolean skrzyniaBiegow;
    public boolean sprawnosc;

    //dodać info o tym czy fura dostawcza
    public boolean dostawcza;
    private int pladunkowa;


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
        if(sprawnosc==true){
            if(dostawcza==true){
                String samochodInfo ="Sprawny dostawczy "+ getKolor() + " " + getMarka() + " w wersji " + getSegment() + " z przebiegiem " + getPrzebieg() + " o wartości $"
                        + getWartosc()+" o przestrzeni ładunkowej " + getPladunkowa();
                return samochodInfo;
            }else {
                String samochodInfo ="Sprawny "+getKolor() + " " + getMarka() + " w wersji " + getSegment() + " z przebiegiem " + getPrzebieg() + " o wartości $" + getWartosc();
                return samochodInfo;
            }
        }else{
            if(dostawcza==true){
                String samochodInfo ="Dostawczy "+ getKolor() + " " + getMarka() + " w wersji " + getSegment() + " z przebiegiem " + getPrzebieg() + " o wartości $"
                        + getWartosc()+" o przestrzeni ładunkowej " + getPladunkowa();
                return samochodInfo;
            }else {
                String samochodInfo =getKolor() + " " + getMarka() + " w wersji " + getSegment() + " z przebiegiem " + getPrzebieg() + " o wartości $" + getWartosc();
                return samochodInfo;
            }
        }

    }
    public String kupny(){
        String kupne= getKolor()+" "+getMarka()+" w wersji "+getSegment();
        return kupne;   }

        public String hisKupna(){

            String samochodInfo =getKolor() + " " + getMarka() + " w wersji " + getSegment() + " z przebiegiem " + getPrzebieg() + " o wartości $" + getWartoscK();
            return samochodInfo;
        }

        public String historiaNapraw(){
            String hisNapraw="W "+getKolor() + " " + getMarka() +" było naprawiane: "+getNaprawaHamulce()+" "+getNaprawaZawieszenie()+" "+getNaprawaSilnik()+" "+getNaprawaKaroseria()+" "+getNaprawaSkrzynia();
return hisNapraw;
        }


    public double getMnoznikCeny() {
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

    public int getLiczbaMyc() {
        return liczbaMyc;
    }

    public void setLiczbaMyc(int liczbaMyc) {
        this.liczbaMyc = liczbaMyc;
    }

    public double getSumaKosztow() {
        return sumaKosztow;
    }

    public void setSumaKosztow(double sumaKosztow) {
        this.sumaKosztow = sumaKosztow;
    }

    public double getWartoscK() {
        return wartoscK;
    }

    public void setWartoscK(double wartoscK) {
        this.wartoscK = wartoscK;
    }

    public String getNaprawaHamulce() {
        return naprawaHamulce;
    }

    public void setNaprawaHamulce(String naprawaHamulce) {
        this.naprawaHamulce = naprawaHamulce;
    }

    public String getNaprawaZawieszenie() {
        return naprawaZawieszenie;
    }

    public void setNaprawaZawieszenie(String naprawaZawieszenie) {
        this.naprawaZawieszenie = naprawaZawieszenie;
    }

    public String getNaprawaSilnik() {
        return naprawaSilnik;
    }

    public void setNaprawaSilnik(String naprawaSilnik) {
        this.naprawaSilnik = naprawaSilnik;
    }

    public String getNaprawaKaroseria() {
        return naprawaKaroseria;
    }

    public void setNaprawaKaroseria(String naprawaKaroseria) {
        this.naprawaKaroseria = naprawaKaroseria;
    }

    public String getNaprawaSkrzynia() {
        return naprawaSkrzynia;
    }

    public void setNaprawaSkrzynia(String naprawaSkrzynia) {
        this.naprawaSkrzynia = naprawaSkrzynia;
    }

    public int getPladunkowa() {
        return pladunkowa;
    }

    public void setPladunkowa(int pladunkowa) {
        this.pladunkowa = pladunkowa;
    }
}