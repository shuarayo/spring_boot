
package com.springfinal.demo.service;

import com.springfinal.demo.domain.Car;
import com.springfinal.demo.repository.CarRepository;
import com.springfinal.demo.web.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silver on 19/6/2017.
 */
@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        //TODO user repository
        List<Car> carList =  carRepository.findAll();
        return carList;
    }
    public List<Car> getCar(Long id) {
        List<Car> carList = new ArrayList<>();
        Car car = carRepository.findOne(id);
        carList.add(car);
        return carList;
    }
    public void addNewCar(CarController.CarRequestDTO newCarDTO){
        Car newCar = new Car();

        newCar.setId_car(newCarDTO.getId_car());
        newCar.setModel_car(newCarDTO.getModel_car());
        newCar.setYear_car(newCarDTO.getYear_car());
        newCar.setBrand_car(newCarDTO.getBrand_car());
        newCar.setColor_car(newCarDTO.getColor_car());
        newCar.setImagen_car(newCarDTO.getImagen_car());

        carRepository.save(newCar);
    }

    public void deleteCar(Long id_car) {
        carRepository.delete(id_car);
    }

    public void updateCar(Long id_car, Car car) {
        carRepository.delete(id_car);
        car.setId_car(id_car);
        carRepository.save(car);
    }

}
