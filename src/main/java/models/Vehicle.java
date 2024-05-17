package models;

public class Vehicle {
    private int code;
    private String Model;
    private String Type;
    private String launch_date;
    private int capacity;
    private String registration;
    private Driver assigned_to;

    public Vehicle(String model, String type, String launch_date, int capacity, String registration, Driver assigned_to) {
        Model = model;
        Type = type;
        this.launch_date = launch_date;
        this.capacity = capacity;
        this.registration = registration;
        this.assigned_to = assigned_to;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Driver getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(Driver assigned_to) {
        this.assigned_to = assigned_to;
    }

    public Vehicle() {
    }
}
