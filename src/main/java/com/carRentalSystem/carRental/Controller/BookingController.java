package com.carRentalSystem.carRental.Controller;

import com.carRentalSystem.carRental.Model.Booking;
import com.carRentalSystem.carRental.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }

    @GetMapping("/{bookingId}")
    public Booking getBookingById(@PathVariable int bookingId) {
        return bookingService.getBookingById(bookingId);
    }

    @PostMapping
    public void addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @PutMapping("/{bookingId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateBooking(@PathVariable int bookingId, @RequestBody Booking booking) {
        bookingService.updateBooking(bookingId, booking);
    }

    @DeleteMapping("/{bookingId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBookingById(@PathVariable int bookingId) {
        bookingService.deleteBookingById(bookingId);
    }
}