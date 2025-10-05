package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        enum Enum{
            SUMMER(30),
            WINTER(-20),
            FALL(15),
            SPRING(20);
            int avgTemp;
            Enum(int avgTemp){
                this.avgTemp=avgTemp;
            }
        }
        for (Enum val:Enum.values()){
            System.out.println(val.name()+" , "+val.avgTemp);
        }

        enum Role { ADMIN, MODERATOR, USER, GUEST;
            void getPermissions()
            {

                switch (this){
                    case ADMIN -> System.out.println("полный доступ");
                    case MODERATOR -> System.out.println("управление контентом");
                    case USER -> System.out.println("чтение и комментриование");
                    case GUEST -> System.out.println("только чтение");

                }

            }

        }
        for (Role role:Role.values()){
            role.getPermissions();
        }

        enum Operation{
            PLUS,
            MINUS,
            MULTIPLY,
            DIVIDE;

            void apply(double a, double b){
                double result=0;
                switch (this){
                    case PLUS -> {
                        result=a+b;
                    }
                    case MINUS -> result=a-b;
                    case MULTIPLY -> result=a*b;
                    case DIVIDE -> result=a/b;
                }
                System.out.println(result);
            }
        }
        Operation plus=Operation.PLUS;
        plus.apply(5,6);
    }
}
