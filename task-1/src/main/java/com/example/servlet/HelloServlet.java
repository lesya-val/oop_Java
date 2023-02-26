package com.example.servlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String angle = request.getParameter("angle");
        String angleType = request.getParameter("angle-type");

        double angle_number = Double.parseDouble(angle);
        angle_number = (angleType.equals("Radians")) ? angle_number : (angle_number * (Math.PI / 180));

        String[] mathFunctions = request.getParameterValues("math-function");
        try {
            writer.println("<html><head><style> " +
                    "body {padding: 20px;}" +
                    "h1 {font-size: 38px;}" +
                    ".container {display: flex; align-items: center; justify-content: space-evenly; flex-direction: column; min-height: 80%;}" +
                    ".content {text-align: center; border: 2px solid red; padding: 30px;}" +
                    "p {font-size: 23px;}" +
                    "span {font-weight: 600;}");
                writer.println("</style></head>");

                writer.println("<body>");
                    writer.println("<div class = container>");
                        writer.println("<h1> Вычисление тригонометрических функций </h1>");
                        writer.println("<div class = 'content'>");
                            writer.println("<p><span> Angle: </span>" + angle + "</p>");
                            writer.println("<p><span> Angle type: </span>" + angleType + "</p>");
                            writer.println("<p><span> Math function: </span></p>");

                            for (String mathFunction : mathFunctions) {

                            switch (mathFunction) {
                                case "sin": {
                                    String result = String.format("sin(%s) = %.3f", angle, Math.sin(angle_number));
                                    writer.println("<p>" + result + "</p>");
                                    break;
                                }
                                case "cos": {
                                    String result = String.format("cos(%s) = %.3f", angle, Math.cos(angle_number));
                                    writer.println("<p>" + result + "</p>");
                                    break;
                                }
                                case "tg": {
                                    String result = String.format("tg(%s) = %.3f", angle, Math.tan(angle_number));
                                    writer.println("<p>" + result + "</p>");
                                    break;
                                }
                                case "ctg": {
                                    String result = String.format("ctg(%s) = %.3f", angle, 1 / Math.tan(angle_number));
                                    writer.println("<p>" + result + "</p>");
                                    break;
                                }
                            }
                        }
                        writer.println("</div>");
                    writer.println("</div>");

            writer.println("</body></html>");
        } finally {
            writer.close();
        }
    }
}