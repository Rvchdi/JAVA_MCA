package controllers;

import dao.DriverDaoImp;
import dao.OrderDaoImp;
import dao.VehicleDao;
import dao.VehicleDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import jakarta.servlet.http.HttpSession;
import models.Client;
import models.Driver;
import models.Order;
import models.Vehicle;

@WebServlet(name = "OrderController", value = {"/order","/order/add"})
public class OrderController extends HttpServlet {
    private final String ORDER_SHIPMENT = "/TRANSPORT-APP/Views/users/Order.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        switch (path) {
            case "/order":
                req.getRequestDispatcher(ORDER_SHIPMENT).forward(req, resp);
                return;
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        VehicleDaoImp VehicleDao = new VehicleDaoImp();
        OrderDaoImp OrderDao = new OrderDaoImp();
        String shipname, shiptype, start_destination, destination, initial_date, date;
        int weight, distance;
        shipname = req.getParameter("shipment_name");
        shiptype = req.getParameter("shipment_type");
        initial_date = req.getParameter("date");
        System.out.println(initial_date);
        date = dateHandler(initial_date);
        start_destination = req.getParameter("start_destination");
        destination = req.getParameter("destination");
        weight = Integer.parseInt(req.getParameter("weight"));
        distance = Integer.parseInt(req.getParameter("distance"));
        String path = req.getServletPath();
        switch (path) {
            case "/order/add":
                Vehicle vehicle = VehicleDao.SearchVehicle(weight);
                if(vehicle != null){
                    System.out.println(vehicle.getCode());
                    System.out.println(vehicle.getCapacity());
                    Order order = new Order(1, shipname, shiptype, weight, start_destination, date, destination, distance);
                    order.setVehicle(vehicle);
                    System.out.println("THIS IS THE OUTPUT :"+order.getVehicle_id()          );
                    OrderDao.add(order);


                }else{
                    System.out.println("No Truck found.");
                }





        }
    }

    public String dateHandler(String date) {
        if (date != null && !date.isEmpty()) {
            try {
                System.out.println("Input date: " + date);

                // Input date format
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate newDate = LocalDate.parse(date, inputFormatter);

                // Output date format for MySQL database
                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String formattedDate = newDate.format(outputFormatter);

                System.out.println("Formatted date: " + formattedDate);

                return formattedDate;
            } catch (DateTimeParseException e) {
                System.out.println("Error parsing date: " + e.getMessage());
                return null;
            }
        } else {
            System.out.println("Date parameter is null or missing.");
            return null;
        }
    }
}