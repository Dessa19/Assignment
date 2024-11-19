package com.fitness.goldsgym.services.impl;


import com.fitness.goldsgym.dto.GymDto;
import com.fitness.goldsgym.mapper.GymMapper;
import com.fitness.goldsgym.models.Gym;
import com.fitness.goldsgym.repositories.GymRepository;
import com.fitness.goldsgym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public abstract class GymServiceImpl implements GymService {

    @Autowired
    private GymRepository gymRepository;
    @Autowired
    private GymMapper gymMapper;

    @Override
    public GymDto createGym(GymDto gymDto) {
        Gym gym = gymMapper.toEntity(gymDto);//convert DTO to Entity
        Gym savedGym = gymRepository.save(gym); //save Entity to DB
        return gymMapper.toDto(savedGym); //convert back to DTO
    }
    @Override
    public GymDto updateGym(int id, GymDto gymDto){
        Gym gym = gymRepository.findById(id).orElseThrow();
        gym.setAddress(gymDto.getAddress());
        gym.setManagerName(gymDto.getManagerName());
        Gym updatedGym = gymRepository.save(gym);
        return gymMapper.toDto(updatedGym);
    }
    @Override
    public GymDto getGymById(int id) {
        Gym gym = gymRepository.findById(id)
                .orElseThrow();
        return gymMapper.toDto(gym);
    }
    @Override
    public List<GymDto> getAllGyms() {
        List<Gym> gyms = gymRepository.findAll();
        return gyms.stream().map(gymMapper::toDto).collect(Collectors.toList());
    }
    @Override
    public void deleteGymById(int id) {
        Gym gym = gymRepository.findById(id)
                .orElseThrow();
        gymRepository.delete(gym);
    }
}
