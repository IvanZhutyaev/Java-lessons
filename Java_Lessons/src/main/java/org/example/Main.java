package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите +/-/:/*");
        String a=console.nextLine();
        System.out.println("Введите первое число:");
        float b=console.nextFloat();
        System.out.println("Введите Второе число:");
        float c=console.nextFloat();

        if(a.equals("+")){
            System.out.println(b+c);
        }
        else if(a.equals("-")){
            System.out.println(b-c);
        }
        else if(a.equals("/")){
            System.out.println(b/c);
        }
        else if(a.equals("*")){
            System.out.println(b*c);
        }

    }


}
