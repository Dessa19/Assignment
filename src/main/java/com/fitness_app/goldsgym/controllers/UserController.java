package com.fitness_app.goldsgym.controllers;

import com.fitness_app.goldsgym.dto.UserDto;
import com.fitness_app.goldsgym.models.User;
import com.fitness_app.goldsgym.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")

public class UserController {
//   @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity <UserDto> addUser(@RequestBody UserDto userDto) {

     return new ResponseEntity<>( userService.createUser(userDto),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable int id) {
        UserDto userDto = userService.getUserById(id);
        return ResponseEntity.ok(userDto);
    }
    @PutMapping("{id}/address")
    public ResponseEntity<UserDto> updateUserAddressById(@PathVariable int id, @RequestBody Map<String,String> request) {
        String updateUser = request.get("address");
        UserDto userDto = userService.updateUserAddressById(id,updateUser);
        return ResponseEntity.ok(userDto);
    }
}
