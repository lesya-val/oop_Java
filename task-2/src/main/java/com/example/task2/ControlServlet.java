package com.example.task2;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "control-servlet", value = "/control-servlet")
public class ControlServlet extends HttpServlet {

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
                        "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"contacts-servlet\">Контакты</a></li>\n" +
                        "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"aboutUs-servlet\">О нас</a></li>\n" +
                        "                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Контроль качества</a></li>\n" +
                        "                    </ul>\n" +
                        "                </div>\n" +
                        "            </div>\n" +
                        "        </nav>\n" +
                        "    </header>"
        );
        out.println(
            "<section>\n" +
                    "        <div class=\"container\">\n" +
                    "            <div class=\"row mt-5 mb-5 row-cols-2 justify-content-center\">\n" +
                    "                <div class=\"p-5\">\n" +
                    "                    <h2 class=\"pb-3\">Качественные ингредиенты</h2>\n" +
                    "                    <p>\n" +
                    "                        Весь хлеб и выпечка в Хлебнице изготавливаются вручную на основе муки из тщательно отобранной пшеницы\n" +
                    "                        и содержат только натуральные ингредиенты.\n" +
                    "                        <br><br>\n" +
                    "                        Мы используем знания и современные технологии, чтобы испечь для вас действительно вкусный хлеб и выпечку.\n" +
                    "                    </p>\n" +
                    "                </div>\n" +
                    "            <img src=\"img/control_1.jpg\">\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"row mt-5 mb-5 row-cols-2 justify-content-center\">\n" +
                    "                <img src=\"img/control_2.jpg\">\n" +
                    "                <div class=\"p-5\">\n" +
                    "                    <h2 class=\"pb-3\">Любимые клиенты</h2>\n" +
                    "                    <p>\n" +
                    "                        В наших пекарнях со всем вниманием и заботой относятся к каждому клиенту, ведь он — наш Гость.\n" +
                    "                        <br><br>\n" +
                    "                        Здесь он встретит дружелюбные улыбки наших сотрудников, почувствует уютную атмосферу наших пекарен и оценит высокий сервис обслуживания.\n" +
                    "                    </p>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"row mt-5 mb-5 row-cols-2 justify-content-center\">\n" +
                    "                <div class=\"p-5\">\n" +
                    "                    <h2 class=\"pb-3\">Прислушиваемся к каждому совету и рекомендации</h2>\n" +
                    "                    <p>\n" +
                    "                        Мы внимательно относимся к отзывам, советам и рекомендациям, которые поступают от наших Гостей и партнёров.\n" +
                    "                        <br><br>\n" +
                    "                        Мы всегда стараемся решить все возникающие проблемы в короткие сроки, и это помогает нам совершенствовать нашу работу и становиться лучше.\n" +
                    "                    </p>\n" +
                    "                </div>\n" +
                    "                <img src=\"img/control_3.jpg\">\n" +
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
                        "                <li class=\"nav-item\"><a class=\"nav-link text-muted\" href=\"contacts-servlet\">Контакты</a></li>\n" +
                        "                <li class=\"nav-item\"><a class=\"nav-link text-muted\" href=\"aboutUs-servlet\">О нас</a></li>\n" +
                        "                <li class=\"nav-item\"><a class=\"nav-link text-muted\" href=\"#\">Контроль качества</a></li>\n" +
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