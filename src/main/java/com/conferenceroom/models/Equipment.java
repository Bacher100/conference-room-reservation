package com.conferenceroom.models;

public class Equipment {
    private String equipmentId;
    private String name;
    private String description;
    private String type;
    private boolean isAvailable;
    private boolean isFunctional;
    private String maintenanceNotes;

    public Equipment() {
    }

    public Equipment(String equipmentId, String name, String description, String type, boolean isAvailable, boolean isFunctional, String maintenanceNotes) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.description = description;
        this.type = type;
        this.isAvailable = isAvailable;
        this.isFunctional = isFunctional;
        this.maintenanceNotes = maintenanceNotes;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isFunctional() {
        return isFunctional;
    }

    public void setFunctional(boolean functional) {
        isFunctional = functional;
    }

    public String getMaintenanceNotes() {
        return maintenanceNotes;
    }

    public void setMaintenanceNotes(String maintenanceNotes) {
        this.maintenanceNotes = maintenanceNotes;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentId='" + equipmentId + '\'
                + ", name='" + name + '\'
                + ", description='" + description + '\'
                + ", type='" + type + '\'
                + ", isAvailable=" + isAvailable
                + ", isFunctional=" + isFunctional
                + ", maintenanceNotes='" + maintenanceNotes + '\'
                + '}';
    }
}