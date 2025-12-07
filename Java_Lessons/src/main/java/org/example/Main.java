package org.example;
import com.sun.source.tree.Tree;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap<>();
        tm.put("Заря", new Double(3434.34));
        tm.put("Абрам", new Double(36734.34));
        tm.put("Миша", new Double(376934.34));
        Set set = tm.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = ((Double)tm.get("Заря")).doubleValue();
        tm.put("Заря", new Double(balance+1000));
        System.out.println("Новый баланс Зари: "+tm.get("Заря"));
    }
}
