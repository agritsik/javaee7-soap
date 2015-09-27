package com.agritsik.samples.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by andrey on 9/27/15.
 */

@Table(name = "products")
@Entity
public class Product {


    @Id
    private int id;

    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
