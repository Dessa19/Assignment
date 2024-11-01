package com.fitness_app.goldsgym.dto;

public class GymDto {
    private int id;
    private String address;
    private String managerName;

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
