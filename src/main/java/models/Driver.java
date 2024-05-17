package models;

public class Driver {

    private static int code;
    private static String name;
    private static String CIN;
    private static int salary;
    private static String address;
    private static int availability;

    public Driver() {
    }

    public Driver(String name, String CIN, int salary, String address, boolean availability) {
        Driver.name = name;
        Driver.CIN = CIN;
        Driver.salary = salary;
        Driver.address = address;
        Driver.availability = 0;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Driver.name = name;
    }

    public static String getCIN() {
        return CIN;
    }

    public static void setCIN(String CIN) {
        Driver.CIN = CIN;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Driver.salary = salary;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Driver.address = address;
    }

    public static int isAvailability() {
        return availability;
    }

    public static void setAvailability(int availability) {
        Driver.availability = availability;
    }
}
