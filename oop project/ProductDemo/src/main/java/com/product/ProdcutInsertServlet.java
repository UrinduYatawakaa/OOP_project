package com.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProdcutInsertServlet")
public class ProdcutInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String category = request.getParameter("category");
		
		boolean isTrue;
		
		isTrue = ProductDBUtil.InsertProduct(name, price, category);

		if(isTrue == true) {
			
			List<Product> productDetails = ProductDBUtil.getAll();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("searchbarAdmin.jsp");
			dis.forward(request, response);
		}
		
		else {
			
			List<Product> productDetails = ProductDBUtil.getAll();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("searchbarAdmin.jsp");
			dis.forward(request, response);
			
		}
	}

}
