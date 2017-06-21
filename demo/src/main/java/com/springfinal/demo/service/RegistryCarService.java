package com.springfinal.demo.service;

import com.springfinal.demo.domain.Buyer;
import com.springfinal.demo.domain.Car;
import com.springfinal.demo.domain.RegistryCar;
import com.springfinal.demo.domain.Seller;
import com.springfinal.demo.repository.BuyerRepository;
import com.springfinal.demo.repository.CarRepository;
import com.springfinal.demo.repository.RegistryCarRepository;
import com.springfinal.demo.repository.SellerRepository;
import com.springfinal.demo.web.RegistryCarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silver on 20/6/2017.
 */
@Service
public class RegistryCarService {
    @Autowired
    private RegistryCarRepository registryCarRepository;
    @Autowired
    private BuyerRepository buyerRepository;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private SellerRepository sellerRepository;

    public List<RegistryCar> getAllRegistryCar() {
        //TODO user repository
        List<RegistryCar> registryList = registryCarRepository.findAll();
        return registryList;

    }

    public List<RegistryCar> getRegistryCar(Long id) {
        List<RegistryCar> registryList = new ArrayList<>();
        RegistryCar registry = registryCarRepository.findOne(id);
        registryList.add(registry);
        return registryList;
    }

    public void addNewRegistry(RegistryCarController.RegistryCarRequestDTO newRegistryCarDTO) {
        Buyer buyer = buyerRepository.findOne(newRegistryCarDTO.getIdBuyer());
        Car car= carRepository.findOne(newRegistryCarDTO.getIdCar());
        Seller seller = sellerRepository.findOne(newRegistryCarDTO.getIdSeller());
        RegistryCar newRegistry = new RegistryCar();

        newRegistry.setBuyer(buyer);
        newRegistry.setCar(car);
        newRegistry.setSeller(seller);

        registryCarRepository.save(newRegistry);
    }

    public void deleteRegistry(Long id_registry) {
        registryCarRepository.delete(id_registry);
    }

    public void updateRegistry(Long id_registry, RegistryCar registry) {
        registryCarRepository.delete(id_registry);
        registry.setId_registry(id_registry);
        registryCarRepository.save(registry);
    }
}