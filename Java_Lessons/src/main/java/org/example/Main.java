package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text="Fifa will never regret it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word:words){
            System.out.println(word);
        }
    }
}
