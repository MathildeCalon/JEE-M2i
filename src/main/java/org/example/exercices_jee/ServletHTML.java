package org.example.exercices_jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "html", value = "/html")
public class ServletHTML extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Serveur lancé");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Passage par le doGet");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>HTML</h1>");
        out.println("<p>Et encore un peu.</p>");
        out.println("</html></body>");
    }

    @Override
    public void destroy() {
        System.out.println("Passage par le destroy");
    }
}
