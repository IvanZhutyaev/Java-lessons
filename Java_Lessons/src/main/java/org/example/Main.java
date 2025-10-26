package org.example;
public class Main {
    public static void main(String[] args) {
        Plane plane=new Plane();
        plane.Takedown();
        plane.Takeoff();

        Golub golub=new Golub();
        golub.Takedown();
        golub.Takeoff();
    }
    interface Flyable{
        void Takeoff();
        void Takedown();
    }
    static class Golub implements Flyable{
        public void Takeoff() {
            System.out.println("ГОК-ГОК ВЗЛЕТАЮ");
        }

        public void Takedown() {
            System.out.println("ГОК-ГОК МЫ ПАДАЕМ");
        }
    }
    static class Plane implements Flyable{
        public void Takeoff() {
            System.out.println("ВЗЛЕТАЕМ!");
        }
        public void Takedown() {
            System.out.println("Срочная посадка");
        }
    }
}