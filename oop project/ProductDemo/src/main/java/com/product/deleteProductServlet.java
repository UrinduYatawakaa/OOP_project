package com.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteProductServlet")
public class deleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		boolean isTrue;
		
		isTrue = ProductDBUtil.deleteCustomer(id);
		
		if(isTrue == true) {
			
			List<Product> productDetails = ProductDBUtil.getAll();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("searchbarAdmin.jsp");
			dis.forward(request, response);
		}
		
		else {
			
			List<Product> productDetails = ProductDBUtil.getAll();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
			
		}
	}

}
