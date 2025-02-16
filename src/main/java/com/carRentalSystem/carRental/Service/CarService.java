package com.carRentalSystem.carRental.Service;

import com.carRentalSystem.carRental.Model.Car;
import com.carRentalSystem.carRental.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepo;

    public List<Car> getCars() {
        return carRepo.findAll();
    }

    public Car getCarById(int carId) {
        return carRepo.findById(carId).orElse(new Car());
    }

    public void addCar(Car car) {
        carRepo.save(car);
    }

    public void updateCar(int carId, Car car) {
        carRepo.save(car);
    }

    public void deleteCarById(int carId) {
        carRepo.deleteById(carId);
    }
}