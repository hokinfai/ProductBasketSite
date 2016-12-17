package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.ProductImp;
import com.example.dao.ProductService;
import com.example.dao.SingleFactory;
import com.example.model.Product;

public class Startup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Startup() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ProductService service = new ProductImp();
		List<Product> allItem = service.getAllProduct();
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Product List</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");

		out.println("<table border=\" 1px\"><tr><th>Name</th><th>Price</th><th>Category</th><th>Description</th><th>In Stock</th><th>Add to Basket</th></tr>");
		for (Product p : allItem) {
			out.println("<form action=\"/ProductBasketSite/addProduct\" method=\"post\">");
			out.println("<input type=\"hidden\" name = \"productID\"  value = \""
					+ p.getId() + "\"/>");
			out.println("<tr><td>"
					+ p.getProductName()
					+ "</td><td>"
					+ p.getUnitPrice()
					+ "</td><td>"
					+ p.getCategory()
					+ "</td><td>"
					+ p.getDescription()
					+ "</td><td>"
					+ p.getInStock()
					+ "</td><td><input type=\"submit\" value=\"Add\"></input></td></tr>");
			out.println("</form>");
		}
		out.println("</table></BODY>");
		out.println("</HTML>");
	
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
