package com.example.playerservice.model;

public class Player {
    private Long id;
    private String name;
    private int shirtNumber;

    public Player(Long id, String name, int shirtNumber) {
        this.id = id;
        this.name = name;
        this.shirtNumber = shirtNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }
}
