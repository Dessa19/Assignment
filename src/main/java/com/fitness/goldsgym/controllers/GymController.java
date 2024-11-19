package com.fitness.goldsgym.controllers;

import com.fitness.goldsgym.dto.GymDto;
import com.fitness.goldsgym.services.GymService;
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

    @PostMapping("/{gymId}/users/{userId}")
    public ResponseEntity<Void> assignUserToGym(@PathVariable Long gymId, @PathVariable Long userId) {
        gymService.assignUserToGym(gymId, userId);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<GymDto> createGym(@RequestBody GymDto gymDto) {
        return new ResponseEntity<>(gymService.createGym(gymDto), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<GymDto> updateGym(@PathVariable int id, @RequestBody GymDto GymDto) throws Throwable {
        return ResponseEntity.ok(gymService.updateGym(id, GymDto));
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
