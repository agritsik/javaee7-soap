package com.agritsik.samples.boundary;

import com.agritsik.samples.entity.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductWS {
    private String message = new String("Hello from Product Web Service, ");

    @WebMethod
    public String welcomeMessage(String name) {
        return message + name + ".";
    }

    @WebMethod
    public void create(Product product){
    }

    @WebMethod
    public Product find(int id){
        return new Product("first product");
    }

}