package com.springfinal.demo.domain;
import javax.persistence.*;

/**
 * Created by Silver on 19/6/2017.
 */
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_seller;
    private String name_seller;
    private int age_seller;
    private int ci_seller;
    private int num_cars_sold;
    //@OneToMany
    //private RegistryCar registryCar;


    public Long getId_seller() {
        return id_seller;
    }

    public String getName_seller() {
        return name_seller;
    }

    public int getAge_seller() {
        return age_seller;
    }

    public int getCi_seller() {
        return ci_seller;
    }

    public int getNum_cars_sold() {
        return num_cars_sold;
    }

    public void setId_seller(Long id_seller) {
        this.id_seller = id_seller;
    }

    public void setName_seller(String name_seller) {
        this.name_seller = name_seller;
    }

    public void setAge_seller(int age_seller) {
        this.age_seller = age_seller;
    }

    public void setCi_seller(int ci_seller) {
        this.ci_seller = ci_seller;
    }

    public void setNum_cars_sold(int num_cars_sold) {
        this.num_cars_sold = num_cars_sold;
    }
}
