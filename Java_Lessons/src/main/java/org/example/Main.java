package org.example;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("ABRAM STORY", "ABRAAAAM");
        b1.print();
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