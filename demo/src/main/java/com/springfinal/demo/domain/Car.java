package com.springfinal.demo.domain;
import javax.persistence.*;

/**
 * Created by Silver on 19/6/2017.
 */
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_car;
    private String model_car;
    private int year_car;
    private String brand_car;
    private String color_car;
    private String imagen_car;

    public Long getId_car() {
        return id_car;
    }

    public String getModel_car() {
        return model_car;
    }

    public int getYear_car() {
        return year_car;
    }

    public String getBrand_car() {
        return brand_car;
    }

    public String getColor_car() {
        return color_car;
    }

    public String getImagen_car() {
        return imagen_car;
    }

    public void setId_car(Long id_car) {
        this.id_car = id_car;
    }

    public void setModel_car(String model_car) {
        this.model_car = model_car;
    }

    public void setYear_car(int year_car) {
        this.year_car = year_car;
    }

    public void setBrand_car(String brand_car) {
        this.brand_car = brand_car;
    }

    public void setColor_car(String color_car) {
        this.color_car = color_car;
    }

    public void setImagen_car(String imagen_car) {
        this.imagen_car = imagen_car;
    }
}