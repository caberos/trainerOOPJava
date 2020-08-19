package com.jalasoft.project.controller.entity;

public class Company {
    private int numberEmployees;
    private String dir;

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getDir() {
        return dir;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public Company(int numberEmployees, String dir) {
        this.numberEmployees = numberEmployees;
        this.dir = dir;
    }
}
