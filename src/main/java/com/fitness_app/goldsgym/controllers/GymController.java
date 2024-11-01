package com.fitness_app.goldsgym.controllers;

import com.fitness_app.goldsgym.dto.GymDto;
import com.fitness_app.goldsgym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gyms")
public class GymController {
    @Autowired
    private GymService gymService;

    @PostMapping
    public ResponseEntity<GymDto> createGym(@RequestBody GymDto gymDto) {
        return new ResponseEntity<>(gymService.createGym(gymDto), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<GymDto> updateGym(@PathVariable int id, @RequestBody GymDto gymDto) throws Throwable {
        return ResponseEntity.ok(gymService.updateGym(id, gymDto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<GymDto> getGymById(@PathVariable int id) throws Throwable {
        return ResponseEntity.ok(gymService.getGymById(id));
    }
    @GetMapping
    public ResponseEntity<List<GymDto>> getAllGyms() {
        return ResponseEntity.ok(gymService.getAllGyms());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGymById(@PathVariable int id) {
        gymService.deleteGymById(id);
        return ResponseEntity.noContent().build();
    }
}
