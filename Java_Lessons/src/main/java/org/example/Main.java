package org.example;
public class Main {
    public static class MyThread extends Thread{
        @Override
        public void run() {
            try{
                while (!isInterrupted()){
                    System.out.println("Worker is working...");
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println("Worker Stopped");

        }
    }
    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println("начинаем");
        t.start();
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("Ошибка2");
        }
        System.out.println("прерываем");
        t.interrupt();
    }
}