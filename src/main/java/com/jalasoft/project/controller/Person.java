package com.jalasoft.project.controller;

public class Person {
    String name;
    int old;
    String lastName;

    public Person(String name, int old, String lastName) {
        this.name = name;
        this.old = old;
        this.lastName = lastName;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getOld() {
        return old;
    }

}
