package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        enum Country{
            CANADA("CAD"), POLAND("PLN"), GERMANY("GER"), PARAGVAI;
            String currency;
            Country(String currency){
                this.currency=currency;
            }

            Country(){}
            boolean hasCurrency(){
                return currency!=null;
            }
        }
        for (Country country:Country.values())
            if(country.hasCurrency()){
                System.out.println(country+" has currency, "+country.currency);

            }else {
                System.out.println(country+" has NOT currency, "+country.currency+" LOL");

            }
    }
}
