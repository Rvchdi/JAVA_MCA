package controllers;

import dao.UserDao;
import dao.UserDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Client;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@WebServlet(name = "UserController", value = {"/login","/signup","/success","/client/login","/client/add"})
public class UserController extends HttpServlet {
    private final String LOGIN = "/TRANSPORT-APP/Views/Guest/login.jsp";
    private final String SIGNUP = "/TRANSPORT-APP/Views/Guest/signup.jsp";
    private final String SUCCESS = "/TRANSPORT-APP/Views/Guest/success.jsp";

    UserDao dao = new UserDaoImp();

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        int id;
        switch (path) {
            case "/signup":
                req.getRequestDispatcher(SIGNUP).forward(req, resp);
            case "/login":
                req.getRequestDispatcher(LOGIN).forward(req, resp);
            case "/success":
                req.getRequestDispatcher(SUCCESS).forward(req, resp);
        }
        if(req.getServletPath().equals("/login")){
            req.getRequestDispatcher(LOGIN).forward(req,resp);
        }
        else{
            HttpSession session = req.getSession(true);
            session.invalidate();
            System.out.println("Disconnected");
            resp.sendRedirect(req.getContextPath()+"/login");
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom, adresse, cin, date,email,pwd;
        UserDaoImp dao = new UserDaoImp();
        String path = req.getServletPath();
        Client client;
        switch (path) {
            case "/client/login":
                String Email = req.getParameter("email");
                String password = req.getParameter("pwd");
                boolean isAuthenticated = ((UserDaoImp) dao).login(Email, password);
                if (isAuthenticated) {
                    System.out.println("Login successful for: " + Email);
                    resp.sendRedirect(req.getContextPath() + "/success");
                } else {
                    resp.sendRedirect(req.getContextPath() + "/login?error=true");
                }
                break;
            case "/client/add":
                nom = req.getParameter("name");
                adresse = req.getParameter("address");
                cin = req.getParameter("cin");
                date = req.getParameter("birthdate");
                email = req.getParameter("email");
                pwd = req.getParameter("pwd");

                if (date != null && !date.isEmpty()) {
                    try {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                        LocalDate birthDate = LocalDate.parse(date, formatter);
                        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        String monthYear = birthDate.format(monthFormatter);
                        System.out.println(monthYear);
                        client = new Client(nom, cin, adresse, monthYear,email,pwd);
                        dao.add(client);
                    } catch (DateTimeParseException e) {
                        // Handle parsing error
                        System.out.println("Error parsing birthdate: " + e.getMessage());
                    }
                } else {

                    System.out.println("Birthdate parameter is null or missing.");
                }

                System.out.println(nom + " " + adresse + " " + cin + " " + date);
                resp.sendRedirect(req.getContextPath() + "/success");


        }
    }

}



