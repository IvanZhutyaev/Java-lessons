package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        FileWriter fw = new FileWriter("file.txt");
        for (int i = 1;i<101;i++)
        {
            fw.write(i + "\n");
        }
        fw.close();
        FileReader fr=new FileReader("file.txt");
        Scanner scan=new Scanner(fr);
        int i =1;
        while (scan.hasNextLine()){
            System.out.println(i+":"+scan.nextLine());
            i++;
        }
        fr.close();
    }
}
