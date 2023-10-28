<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/stylesheader.css" type="text/css">
    <link rel="stylesheet" href="css/category.css" type="text/css">
    <title>Search Results</title>
</head>
<header>
    <div class="container">
        <h1>InstantMarket</h1>
        <nav>
            <ul>
                <li><a href="homePage.jsp">Home</a></li>
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

<body>
    <div class="container2">
        <h1>Search Results...</h1>
        <table class="cart">
            <thead>
                <tr>
                    <th>Product Name</th>
                    <th>Product Price</th>
                    <th>Product Category</th>
                    <th>Action</th>
                </tr>
            </thead>
            <c:forEach var="product" items = "${productDetails}" >
        
            <c:set var="id" value="${product.id}"/>
            <c:set var="name" value="${product.name}"/>
            <c:set var="price" value="${product.price}"/>
            <c:set var="category" value="${product.category}"/>
            
            <tbody>
                <tr>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.category}</td>
                    <td><a href="#" class="add-to-cart-button">Add to Cart</a></td>
                </tr>

        </c:forEach>
        </tbody>

        </table>
    </div>
</body>
    <footer>
        <div class="container">
            <p>&copy; 2023 InstantMarket. All rights reserved.</p>
        </div>
    </footer>


</html>
