package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[]numbers=new int[3];
        try{

            numbers[6]=45;
            numbers[6]=Integer.parseInt("gdf");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
        }
        catch (NumberFormatException ex){
            System.out.println("Ошибка преобразования из строки в число");
        }
        System.out.println("Программа завршена");
    }
}
