package com.carRentalSystem.carRental.Controller;

import com.carRentalSystem.carRental.Model.Car;
import com.carRentalSystem.carRental.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/{carId}")
    public Car getCarById(@PathVariable int carId) {
        return carService.getCarById(carId);
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

    @PutMapping("/{carId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateCar(@PathVariable int carId, @RequestBody Car car) {
        carService.updateCar(carId, car);
    }

    @DeleteMapping("/{carId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCarById(@PathVariable int carId) {
        carService.deleteCarById(carId);
    }
}