package com.fitness.goldsgym.mapper;


import com.fitness.goldsgym.dto.UserDto;
import com.fitness.goldsgym.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    //convert Dto object into a Entity object
    public User mapToUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAddress());
        return user;
    }

    //convert a Entity object into a Dto object
    public UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getAddress());
        return userDto;
    }
    // below incomplete code
    public Object toDto(User user) {
        return null;
    }
}
