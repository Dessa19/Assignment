package com.fitness.goldsgym.services;

import com.fitness.goldsgym.dto.UserDto;
import java.util.List;

public interface UserService {
    //CRUD operations for the user
    UserDto createUser(UserDto userDto);
    UserDto getUserById(int id);
    List<UserDto> getAllUsers();// new added code line
    UserDto updateUserAddressById(int id, String address);
    String deleteUserById(int id);// new added code line



}
