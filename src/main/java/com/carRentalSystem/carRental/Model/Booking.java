package com.carRentalSystem.carRental.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int bookingId;
    @Column(name = "booked_at")

    private LocalDateTime bookedAt;
    @Column(name = "no_ofdays")

    private int noOfdays;
    @Column(name = "total_fare")
    private int totalFare;
    @Column(name = "booking_status")
    private boolean bookingStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public Booking() {}

    public Booking(int bookingId, LocalDateTime bookedAt, int noOfdays, int totalFare, boolean bookingStatus, User user, Car car) {
        this.bookingId = bookingId;
        this.bookedAt = bookedAt;
        this.noOfdays = noOfdays;
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

    public int getNoOfdays() {
        return noOfdays;
    }

    public void setNoOfdays(int noOfdays) {
        this.noOfdays = noOfdays;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
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