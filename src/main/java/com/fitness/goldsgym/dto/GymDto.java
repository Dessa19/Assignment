package com.fitness.goldsgym.dto;

import java.util.List;

public class GymDto {

    private int id;
    private String address;
    private String managerName;
    private List<Integer> userId;
    private int gymId;

    public void UserDto(){

    }

    public GymDto(int id, String address, String managerName, List<Integer> userId, int gymId) {
        this.id = id;
        this.address = address;
        this.managerName = managerName;
        this.userId = userId;
        this.gymId = gymId;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public List<Integer> getUserId() {
        return userId;
    }

    public void setUserId(List<Integer> userId) {
        this.userId = userId;
    }

    public GymDto(int id, String address, String managerName) {
        this.id = id;
        this.address = address;
        this.managerName = managerName;

    }
    public GymDto() { //This is a default constructor.
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
