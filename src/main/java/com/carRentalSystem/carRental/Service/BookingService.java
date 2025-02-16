package com.carRentalSystem.carRental.Service;

import com.carRentalSystem.carRental.Model.Booking;
import com.carRentalSystem.carRental.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepo;

    public List<Booking> getBookings() {
        return bookingRepo.findAll();
    }

    public Booking getBookingById(int bookingId) {
        return bookingRepo.findById(bookingId).orElse(new Booking());
    }

    public void addBooking(Booking booking) {
        bookingRepo.save(booking);
    }

    public void updateBooking(int bookingId, Booking booking) {
        bookingRepo.save(booking);
    }

    public void deleteBookingById(int bookingId) {
        bookingRepo.deleteById(bookingId);
    }
}