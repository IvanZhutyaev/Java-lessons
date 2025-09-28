package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int x=in.nextInt();
            if(x>=30){
                throw new Exception("Число x должно быть меньше 30!");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}
