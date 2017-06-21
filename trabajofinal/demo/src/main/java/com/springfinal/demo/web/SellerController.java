package com.springfinal.demo.web;

import com.springfinal.demo.domain.Seller;
import com.springfinal.demo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Silver on 19/6/2017.
 */
@RestController
@RequestMapping("/sellers")
public class SellerController {
    @Autowired
    private SellerService sellerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Seller> getAllSellers() {
        return sellerService.getAllSellers();
    }

    @RequestMapping(value = "/{id_seller}", method = RequestMethod.GET)
    public List<Seller> getSeller(@PathVariable Long id_seller) {
        return sellerService.getSeller(id_seller);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewSeller(@RequestBody SellerRequestDTO newSellerDTO){
        sellerService.addNewSeller(newSellerDTO);
    }

    @RequestMapping(value = "/{id_seller}", method = RequestMethod.DELETE)
    public void deleteSeller(@PathVariable Long id_seller) {
        sellerService.deleteSeller(id_seller);
    }

    @RequestMapping(value = "/{id_seller}", method = RequestMethod.PUT)
    public void updateSellers(@PathVariable Long id_seller, @RequestBody Seller seller) {
        sellerService.updateSeller(id_seller, seller);
    }

    public static  class SellerRequestDTO{
        private Long id_seller;
        private String name_seller;
        private int age_seller;
        private int ci_seller;
        private int num_cars_sold;

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
}
