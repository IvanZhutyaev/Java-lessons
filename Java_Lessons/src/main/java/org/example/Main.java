package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n=s.nextLine(); //строка, которую проверяют
        String a= "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; //регулярное выражение
        Pattern pattern =Pattern.compile(a);
        Matcher matcher = pattern.matcher(n);
        System.out.println(matcher.matches());
    }
}
