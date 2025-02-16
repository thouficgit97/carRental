package com.carRentalSystem.carRental.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carId")
    private int carId;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")

    private String model;
    @Column(name = "mile_Age")

    private float mileAge;
    @Column(name = "price_per_day")

    private int pricePerDay;
    @Column(name = "number_plate")

    private String numberPlate;
    @Column(name = "is_available")

    private boolean isAvailable;


    @Enumerated(EnumType.STRING)
    @Column(name = "fuel_type")

    private FuelType fuelType;

    public enum FuelType {
        PETROL, DIESEL, HYBRID, ELECTRIC
    }

    public Car() {}

    public Car(int carId, String brand, String model, float mileAge, int pricePerDay, String numberPlate, boolean isAvailable, FuelType fuelType) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.mileAge = mileAge;
        this.pricePerDay = pricePerDay;
        this.numberPlate = numberPlate;
        this.isAvailable = isAvailable;
        this.fuelType = fuelType;
    }

    // Getters and Setters
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getMileAge() {
        return mileAge;
    }

    public void setMileAge(float mileAge) {
        this.mileAge = mileAge;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}