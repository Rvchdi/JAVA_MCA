package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import dao.EntrepriseDao;
import dao.EntrepriseDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Entreprise;
import models.Client;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "entreprise", value = {"/login","/signup","/success","/entreprise", "/client/add", "/entreprise/edit", "/entreprise/delete"})
public class EntrepriseController extends HttpServlet {
    private final String LOGIN = "/TRANSPORT-APP/Views/index.jsp";
    private final String SIGNUP = "/TRANSPORT-APP/Views/signup.jsp";
    private final String SUCCESS = "/TRANSPORT-APP/Views/success.jsp";
    private final String INDEX = "/WEB-INF/views/entreprises/index.jsp";
    private final String CREATE = "/WEB-INF/views/entreprises/form.jsp";
    private final String EDIT = "/WEB-INF/views/entreprises/edit.jsp";
    private EntrepriseDao dao = new EntrepriseDaoImp();

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
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom, adresse, cin, date,email,pwd;

        String path = req.getServletPath();
        Client client;
        switch (path) {
            case "/client/add":
                nom = req.getParameter("name");
                adresse = req.getParameter("address");
                cin = req.getParameter("cin");
                date = req.getParameter("birthdate");
                email = req.getParameter("email");
                pwd = req.getParameter("pwd");

                if (date != null && !date.isEmpty()) {
                    try {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
                        LocalDate birthDate = LocalDate.parse(date, formatter);
                        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("uuuu/MM/dd");
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
