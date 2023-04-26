package servlets;

import.io.java.IOException

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="IndexServlet", urlPatterns="/")
public class IndexServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response )
    throws ServletException, IOException {
        response.getWriter().println("OI Servlet!!!");
        response.getWriter().close();
    }
    
}