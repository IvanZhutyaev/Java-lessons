package org.example;
public class Main {
    public static void main(String[] args) {
        Adress dom_toma = new Adress("Дом Пушкина");
        Person tom = new Person("Tom", dom_toma);
        System.out.println(tom.toString());
    }
    record Adress(String adress){}
    record Person(String name, Adress Adress){
        @Override
        public String toString() {
            return String.format("%s живёт в %s", name, Adress.adress);
        }
    }
}

