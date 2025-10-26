package org.example;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle(3.8);
        Shape rectangle=new Rectangle(2.7, 4.6);
        Shape triangle=new Triangle(4.5, 3.6);
        circle.Area();
        rectangle.Area();
        triangle.Area();
    }

    interface Shape{
        void Area();
    }

    static class Circle implements Shape{
        double p=3.14;
        double r;
        double S;
        Circle(double r){
            this.r=r;
        }
        public void Area() {
            S=p*(r*r);
            System.out.println(S);
        }
    }
    static class Triangle implements Shape{
        double a;
        double h;
        double S;
        Triangle(double a, double h){
            this.a=a;
            this.h=h;
        }
        public void Area() {
            S=(0.5*h*a);
            System.out.println(S);
        }
    }
    static class Rectangle implements Shape{
        double a;
        double b;
        double S;
        Rectangle(double a, double b){
            this.b=b;
            this.a=a;
        }
        public void Area() {
            S=a*b;
            System.out.println(S);
        }
    }
}