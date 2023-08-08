package com.multicampus.w1.calc;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet(name = "CalcResultServlet" , urlPatterns = "/calcResult")

public class CalcResultServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                int num1 = Integer.parseInt(request.getParameter("num1"));
                int num2 = Integer.parseInt(request.getParameter("num2"));
                int result = num1 + num2 ;
                                    System.out.println(result);
                                    response.sendRedirect("/index");

    }
}
