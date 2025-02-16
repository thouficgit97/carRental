package com.carRentalSystem.carRental.Repository;

import com.carRentalSystem.carRental.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}