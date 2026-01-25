package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> a=new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
        Optional<Integer> max = a.stream().max(Integer::compareTo);
        System.out.println(max.orElse(0));
        max.ifPresent(v-> System.out.println(v));
        Optional<Integer> max1 = a.stream().max(Integer::compareTo);
        System.out.println(max1.map(v->"Max:"+v).get());

        //2
        List<User> users = new ArrayList<>();
        User ivan = new User("Ivan", true);
        User vova = new User("Vova", false);
        users.addAll(Arrays.asList(new User[]{ivan,vova}));

        System.out.println(users.stream().filter(as->as.active==true).findFirst().map(h->"Login:"+h.login).orElse("Defolt"));
    }
    static class User {
        String login;
        boolean active;
        public User(String login, boolean active){
            this.login=login;
            this.active=active;
        }
    }
}