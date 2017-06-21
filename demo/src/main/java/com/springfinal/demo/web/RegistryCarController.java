package com.springfinal.demo.web;

import com.springfinal.demo.domain.RegistryCar;
import com.springfinal.demo.service.RegistryCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Silver on 20/6/2017.
 */
@RestController
@RequestMapping("/registrycar")
public class RegistryCarController {
    @Autowired
    private RegistryCarService registryCarService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RegistryCar> getAllRegistry() {
        return registryCarService.getAllRegistryCar();
    }

    @RequestMapping(value = "/{id_registry}", method = RequestMethod.GET)
    public List<RegistryCar> getRegistry(@PathVariable Long id) {
        return registryCarService.getRegistryCar(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewRegistry(@RequestBody RegistryCarController.RegistryCarRequestDTO newRegistryCarDTO) {
        registryCarService.addNewRegistry(newRegistryCarDTO);
    }

    @RequestMapping(value = "/{id_registry}", method = RequestMethod.DELETE)
    public void deleteRegistry(@PathVariable Long id_car) {
        registryCarService.deleteRegistry(id_car);
    }

    @RequestMapping(value = "/{id_registry}", method = RequestMethod.PUT)
    public void updateRegistry(@PathVariable Long id_registry, @RequestBody RegistryCar registry) {
        registryCarService.updateRegistry(id_registry, registry);
    }

    public static class RegistryCarRequestDTO {
        private Long idBuyer;
        private Long idCar;
        private Long idSeller;

        public Long getIdBuyer() {
            return idBuyer;
        }

        public Long getIdCar() {
            return idCar;
        }

        public Long getIdSeller() {
            return idSeller;
        }

        public void setIdBuyer(Long idBuyer) {
            this.idBuyer = idBuyer;
        }

        public void setIdCar(Long idCar) {
            this.idCar = idCar;
        }

        public void setIdSeller(Long idSeller) {
            this.idSeller = idSeller;
        }
    }
}