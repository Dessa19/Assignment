package com.fitness_app.goldsgym.services.impl;

import com.fitness_app.goldsgym.dto.UserDto;
import com.fitness_app.goldsgym.mapper.UserMapper;
import com.fitness_app.goldsgym.models.User;
import com.fitness_app.goldsgym.repositories.UserRepository;
import com.fitness_app.goldsgym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return userMapper.mapToUserDto(savedUser);
    }
    @Override
    public UserDto getUserById(int id) {
        User user = userRepository.
                findById(id).
                orElseThrow(()-> new RuntimeException("User of this Id doee not exist"));
        return userMapper.mapToUserDto(user);
    }
    @Override
    public UserDto updateUserAddressById(int id, String address) {
        User user = userRepository.
                findById(id).
                orElseThrow(()-> new RuntimeException("User of this Id doee not exist"));
        user.setAddress(address);
        User savedUser = userRepository.save(user);
        return userMapper.mapToUserDto(savedUser);
    }
    @Override
    public List<UserDto> getAllUsers() { //new code added line
        return List.of();
    }
    @Override
    public String deleteUserById(int id) { //new added code line
        return " User is successfuly delted"; // new added code line
    }

}
