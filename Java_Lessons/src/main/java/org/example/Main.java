package org.example;

import java.util.Scanner;

public class Main {
    enum Country{
        CANADA("CAD"), POLAND("PLN"), GERMANY("GER");
        String currency;
        Country(String currency){
            this.currency=currency;
        }

        Country(){}

    }

    public static void main(String[] args) {
        for (Country country:Country.values())
            System.out.println(country+", "+country.currency);
    }
}
