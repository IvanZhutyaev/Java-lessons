package org.example;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("Поместить("+a+")");
        System.out.println("Стек: "+st);
    }
    static void showpop(Stack st){
        System.out.println("Выкинуть -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Стек: "+st);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("Стек: "+st);
        showpush(st,42);
        showpush(st,69);
        showpush(st,99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e){
            System.out.println("Пустой стек");
        }
    }
}

