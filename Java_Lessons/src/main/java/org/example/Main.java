package org.example;

public class Main {
    public static void main(String[] args) {
        Printable printable = new Book("Java.Complete Reference", "ABRAM");
        printable.print();
        printable=new Journal("POLICY");
        printable.print();
        Journal j1=new Journal("SDD");
        j1.print();
        Printable.read();

    }


    interface Printable{
        default void print(){
            System.out.println("aaa");
        };
        static void read(){
            System.out.println("READ");
        }
    }
    static class Book implements Printable{
        String name;
        String author;
        Book(String name, String author){
            this.name=name;
            this.author=author;
        }
        public void print(){
            System.out.println(name+author);
        }
    }

    static class Journal implements Printable{
        private String name;
        String getName(){
            return name;
        }
        Journal(String name){
            this.name=name;
        }

    }
    static void read(Printable p){
        p.print();
    }
    static Printable createPrintable(String name, boolean option){
        if(option){
            return new Book(name, "aaa");
        }
        else {
            return new Journal(name);
        }
    }
}
