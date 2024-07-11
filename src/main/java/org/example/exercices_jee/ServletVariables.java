package org.example.exercices_jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="servletVariables", value = "/servletVariables")
public class ServletVariables extends HttpServlet {
    private List<Person> people;


    @Override
    public void init() throws ServletException {
        System.out.println("Serveur lancé");
        people = new ArrayList<>();
        Person person1 = new Person("Adèle", "Delval", 4);
        people.add(person1);
        Person person2 = new Person("Lea", "Delval", 2);
        people.add(person2);
        Person person3 = new Person("Lisa", "Delval", 9);
        people.add(person3);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Passage par le doGet");
        req.setAttribute("people", people);
        getServletContext().getRequestDispatcher("/servletVariables.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("Passage par le destroy");
    }


}
