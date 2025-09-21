package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("bob");
        Matcher matcher= pattern.matcher("bob1");
        System.out.println(matcher.find()); //true (ищет любое совпадение)

        System.out.println(matcher.matches()); //false (смотрит в общем всю строку)
    }
}
