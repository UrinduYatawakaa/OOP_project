<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Products</title>
    <link rel="stylesheet" href="css/ProductInsert.css">
</head>

<body>
    <div class="container">
        <h2>Add Product</h2>
        <form id="productForm" action="insert" method="post">
            <div class="input-group">
                <label for="productName">Product Name</label>
                <input type="text" id="productName" name="name" placeholder="Enter product name" required>
            </div>
            <div class="input-group">
                <label for="price">Price</label>
                <input type="text" id="price" name="price" placeholder="Enter price" required>
            </div>
            <div class="input-group">
                <label>Category</label>
                <div class="category-options">
                    <input type="radio" id="category1" name="category" value="Beverages" required>
                    <label for="category1">Beverages</label>
                    <input type="radio" id="category2" name="category" value="Grocery" required>
                    <label for="category2">Grocery</label>
                    <input type="radio" id="category3" name="category" value="Fresh" required>
                    <label for="category3">Fresh</label>
                    <input type="radio" id="category4" name="category" value="Frozen" required>
                    <label for="category4">Frozen</label>
                </div>
            </div>
            <button type="submit" name="submit" onclick="validateForm()">Add Product</button>
        </form>
    </div>
	    <script>function validateForm() {
	        var productName = document.getElementById("productName").value;
	        var price = document.getElementById("price").value;
	        var category = document.querySelector('input[name="category"]:checked');

	        if (productName === "" || price === "" || category === null) {
	            alert("All fields are required!");
	        } else if (isNaN(parseFloat(price))) {
	            alert("Price must be a valid number!");
	        } else {
	            // Form is valid, you can submit it or perform other actions here
	            // For example, you can submit the form using document.getElementById("productForm").submit();
	            alert("Form submitted successfully!");
	        }
	    }

	    
	    </script>
</body>

</html>
