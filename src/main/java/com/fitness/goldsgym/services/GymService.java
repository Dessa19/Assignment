package com.fitness.goldsgym.services;

import com.fitness.goldsgym.dto.GymDto;
import java.util.List;

public interface GymService {
    GymDto createGym(GymDto gymDto);
    GymDto updateGym(int id, GymDto gymDto);
    GymDto getGymById(int id);
    List<GymDto> getAllGyms();
    void deleteGymById(int id);

    void assignUserToGym(Long gymId, Long userId);
}
