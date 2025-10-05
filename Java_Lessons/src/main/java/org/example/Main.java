package org.example;

import java.util.Scanner;

public class Main {


    public static void GetFromUserAndWrite() throws Exception {
        Scanner scan=new Scanner(System.in);
        String result=scan.nextLine();
        FileWriter fw = new FileWriter("file.txt");
        fw.write(result);
        fw.close();

    }
    public static void GetFromFileAndWriteToNewFile() throws Exception {
        FileReader reader=new FileReader("file.txt");
        Scanner scan=new Scanner(reader);
        if(scan.hasNextLine()){
            FileWriter writer=new FileWriter("file1.txt");
            writer.write(scan.nextLine());
            writer.close();
        }
        reader.close();

    }
    public static void main(String[] args) throws Exception {
        GetFromUserAndWrite();
        GetFromFileAndWriteToNewFile();
    }
}
