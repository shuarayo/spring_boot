package com.springfinal.demo.service;

import com.springfinal.demo.domain.Seller;
import com.springfinal.demo.repository.SellerRepository;
import com.springfinal.demo.web.SellerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Silver on 19/6/2017.
 */
@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSellers() {
        //TODO user repository
        List<Seller> sellerList = (List<Seller>) sellerRepository.findAll();
        return sellerList;

    }

    public List<Seller> getSeller(Long id) {
        List<Seller> sellerList = new ArrayList<>();
        Seller seller = sellerRepository.findOne(id);
        sellerList.add(seller);
        return sellerList;
    }

    public void addNewSeller(SellerController.SellerRequestDTO newSellerDTO){
        Seller newSeller = new Seller();
        newSeller.setId_seller(newSellerDTO.getId_seller());
        newSeller.setName_seller(newSellerDTO.getName_seller());
        newSeller.setAge_seller(newSellerDTO.getAge_seller());
        newSeller.setCi_seller(newSellerDTO.getCi_seller());
        newSeller.setNum_cars_sold(newSellerDTO.getNum_cars_sold());

        sellerRepository.save(newSeller);
    }
    public void deleteSeller(Long id_seller) {
        sellerRepository.delete(id_seller);
    }

    public void updateSeller(Long id_seller, Seller seller) {
        sellerRepository.delete(id_seller);
        seller.setId_seller(id_seller);
        sellerRepository.save(seller);
    }
}
