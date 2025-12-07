package org.example;

import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("USA");
        h.add("India");
        h.add("Russia");
        h.add("USA");
        System.out.println(h);
        System.out.println("List contains USA or not:" +h.contains("USA"));

        h.remove("India");
        System.out.println("List after removing India:" +h);
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while ((i.hasNext()))
            System.out.println(i.next());

    }
}

