package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello DevOps World!";

    public App() {}

    public static void main(String[] args) {
        while (true) {
            System.out.println(MESSAGE);
        }
        
    }

    public String getMessage() {
        return MESSAGE;
    }
}
