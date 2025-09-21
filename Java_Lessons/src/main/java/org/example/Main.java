package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("bob");
        Matcher matcher= pattern.matcher("aboba aboba aboba");
        while(matcher.find()) //ищет любое совпадение
            System.out.println(matcher.group()); // bob bob bob(группирует ответ)
    }
}
