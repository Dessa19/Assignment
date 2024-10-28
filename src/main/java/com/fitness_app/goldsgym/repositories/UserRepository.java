package com.fitness_app.goldsgym.repositories;

import com.fitness_app.goldsgym.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer >{


}
