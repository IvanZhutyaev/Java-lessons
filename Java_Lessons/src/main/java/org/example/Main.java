package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        FileWriter fw=new FileWriter("sample2.txt");
        for (int i=1;i<101;i++){

            fw.write(Integer.toString(i)+"\n");
        }

        fw.close();

        FileReader fr=new FileReader("sample2.txt");
        fr.close();
    }
}
