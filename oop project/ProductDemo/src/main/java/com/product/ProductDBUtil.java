package com.product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProductDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	// Retrieve products based on the provided name (search functionality)
	public static List<Product> getProduct (String name){
		
		ArrayList<Product> product = new ArrayList<>();
		
		
		
		try {
			//String sql = "select * from product_details where product_name='%''"+name+"''%'";
			con = DBConnect.getConnction();
			stmt = con.createStatement();
			String sql = "SELECT * FROM product_details WHERE product_name LIKE '%" + name + "%'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String productName = rs.getString(2);
				double price = rs.getDouble(3);
				String category = rs.getString(4);
				
				Product p = new Product(id,productName,price,category);
				product.add(p);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
		return product;
		
	}
	
	// Insert a new product into the database
	public static boolean InsertProduct(String name, String price, String category) {
		
		boolean isSuccess = false;
		
		
		try {
			con = DBConnect.getConnction();
			stmt = con.createStatement();
            double Price = Double.parseDouble(price); // Convert the String to a double 
            
			String sql = "insert into product_details values (0,'"+name+"','"+Price+"','"+category+"')";
			int rs = stmt.executeUpdate(sql); //update to query
			
			if(rs>0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	// Update product details in the database
	public static boolean updateProduct(String id, String name, String price, String category) {
		
		try {
			con = DBConnect.getConnction();
			stmt = con.createStatement();
			
			double Price = Double.parseDouble(price);
			
			String sql = "update product_details set product_name='"+name+"', product_price='"+Price+"', product_category='"+category+"' where idproduct_details='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	// Retrieve product details based on the provided product ID
	public static List<Product> getProdcutDetails(String id){
		
		int convertID = Integer.parseInt(id);
		
		ArrayList<Product> product = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnction();
			stmt = con.createStatement();
			String sql = "SELECT * FROM product_details WHERE idproduct_details='" + convertID + "'";
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int ID = rs.getInt(1);
				String productName = rs.getString(2);
				double price = rs.getDouble(3);
				String category = rs.getString(4);
				
				Product p = new Product(ID,productName,price,category);
				product.add(p);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	// Retrieve products based on the provided category
	public static List<Product> getCategory(String category){
		
		
		ArrayList<Product> product = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnction();
			stmt = con.createStatement();
			String sql = "SELECT * FROM product_details WHERE product_category='" + category + "'";
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int ID = rs.getInt(1);
				String productName = rs.getString(2);
				double price = rs.getDouble(3);
				String categoryy = rs.getString(4);
				
				Product p = new Product(ID,productName,price,categoryy);
				product.add(p);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	// Retrieve all products from the database
public static List<Product> getAll(){
		
		
		ArrayList<Product> product = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnction();
			stmt = con.createStatement();
			String sql = "SELECT * FROM product_details";
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int ID = rs.getInt(1);
				String productName = rs.getString(2);
				double price = rs.getDouble(3);
				String categoryy = rs.getString(4);
				
				Product p = new Product(ID,productName,price,categoryy);
				product.add(p);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}

// Delete a product from the database based on the provided product ID
public static boolean deleteCustomer(String id) {
	
	int convertID = Integer.parseInt(id);
	
	try {
		
		con = DBConnect.getConnction();
		stmt = con.createStatement();
		String sql = "DELETE FROM product_details WHERE idproduct_details ='" + convertID + "'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}
	
}
