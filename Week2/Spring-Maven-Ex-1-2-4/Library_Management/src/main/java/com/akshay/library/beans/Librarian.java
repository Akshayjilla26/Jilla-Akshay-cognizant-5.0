package com.akshay.library.beans;

/**
 * Ex 1 - Spring core: a plain POJO wired up as a Spring bean via XML
 * configuration (see resources/applicationContext.xml).
 *
 * By default, Spring beans are singletons, so every time this bean is
 * requested from the ApplicationContext, the SAME instance is returned.
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void greet() {
        System.out.println("Librarian " + name + " is on duty (" + shift + " shift).");
    }

    @Override
    public String toString() {
        return "Librarian{name='" + name + "', shift='" + shift + "'}";
    }
}
