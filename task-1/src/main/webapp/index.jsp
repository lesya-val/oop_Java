<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tomcat Example</title>
    <link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div class="container">
        <h1>Вычисление тригонометрических функций</h1>

        <div class="content">
            <form action="hello" method="POST">
                <span>Угол: </span>
                <input type = "number" name = "angle" />
                <br><br>

                <span>Единица измерения угла: </span>
                <input type = "radio" name = "angle-type" value = "Радианы"/>Радианы
                <input type = "radio" name = "angle-type" value = "Градусы"/>Градусы
                <br><br>

                <span>Тригонометрическая функция: </span>
                <select name="math-function">
                    <option value = "sin"> Sin(x) </option>
                    <option value = "cos"> Cos(x) </option>
                    <option value = "tg"> Tg(x) </option>
                    <option value = "ctg"> Ctg(x) </option>
                </select>
                <br><br>

                <input type = "submit" value = "Вычислить" />
        </form>
        </div>
    </div>
</body>
</html>