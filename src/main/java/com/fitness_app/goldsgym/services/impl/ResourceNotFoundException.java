package com.fitness_app.goldsgym.services.impl;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String gymNotFound) {
        super("Sorry ! This gym is not found with this id");
    }
}
