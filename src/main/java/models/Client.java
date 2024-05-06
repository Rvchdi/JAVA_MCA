package models;
import java.util.Date;

public class Client {

    private static String name;
    private static String cin;
    private static String address;
    private static String birthdate;
    private static String email;
    private static String password;

    // Constructor
    public Client(String name, String cin, String address, String birthdate,String email,String pwd) {
        this.name = name;
        this.cin = cin;
        this.address = address;
        this.birthdate = birthdate;
        this.email = email;
        this.password = pwd;
    }

    // Getters and Setters

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public static String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static String getPassword() {
        return password;
    }
}
