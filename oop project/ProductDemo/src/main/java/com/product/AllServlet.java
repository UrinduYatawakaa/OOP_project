package com.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class for handling requests related to all products
@WebServlet("/AllServlet")
public class AllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// Handles HTTP GET requests
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve category parameter from the request
		String category = request.getParameter("category");
		
		// Retrieve all product details from the ProductDBUtil class
		List<Product> productDetails = ProductDBUtil.getAll();
			request.setAttribute("productDetails", productDetails);
			
			// Set the retrieved product details as an attribute in the request object
			RequestDispatcher dis = request.getRequestDispatcher("searchbarAdmin.jsp");
			dis.forward(request, response);
		
		
	
	}

}
