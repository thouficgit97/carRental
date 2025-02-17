package com.carRentalSystem.carRental.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Booking")  // Explicitly define table name
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int bookingId;

    @Column(name = "booked_at", nullable = false)
    private LocalDateTime bookedAt;

    @Column(name = "no_of_days")
    private int noOfDays;  // Renamed for better readability

    @Column(name = "total_fare")
    private int totalFare;

    @Column(name = "booking_status")
    private boolean bookingStatus;  // Changed to Enum instead of boolean

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    public Booking() {}

    public Booking(int bookingId, LocalDateTime bookedAt, int noOfDays, int totalFare, boolean bookingStatus, User user, Car car) {
        this.bookingId = bookingId;
        this.bookedAt = bookedAt;
        this.noOfDays = noOfDays;
        this.totalFare = totalFare;
        this.bookingStatus = bookingStatus;
        this.user = user;
        this.car = car;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(LocalDateTime bookedAt) {
        this.bookedAt = bookedAt;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

    public boolean getBookingStatus() {  // Updated getter for Enum
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {  // Updated setter for Enum
        this.bookingStatus = bookingStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
