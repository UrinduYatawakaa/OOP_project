<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/stylesheader.css" type="text/css">
    <link rel="stylesheet" href="css/stylesHomepage.css" type="text/css">
    <title>Simple Header and Footer</title>
</head>

<body>
    <header> 
        <div class="container">
            <h1>InstantMarket</h1>
            <nav>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Feedback</a></li>
                    <li><a href="#">Cart</a></li>
                    <li><a href="#">Payment</a></li>
                    <c:url value="AllServlet" var="BeveragesURL">
           				<c:param name="category" value="Beverages"/>
           			 </c:url>
                   	<li><a href="${BeveragesURL}">Admin</a></li>
                
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

        <!-- feature card start    -->
    <div class = "featurecard">
        <div class = "card">
            <div class = "card-image card1"></div>
            <h2>Beverages</h2>
            <p>Indulge in unparalleled beverage bliss at our online oasis. Savor exquisite flavors meticulously crafted to perfection. Immerse yourself in a world where every sip is a symphony of taste. Experience convenience, quality, and delight delivered to your doorstep. Elevate your beverage experience with us, your ultimate online destination.</p>
            
            <c:url value="categoryServlet" var="BeveragesURL">
           				<c:param name="category" value="Beverages"/>
            </c:url>
            <a href="${BeveragesURL}" >Check Beverages</a>
        </div>

        <div class = "card">
            <div class = "card-image card2"></div>
            <h2>Grocery</h2>
            <p>Indulge in a seamless grocery shopping experience with us! Discover a world of freshness and convenience at your fingertips. From farm-fresh produce to pantry essentials, we offer a curated selection, doorstep delivery, and exceptional service. Shop with us today and elevate your grocery experience like never before!</p>
            
            <c:url value="categoryServlet" var="GroceryURL">
           				<c:param name="category" value="Grocery"/>
            </c:url>
            <a href="${GroceryURL}" >Check Grocery Items</a>
        </div>

        <div class = "card">
            <div class = "card-image card3"></div>
            <h2>Fresh</h2>
            <p>Indulge in a culinary journey like never before with our exquisite selection of fresh items, sourced daily for unparalleled quality and flavor. From crisp organic produce to succulent meats, our website is your gateway to a world of freshness. Elevate your dining experience with every bite, delivered right to your doorstep</p>
            
            <c:url value="categoryServlet" var="FreshURL">
           				<c:param name="category" value="Fresh"/>
            </c:url>
            <a href="${FreshURL}" >Check Fresh Items</a>
        </div>

        <div class = "card">
            <div class = "card-image card4"></div>
            <h2>Frozen</h2>
            <p>Indulge in a frosty paradise at your fingertips! Discover unparalleled quality and freshness in our curated selection of premium frozen delights. From gourmet meals to exotic treats, our website offers a symphony of flavors. Elevate your culinary experience with us. Delight in convenience; savor the extraordinary. Your frozen paradise awaits!</p>
            
            <c:url value="categoryServlet" var="FrozenURL">
           				<c:param name="category" value="Frozen"/>
            </c:url>
            <a href="${FrozenURL}" >Check Frozen Items</a>
        </div>
    </div>


    <footer>
        <div class="container">
            <p>&copy; 2023 InstantMarket. All rights reserved.</p>
        </div>
    </footer>
</body>

</html>
