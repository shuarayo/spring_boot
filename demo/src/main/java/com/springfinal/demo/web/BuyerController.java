package com.springfinal.demo.web;

import com.springfinal.demo.domain.Buyer;
import com.springfinal.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Silver on 19/6/2017.
 */
@RestController
@RequestMapping("/buyers")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Buyer> getAllBuyers() {
        return buyerService.getAllBuyers();
    }

    @RequestMapping(value = "/{id_buyer}", method = RequestMethod.GET)
    public List<Buyer> getBuyers(@PathVariable Long id) {
        return buyerService.getBuyers(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewBuyer(@RequestBody BuyerRequestDTO newBuyerDTO){
        buyerService.addNewBuyer(newBuyerDTO);
    }

    @RequestMapping(value = "/{id_buyer}", method = RequestMethod.DELETE)
    public void deleteBuyer(@PathVariable Long id_buyer) {
        buyerService.deleteBuyer(id_buyer);
    }

    @RequestMapping(value = "/{id_buyer}", method = RequestMethod.PUT)
    public void updateBuyer(@PathVariable Long id_buyer, @RequestBody Buyer buyer) {
        buyerService.updateBuyer(id_buyer, buyer);
    }

    public static class BuyerRequestDTO{
        private Long id_buyer;
        private String name_buyer;
        private int ci_buyer;
        private String profession_buyer;
        private int celular_buyer;

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
}
