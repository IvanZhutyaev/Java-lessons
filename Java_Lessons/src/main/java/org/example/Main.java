package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if(a==0){
                throw new Exception();
            }

        }
        catch (InputMismatchException ex){
            System.out.println("Буквы вводить нельзя!");
        }
        catch (Exception ex){
            System.out.println("0 вводить нельзя!");
        }
    }
}
