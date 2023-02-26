<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tomcat Example</title>
    <style>
        body {
            padding: 20px;
        }
        h1 {
            font-size: 38px;
            margin-top: 55px;
        }
        .container {
            display: flex;
            align-items: center;
            justify-content: space-evenly;
            flex-direction: column;
            min-height: 80%;
        }
        .content {
            text-align: center;
            border: 2px solid red;
            padding: 40px;
            margin: 50px;
            font-size: 23px;
        }
        input {
            font-size: 20px;
        }

        select {
            font-size: 20px;
        }
        span {
            font-weight: 600;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Вычисление тригонометрических функций</h1>

        <div class="content">
            <form action="hello" method="POST">
                <span>Angle: </span>
                <input type = "number" name = "angle" />
                <br><br>

                <span>Angle type: </span>
                <input type = "radio" name = "angle-type" value = "Radians"/>Radians
                <input type = "radio" name = "angle-type" value = "Degrees"/>Degrees
                <br><br>

                <span>Math functions: </span>
                <select name="math-function">
                    <option value = "sin"> Sin(x) </option>
                    <option value = "cos"> Cos(x) </option>
                    <option value = "tg"> Tg(x) </option>
                    <option value = "ctg"> Ctg(x) </option>
                </select>
                <br><br>

                <input type = "submit" value = "Submit" />
        </form>
        </div>
    </div>
</body>
</html>