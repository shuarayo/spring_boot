package com.springfinal.demo.domain;
import javax.persistence.*;

/**
 * Created by Silver on 19/6/2017.
 */
@Entity
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_buyer;
    private String name_buyer;
    private int ci_buyer;
    private String profession_buyer;
    private int celular_buyer;
    //@OneToMany
    //private RegistryCar registryCar;


    public Long getId_buyer() {
        return id_buyer;
    }

    public String getName_buyer() {
        return name_buyer;
    }

    public int getCi_buyer() {
        return ci_buyer;
    }

    public String getProfession_buyer() {
        return profession_buyer;
    }

    public int getCelular_buyer() {
        return celular_buyer;
    }

    public void setId_buyer(Long id_buyer) {
        this.id_buyer = id_buyer;
    }

    public void setName_buyer(String name_buyer) {
        this.name_buyer = name_buyer;
    }

    public void setCi_buyer(int ci_buyer) {
        this.ci_buyer = ci_buyer;
    }

    public void setProfession_buyer(String profession_buyer) {
        this.profession_buyer = profession_buyer;
    }

    public void setCelular_buyer(int celular_buyer) {
        this.celular_buyer = celular_buyer;
    }
}
