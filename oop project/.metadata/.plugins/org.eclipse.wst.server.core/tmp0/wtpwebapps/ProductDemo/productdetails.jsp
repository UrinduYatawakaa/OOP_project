<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/stylesheader.css" type="text/css">
    <title>Simple Header and Footer</title>
</head>

<body>
    <header>
        <div class="container">
            <h1>My Website</h1>
            <nav>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Feedback</a></li>
                    <li><a href="#">Cart</a></li>
                    <li><a href="#">Payment</a></li>
                    <li><a href="#">Contact Us</a></li>
                </ul>
            </nav>
            <div class="search-bar">
                <form action="log" method="post">
                    <input type="text" name="ProductName" placeholder="Search...">
                    <input type="submit" name="submit" value="Search">
                </form>
            </div>
            
        </div>
    </header>

    <!-- Content Goes Here -->

    <footer>
        <div class="container">
            <p>&copy; 2023 My Website. All rights reserved.</p>
        </div>
    </footer>
</body>

</html>
