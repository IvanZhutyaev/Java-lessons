package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        enum Country{
            CANADA("CAD"){
                @Override
                void sayHello(){
                    System.out.println("Hello");
                }
            },
            POLAND("PLN"){
                @Override
                void sayHello(){
                    System.out.println("nindfowsniofdn");
                }
            },
            GERMANY("EUR"){
                @Override
                void sayHello(){
                    System.out.println("HAI");
                }
            },
            LAOPARAS{
                @Override
                void sayHello(){
                    System.out.println("POshel na mateshy");
                }
            },
            ZIMKABU(){
                @Override
                void sayHello(){
                    System.out.println("Shakalaka");
                }
            };
            String currency;
            Country(String currency){
                this.currency=currency;
            }

            Country(){}
            boolean hasCurrency(){
                return currency!=null;
            }
            abstract void sayHello();
        }
        for (Country country:Country.values())
            if(country.hasCurrency()){
                System.out.println(country+" has currency, "+country.currency);

            }else {
                System.out.println(country+" has NOT currency, "+country.currency+" LOL");

            }
        System.out.println();
        for (Country country:Country.values())
            country.sayHello();
    }
}
