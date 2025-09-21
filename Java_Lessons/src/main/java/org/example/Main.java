package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nums[]=new int[10000];
        Random rand=new Random();
        for(int i=0;i<10000;i++){
            int num=rand.nextInt(10000);
            nums[i]=num;
        }
        for(int num:nums){
            System.out.println(num);
        }
    }
}
