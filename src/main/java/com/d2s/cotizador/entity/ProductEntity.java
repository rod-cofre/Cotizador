package com.d2s.cotizador.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class ProductEntity implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(length = 10)
    private String name;
    private double sale_price;
    private double purcharse_price;
    @Column(nullable = true)
    private int stock = 0;

    public ProductEntity(String name, double sale_price, double purcharse_price, int stock) {
        this.name = name;
        this.sale_price = sale_price;
        this.purcharse_price = purcharse_price;
        this.stock = stock;
    }

    public ProductEntity(int id, String name, double sale_price, double purcharse_price, int stock) {
        this.id = id;
        this.name = name;
        this.sale_price = sale_price;
        this.purcharse_price = purcharse_price;
        this.stock = stock;
    }

    public ProductEntity(int id, String name, double sale_price, double purcharse_price) {
        this.id = id;
        this.name = name;
        this.sale_price = sale_price;
        this.purcharse_price = purcharse_price;

    }

    public ProductEntity() {
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

    public double getSale_price() {
        return sale_price;
    }

    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
    }

    public double getPurcharse_price() {
        return purcharse_price;
    }

    public void setPurcharse_price(double purcharse_price) {
        this.purcharse_price = purcharse_price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
