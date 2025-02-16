package com.carRentalSystem.carRental.Service;

import com.carRentalSystem.carRental.Model.User;
import com.carRentalSystem.carRental.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public User getUserById(int userId) {
        return userRepo.findById(userId).orElse(new User());
    }

    public void addUser(User user) {
        userRepo.save(user);
    }

    public void updateUser(int userId, User user) {
        userRepo.save(user);
    }

    public void deleteUserById(int userId) {
        userRepo.deleteById(userId);
    }
}