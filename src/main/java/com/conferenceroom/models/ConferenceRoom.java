package com.conferenceroom.models;

public class ConferenceRoom {
    private String roomId;
    private String name;
    private int capacity;
    private String location;
    private double pricePerHour;
    private boolean isAvailable;

    public ConferenceRoom(String roomId, String name, int capacity, String location, double pricePerHour, boolean isAvailable) {
        this.roomId = roomId;
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        this.pricePerHour = pricePerHour;
        this.isAvailable = isAvailable;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "ConferenceRoom{"
                + "roomId='" + roomId + '\''
                + ", name='" + name + '\''
                + ", capacity=" + capacity
                + ", location='" + location + '\''
                + ", pricePerHour=" + pricePerHour
                + ", isAvailable=" + isAvailable
                + '}';
    }
}