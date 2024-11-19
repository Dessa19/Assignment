package com.fitness.goldsgym.repositories;

import com.fitness.goldsgym.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
