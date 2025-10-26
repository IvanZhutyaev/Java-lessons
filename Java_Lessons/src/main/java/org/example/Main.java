package org.example;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("ABRAM STORY", "ABRAAAAM");
        b1.print();
        Journal j1=new Journal("ABRAAAAAAAAM");
        j1.print();
    }
}

interface Printable{
    void print();
}
class Book implements Printable{
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

class Journal implements Printable{
    private String name;
    String getName(){
        return name;
    }
    Journal(String name){
        this.name=name;
    }
    public void print(){
        System.out.println(name);
    }
}