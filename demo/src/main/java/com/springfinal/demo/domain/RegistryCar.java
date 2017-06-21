package com.springfinal.demo.domain;

import javax.persistence.*;

/**
 * Created by Silver on 21/6/2017.
 */
@Entity
public class RegistryCar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_registry;
    private int num_cars_sold;

    @ManyToOne
    private Buyer buyer;
    @ManyToOne
    private Car car;
    @ManyToOne
    private Seller seller;

    public Long getId_registry() {
        return id_registry;
    }

    public int getNum_cars_sold() {
        return num_cars_sold;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Car getCar() {
        return car;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setId_registry(Long id_registry) {
        this.id_registry = id_registry;
    }

    public void setNum_cars_sold(int num_cars_sold) {
        this.num_cars_sold = num_cars_sold;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
