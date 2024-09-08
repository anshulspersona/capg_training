package com.example.capg.training;

public class DemoApp {
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        DemoApp app = new DemoApp();
        System.out.println("Sum of 10 and 3 is: " + app.addNumbers(5, 3));
    }
}
