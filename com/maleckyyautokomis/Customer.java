package com.maleckyyautokomis;

import java.awt.*;
import java.util.Random;

public class Customer {
        public String customerName;
        public double   kasaKlienta;
        public boolean sprawne;//czy samochod w pełni sprawny
    public boolean lubiDostawcze;
    //ulubione marki
        public String favMarka1;
        public String favMarka2;

    String klientName[] = {"Paweł", "Marcin", "Roman", "Rysiek", "Michał", "Patryk", "Adam", "Janek", "Szymon", "Mikołaj", "Olaf", "Wojtek", "Matuesz", "Oskar", "Daniel"};
    String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};


    public Customer(){
            Random random =new Random();
        int    c4 = random.nextInt(35000) + 20000;
       int numerek = random.nextInt(5);//do samochdów i kolorów
     int   numerek2 = random.nextInt(15);//do klientów
            customerName=klientName[numerek2];
            kasaKlienta=c4;
            favMarka1=markisamo[numerek];
                                numerek = random.nextInt(5);
            favMarka2=markisamo[numerek];
        if(favMarka1==favMarka2){
            while(favMarka1 != favMarka2){
                numerek = random.nextInt(5);
                favMarka2=markisamo[numerek];
            }

        }
        numerek = random.nextInt(5);
        if(numerek==2){
            lubiDostawcze=true;
        }else{
            lubiDostawcze=false;
        }
        numerek = random.nextInt(5);
        if(numerek==2){
            sprawne=true;
        }else{
            sprawne=false;}

        }

        public String toString(){
        if(sprawne==true){
            if(lubiDostawcze==false) {
                String a= customerName + " ma $" + kasaKlienta + " a jego ulubione marki to sprawne " + favMarka1 + " i " + favMarka2 + ".";
                return a;
            }else{
                String a= customerName + " ma $" + kasaKlienta + " a jego ulubione marki to sprawne dostawcze " + favMarka1 + " i " + favMarka2 + ".";
                return a;
            }
        }else{
            if(lubiDostawcze==false) {
                String a= customerName + " ma $" + kasaKlienta + " a jego ulubione marki to " + favMarka1 + " i " + favMarka2 + ".";
                return a;
            }else{
                String a= customerName + " ma $" + kasaKlienta + " a jego ulubione marki to dostawcze " + favMarka1 + " i " + favMarka2 + ".";
                return a;
            }
        }



        }

}
