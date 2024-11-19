package com.fitness.goldsgym.repositories;

import com.fitness.goldsgym.models.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GymRepository extends JpaRepository<Gym,Integer> {

}
