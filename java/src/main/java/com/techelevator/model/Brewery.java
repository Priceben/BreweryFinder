package com.techelevator.model;

import java.util.List;

public class Brewery {

    private int breweryId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private String history;
    private String hours;
    private List<BreweryImages> images;
    private int brewerId;
    private boolean active;

    public Brewery() { };

    public Brewery(int breweryId, String name, String address, String city, String state, String zip, String phone,
                   String email, String history, String hours, List<BreweryImages> images, int brewerId, boolean active) {
        this.breweryId = breweryId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.history = history;
        this.hours = hours;
        this.images = images;
        this.brewerId = brewerId;
        this.active = active;
    }

    public int getBreweryId() { return breweryId; }

    public void setBreweryId(int breweryId) { this.breweryId = breweryId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getZip() { return zip; }

    public void setZip(String zip) { this.zip = zip; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getHistory() { return history; }

    public void setHistory(String history) { this.history = history; }

    public String getHours() { return hours; }

    public void setHours(String hours) { this.hours = hours; }

    public List<BreweryImages> getImages() { return images; }

    public void setImages(List<BreweryImages> images) { this.images = images; }

    public int getBrewerId() { return brewerId; }

    public void setBrewerId(int brewerId) { this.brewerId = brewerId; }

    public boolean isActive() { return active; }

    public void setActive(boolean active) { this.active = active; }
}
