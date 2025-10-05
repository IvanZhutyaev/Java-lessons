package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        FileWriter fw=new FileWriter("sample2.txt");
        fw.close();

        FileReader fr=new FileReader("sample2.txt");
        fr.close();
    }
}
