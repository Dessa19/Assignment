package com.fitness_app.goldsgym.services;

import com.fitness_app.goldsgym.dto.UserDto;
//import com.fitness_app.goldsgym.models;

import java.util.List;

public interface UserService {
//CRUD operations for the user
    UserDto createUser(UserDto userDto);
    UserDto getUserById(int id);
   List<UserDto> getAllUsers();

   UserDto updateUserAddressById(int id, String address);
    String deleteUserById(int id);


}
