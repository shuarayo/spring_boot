package com.springfinal.demo.service;

import com.springfinal.demo.domain.Buyer;
import com.springfinal.demo.repository.BuyerRepository;
import com.springfinal.demo.web.BuyerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silver on 19/6/2017.
 */
@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers() {
        //TODO user repository
        List<Buyer> buyerList =  buyerRepository.findAll();
        return buyerList;
    }
    public List<Buyer> getBuyers(Long id) {
        List<Buyer> buyerList = new ArrayList<>();
        Buyer buyer = buyerRepository.findOne(id);
        buyerList.add(buyer);
        return buyerList;
    }

    public void addNewBuyer(BuyerController.BuyerRequestDTO newBuyerDTO){
        Buyer newBuyer = new Buyer();
        newBuyer.setId_buyer(newBuyerDTO.getId_buyer());
        newBuyer.setName_buyer(newBuyerDTO.getName_buyer());
        newBuyer.setCi_buyer(newBuyerDTO.getCi_buyer());
        newBuyer.setProfession_buyer(newBuyerDTO.getProfession_buyer());
        newBuyer.setCelular_buyer(newBuyerDTO.getCelular_buyer());

        buyerRepository.save(newBuyer);
    }

    public void deleteBuyer(Long id_buyer) {
        buyerRepository.delete(id_buyer);
    }

    public void updateBuyer(Long id_buyer, Buyer buyer) {
        buyerRepository.delete(id_buyer);
        buyer.setId_buyer(id_buyer);
        buyerRepository.save(buyer);
    }

}
