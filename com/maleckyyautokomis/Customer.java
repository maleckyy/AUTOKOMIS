package com.maleckyyautokomis;

public class Customer {
        public String customerName;
        public int kasaKlienta;
        public boolean sprawne;//czy samochod w pełni sprawny
    //ulubione marki
        public String favMarka1;
        public String favMarka2;

        public String toString(){
            return customerName+" ma "+kasaKlienta+" a jego ulubione marki to "+favMarka1+" i "+favMarka2+".";
        }
}
