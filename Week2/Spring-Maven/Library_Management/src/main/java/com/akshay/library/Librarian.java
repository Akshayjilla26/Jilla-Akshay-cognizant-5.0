package com.akshay.library;

/**
 * Exercise 1: Plain POJO whose bean definition lives entirely in
 * applicationContext.xml (classic XML-based Spring IoC/DI).
 */
public class Librarian {

    private String name;
    private String shift;

    public Librarian() {
    }

    public Librarian(String name, String shift) {
        this.name = name;
        this.shift = shift;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void greet() {
        System.out.println("Librarian " + name + " is on duty for the " + shift + " shift.");
    }
}
