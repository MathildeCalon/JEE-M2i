package org.example.exercices_jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="Servlet3", value="/servlet3")
public class Servlet3 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Serveur lancé");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Passage par le doGet");
        getServletContext().getRequestDispatcher("/servlet3.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("Passage par le destroy");
    }

}
