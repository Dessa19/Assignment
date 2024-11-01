package com.fitness_app.goldsgym.mapper;


import com.fitness_app.goldsgym.dto.GymDto;
import com.fitness_app.goldsgym.models.Gym;
import org.springframework.stereotype.Component;

@Component
public class GymMapper {
    public Gym toEntity(GymDto gymDto) {
        Gym gym = new Gym();
        gym.setId(gymDto.getId());
        gym.setAddress(gymDto.getAddress());
        gym.setManagerName(gymDto.getManagerName());
        return gym;
    }
    public GymDto toDto(Gym gym) {
        GymDto gymDto = new GymDto();
        gymDto.setId(gym.getId());
        gymDto.setAddress(gym.getAddress());
        gymDto.setManagerName(gym.getManagerName());
        return gymDto;
    }

}
