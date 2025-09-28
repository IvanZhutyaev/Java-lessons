package org.example;

import java.util.Scanner;

public class Main {
    static int func(int a){

        String b=Integer.toString(a);
        int result=b.length();
        return result;
    }
    static int[] func1(int[] mas){
        for (int i=0;i<5;i++){
            Random random=new Random();
            int a=random.nextInt();
            mas[i]=a;
        }
        return mas;
    }

    static String func3(int a){
        String result=Integer.toBinaryString(a);
        return result;
    }
    public static void main(String[] args) {
        //1
//        int a=func(999868769);
//        System.out.println(a);

        //2
//        int[] mas=new int[5];
//        int[] result=func1(mas);
//        for(int i:result){
//            System.out.println(i);
//        }

        //3
//        int a=5;
//        String result=func3(a);
//        System.out.println(result);
    }
}
