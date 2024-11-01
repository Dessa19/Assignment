package com.fitness_app.goldsgym.services.impl;

import com.fitness_app.goldsgym.dto.GymDto;
import com.fitness_app.goldsgym.mapper.GymMapper;
import com.fitness_app.goldsgym.models.Gym;
import com.fitness_app.goldsgym.repositories.GymRepository;
import com.fitness_app.goldsgym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GymServiceImpl implements GymService {
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
        Gym gym = gymRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Gym not found"));
        gym.setAddress(gymDto.getAddress());
        gym.setManagerName(gymDto.getManagerName());
        Gym updatedGym = gymRepository.save(gym);
        return gymMapper.toDto(updatedGym);
    }
    @Override
    public GymDto getGymById(int id) {
        Gym gym = gymRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Gym not found" + id));
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
                .orElseThrow(() -> new ResourceNotFoundException("Gym not found"));
        gymRepository.delete(gym);
    }
}
