package com.fitness.goldsgym.controllers;


import com.fitness.goldsgym.dto.UserDto;
import com.fitness.goldsgym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
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
    public ResponseEntity<UserDto> updateUserAddressById(@PathVariable int id, @RequestBody Map<String,String> request)
    {
        String updateUser = request.get("address");
        UserDto userDto = userService.updateUserAddressById(id,updateUser);
        return ResponseEntity.ok(userDto);
    }
    @GetMapping //new code line
    public ResponseEntity<List<UserDto>> getAllUsers() { // new code line
        List<UserDto> users = userService.getAllUsers(); //new code line
        return ResponseEntity.ok(users); //new code line
    }
    @DeleteMapping("/{id}") //new code line
    public ResponseEntity<Void> deleteUserById(@PathVariable int id) { //new code line
        userService.deleteUserById(id); //new code line
        return ResponseEntity.noContent().build(); //new code line
    }

}
