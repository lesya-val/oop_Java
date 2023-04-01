package com.example.task2;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "contacts-servlet", value = "/contacts-servlet")
public class ContactsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println(
                "<head>" +
                   "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "<title>Contacts</title>\n" +
                    "<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                    "<link href=\"style.css\" rel=\"stylesheet\">" +
                "</head>"
        );
        out.println("<body>");
        out.println(
                "<header id=\"header\">\n" +
                "        <nav class=\"navbar navbar-expand-lg bg-light\">\n" +
                "            <div class=\"container\">\n" +
                "                <a href=\"#\" class=\"navbar-brand\">\n" +
                "                    <img src=\"img/logo.svg\" width=\"150\" height=\"150\" alt=\"\">\n" +
                "                </a>\n" +
                "                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navContent\" aria-controls=\"navContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "                    <span class=\"navbar-toggler-icon\"></span>\n" +
                "                </button>\n" +
                "                <div class=\"collapse navbar-collapse\" id=\"navContent\">\n" +
                "                    <ul class=\"navbar-nav mr-auto mb-3 mb-lg-0\">\n" +
                "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\">Главная</a></li>\n" +
                "                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Контакты</a></li>\n" +
                "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"aboutUs-servlet\">О нас</a></li>\n" +
                "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"control-servlet\">Контроль качества</a></li>\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </nav>\n" +
                "    </header>"
        );
        out.println(
                "<section class=\"d-flex align-items-center justify-content-center mb-5 mt-5\">\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"row justify-content-center\">\n" +
                "                <div class=\"col-md-6 col-lg-8\">\n" +
                "                    <h1 class=\"text-center\">Контактная информация</h1>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row mt-5 row-cols-3 justify-content-center\">\n" +
                "                <div class=\"column text-center\">\n" +
                "                    <h2>Адрес</h2>\n" +
                "                    <p>г.Москва, Щелковское шоссе, <br> д.100, стр.7, офис 108</p>\n" +
                "                    <p>Режим работы: с 10:00 до 20:00</p>\n" +
                "                </div>\n" +
                "\n" +
                "                <div class=\"column text-center\">\n" +
                "                    <h2>Телефон</h2>\n" +
                "                    <p>+7(406)345-32-46</p>\n" +
                "                </div>\n" +
                "\n" +
                "                <div class=\"column text-center\">\n" +
                "                    <h2>E-mail</h2>\n" +
                "                    <p>hlebnica@mail.ru</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </section>"
        );
        out.println(
                " <div class=\"container\">\n" +
                "        <footer class=\"d-flex flex-wrap justify-content-between align-items-center py-2 my-3 border-top bg-light\">\n" +
                "            <p class=\"col-md-4 mb-0 text-muted\">© 2021 Company, Inc</p>\n" +
                "            <ul class=\"nav col-md-4 justify-content-end\">\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link text-muted\" href=\"index.jsp\">Главная</a></li>\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link text-muted\" href=\"#\">Контакты</a></li>\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link text-muted\" href=\"aboutUs-servlet\">О нас</a></li>\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link text-muted\" href=\"control-servlet\">Контроль качества</a></li>\n" +
                "            </ul>\n" +
                "        </footer>\n" +
                "    </div>\n" +
                "    <script src=\"js/bootstrap.bundle.min.js\"></script>"
        );
        out.println("</body></html>");
    }

    public void destroy() {
    }
}