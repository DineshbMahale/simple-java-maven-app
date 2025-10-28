package com.mycompany.app;

/**
 * Hi , Dinesh here ,I have successfully built and run my first Maven project in Jenkins
 */
public class App {

    private static final String MESSAGE = "Hi , Dinesh here ,I have successfully built and run my first Maven project in Jenkins (updated on 28/10/2025)";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
