package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//            Adress dom_toma = new Adress("Дом Пушкина");
//            Person tom = new Person("Tom", dom_toma);
//            System.out.println(tom.toString());
        Map<Employee, Integer> salary = new HashMap<>();
        Employee employee=new Employee("Vasya", 123);
        Employee employee1=new Employee("Vasya", 123);
        salary.put(employee1, 1);
        salary.put(employee,2);
        System.out.println(salary.get(employee));
        System.out.println(salary.get(employee1));
        System.out.println(employee1.equals(employee));
    }
//        record Adress(String adress){}
//        record Person(String name, Adress Adress){
//            @Override
//            public String toString() {
//                return String.format("%s живёт в %s", name, Adress.adress);
//            }
//        }

    record Employee(String name, int id){}
}

