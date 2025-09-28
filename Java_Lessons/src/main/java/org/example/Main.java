package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            int[]numbers=new int[3];
            numbers[4]=45;
            System.out.println(numbers[4]);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Программа завршена");
    }
}
