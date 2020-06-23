package com.maleckyyautokomis;

import java.awt.*;
import java.util.Random;

public class Customer {
        public String customerName;
        public int kasaKlienta;
        public boolean sprawne;//czy samochod w pełni sprawny
    //ulubione marki
        public String favMarka1;
        public String favMarka2;

    String klientName[] = {"Paweł", "Marcin", "Roman", "Rysiek", "Michał", "Patryk", "Adam", "Janek", "Szymon", "Mikołaj", "Olaf", "Wojtek", "Matuesz", "Oskar", "Daniel"};
    String markisamo[] = {"Volvo", "BMW", "Mercedes", "Opel", "Fiat"};


    public Customer(){
            Random random =new Random();
        int    c4 = random.nextInt(45000) + 10000;
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

        }

        public String toString(){
            return customerName+" ma "+kasaKlienta+" a jego ulubione marki to "+favMarka1+" i "+favMarka2+".";
        }
}
