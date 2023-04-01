<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">
</head>
<body>
    <%--Header--%>
    <header id="header" class="fixed-top">
        <nav class="navbar navbar-expand-lg">
            <div class="container">
                <a href="#" class="navbar-brand">
                    <img src="img/logo.svg" width="150" height="150" alt="">
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navContent" aria-controls="navContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navContent">
                    <ul class="navbar-nav mr-auto mb-3 mb-lg-0">
                        <li class="nav-item"><a class="nav-link active" href="#">Главная</a></li>
                        <li class="nav-item"><a class="nav-link" href="contacts-servlet">Контакты</a></li>
                        <li class="nav-item"><a class="nav-link" href="aboutUs-servlet">О нас</a></li>
                        <li class="nav-item"><a class="nav-link" href="control-servlet">Контроль качества</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <%--Image--%>
    <section id="image" class="mb-5"></section>
    <%--Services--%>
    <section id="services" class="d-flex align-items-center justify-content-center mb-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6 col-lg-8">
                    <h1 class="text-center">Вся продукция в наших пекарнях изготавливается вручную с домашней заботой, теплотой и любовью</h1>
                </div>
            </div>
            <div class="row mt-5 row-cols-2 justify-content-center">
                <p>Вся продукция в наших пекарнях приготовлена руками наших пекарей со старанием и любовью.</p>
                <p>В наших пекарнях мы начинаем работу ранним утром, чтобы на завтрак вы смогли порадовать себя домашней выпечкой.</p>
                <p>Натуральные ингредиенты, ручная лепка и современные технологии — вот секрет выпечки из нашей пекарни.</p>
                <p>Свежий хлеб, пироги, выпечка, печенье — каждый Гость найдет продукцию, которая подарит истинное наслаждение от качественной и вкусной выпечки.</p>
            </div>

            <div class="row mt-5 row-cols-3 justify-content-center">
                <img src="img/home_1.jpg" alt="/">
                <img src="img/home_2.jpg" alt="/">
                <img src="img/home_3.jpg" alt="/">
            </div>

            <div class="row mt-5 row-cols-2 justify-content-center">
                <img src="img/home_4.jpg" alt="/">
                <img src="img/home_5.jpg" alt="/">
            </div>
        </div>
    </section>
    <%--Footer--%>
    <div class="container">
        <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
            <p class="col-md-4 mb-0 text-muted">© 2021 Company, Inc</p>

            <a href="/" class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
                <img src="img/logo.svg" width="150" height="150" alt="">
            </a>

            <ul class="nav col-md-4 justify-content-end">
                <li class="nav-item"><a class="nav-link text-muted" href="#">Главная</a></li>
                <li class="nav-item"><a class="nav-link text-muted" href="contacts-servlet">Контакты</a></li>
                <li class="nav-item"><a class="nav-link text-muted" href="aboutUs-servlet">О нас</a></li>
                <li class="nav-item"><a class="nav-link text-muted" href="control-servlet">Контроль качества</a></li>
            </ul>
        </footer>
    </div>
    <script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>


