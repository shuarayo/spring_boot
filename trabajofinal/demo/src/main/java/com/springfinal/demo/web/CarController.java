package com.springfinal.demo.web;

import com.springfinal.demo.domain.Car;
import com.springfinal.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Silver on 19/6/2017.
 */
@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @RequestMapping(value = "/{id_car}", method = RequestMethod.GET)
    public List<Car> getCars(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewCar(@RequestBody CarRequestDTO newCarDTO){
        carService.addNewCar(newCarDTO);
    }

    @RequestMapping(value = "/{id_car}", method = RequestMethod.DELETE)
    public void deleteSeller(@PathVariable Long id_car) {
        carService.deleteCar(id_car);
    }
    @RequestMapping(value = "/{id_car}", method = RequestMethod.PUT)
    public void updateCars(@PathVariable Long id_car, @RequestBody Car car) {
        carService.updateCar(id_car, car);
    }

    public static  class CarRequestDTO{
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
}
