package org.example.exercices_jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name= "brut", value = "/brut")
public class ServletBrut extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Serveur lancé");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Passage par le doGet");
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("<Du texte brut");
        out.println("Et encore un peu.");
    }

    @Override
    public void destroy() {
        System.out.println("Passage par le destroy");
    }
}
