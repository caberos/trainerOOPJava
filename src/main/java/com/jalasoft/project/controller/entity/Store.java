package com.jalasoft.project.controller.entity;

import java.util.ArrayList;
import java.util.List;

public class Store extends Entity{

    private String dir;
    private List<Product> productList;
    private List<Company> companies;


    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void addCompanies(Company company) {
        companies.add(company);
    }

    public Store(String dir) {
        this.dir = dir;
        this.productList = new ArrayList<>();
        this.companies = new ArrayList<>();
    }
}
