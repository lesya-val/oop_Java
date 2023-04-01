package com.example.task2;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "aboutUs-servlet", value = "/aboutUs-servlet")
public class AboutUsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println(
                "<head>" +
                        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                        "<title>About</title>\n" +
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
                        "                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">О нас</a></li>\n" +
                        "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"control-servlet\">Контроль качества</a></li>\n" +
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
                "                <img src=\"img/photo.jpg\">\n" +
                "                <div class=\"p-5 bg-light\">\n" +
                "                    <h2>2014</h2>\n" +
                "                    <p>История создания сети пекарен Хлебница началась в 2014 году, <br>\n" +
                "                        когда была открыта первая пекарня в г. Ижевске на улице Красноармейская, 132.</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "<div class=\"row justify-content-center\">\n" +
                "                <div class=\"col-md-6 col-lg-8\">\n" +
                "                    <h1 class=\"text-center\">Вкус настоящей домашней выпечки</h1>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row mt-5 mb-5 row-cols-2 justify-content-center\">\n" +
                "                <p>Наша продукция готовится исключительно из натуральных продуктов без использования красителей, ароматизаторов и усилителей вкуса.\n" +
                "                    Поэтому вкус изделий из Хлебницы — это вкус настоящей домашней выпечки.</p>\n" +
                "                <p>Мы вкладываем душу в нашу работу, используя только лучшие ингредиенты, потому что все, что мы делаем, мы делаем с любовью.\n" +
                "                    Порадуйте себя, своих родных и близких, ведь вы дарите не только вкусную и натуральную выпечку - вы дарите здоровье, радость и любовь.</p>\n" +
                "            </div>" +
                "<div class=\"row mb-5 row-cols-2 justify-content-center\">\n" +
                "                <img src=\"img/about_1.jpg\">\n" +
                "                <img src=\"img/about_2.jpg\">\n" +
                "            </div>" +
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
                        "                <li class=\"nav-item\"><a class=\"nav-link text-muted\" href=\"#\">О нас</a></li>\n" +
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