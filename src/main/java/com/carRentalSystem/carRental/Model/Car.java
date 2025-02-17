package com.carRentalSystem.carRental.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Car")  // Explicitly define table name (optional but good practice)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "mileage")
    private float mileage;

    @Column(name = "price_per_day")
    private int pricePerDay;

    @Column(name = "number_plate")
    private String numberPlate;

    @Column(name = "is_available")
    private Boolean isAvailable;

    @Enumerated(EnumType.STRING)
    @Column(name = "fuel_type")
    private FuelType fuelType;

    public enum FuelType {
        PETROL, DIESEL, HYBRID, ELECTRIC
    }

    public Car() {}

    public Car(int carId, String brand, String model, float mileage, int pricePerDay, String numberPlate, Boolean isAvailable, FuelType fuelType) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.pricePerDay = pricePerDay;
        this.numberPlate = numberPlate;
        this.isAvailable = isAvailable;
        this.fuelType = fuelType;
    }

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

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
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

    public Boolean getIsAvailable() {  // Changed method name for proper serialization
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
