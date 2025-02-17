package com.carRentalSystem.carRental.Model;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Entity
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")

    private String userName;
    @Column(name = "pass_word")

    private String password;
    @Column(name = "mob_no")

    private String mobNo;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public User() {}

    public User(int userId, String userName, String password, String mobNo, List<Booking> bookings) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.mobNo = mobNo;
        this.bookings = bookings;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
