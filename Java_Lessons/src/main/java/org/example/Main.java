package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            System.out.printf("%d", i);
        }
        System.out.println();
        int j=6;
        while(j>0){
            System.out.print(j);
            j--;
        }
        System.out.println();
        int l=7;
        do{
            System.out.print(l);
            l--;
        }
        while (l>0);
        System.out.println();
        int[] array = new int[]{1,2,3,4,5};
        for(int i : array) {
            System.out.print(i);
        }
    }


}
