
package com.mycompany.project1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        
        int sum = num1 + num2;
        
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Result: " + sum + "</h1>");
    }
}


