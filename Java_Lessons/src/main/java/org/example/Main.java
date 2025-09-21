package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text ="Fifa the best game!";
        Pattern pattern = Pattern.compile("[,|!|.]");
        Matcher matcher = pattern.matcher(text);
        int result=0;
        while(matcher.find()){

            result++;
        }
        System.out.println(result);
    }
}
