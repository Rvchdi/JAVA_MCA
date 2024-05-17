package models;

import com.mysql.cj.Session;
import jakarta.servlet.http.HttpSession;

public class Order {
    private int client_id;
    private String name;
    private String type;
    private String status;
    private int weight;
    private String pickup_city;
    private String date;
    private String destination;
    private int distance;
    private int vehicle_id;
    private double cost;
    private Vehicle vehicle;


    public Order(int client_id, String name, String type, int weight, String pickup_city, String date, String destination, int distance) {
        this.client_id = client_id;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.pickup_city = pickup_city;
        this.date = date;
        this.destination = destination;
        this.distance = distance;
        this.cost = calculate_cost(weight,distance);
        if(this.vehicle != null){

            this.vehicle_id = vehicle.getCode();
        }else{
            setStatus("Not Assigned.");

        }

    }

    public double calculate_cost(int w, int d){
        double cost = 0;
        if (d <= 100 && w <= 10) {
            cost = 100 * 3.5;
        } else if (d <= 200 && w <= 20) {
            cost = 200 * 4.5;
        } else if (d <= 300 && w <= 30) {
            cost = 300 * 5.5;
        } else {
            cost = d*3 + w*6.5;
        }

        return cost;

    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVehicle_id() {

           return this.vehicle.getCode() ;

    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getPickup_city() {
        return pickup_city;
    }

    public void setPickup_city(String pickup_city) {
        this.pickup_city = pickup_city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        setStatus("Assigned");
    }
}
