package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.BasketImp;
import com.example.dao.BasketService;
import com.example.dao.ProductImp;
import com.example.dao.ProductService;
import com.example.dao.SingleFactory;
import com.example.model.Basket;
import com.example.model.BasketItem;
import com.example.model.Product;

/**
 * Servlet implementation class Basket
 */
public class BasketPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Basket bk;

	public BasketPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("productID"));
		ProductService service = new ProductImp();
		BasketService basSer = new BasketImp();
		bk = basSer.getBasket(2);
		Product product = service.getSingleProduct(id);
		List<BasketItem> bi = bk.getProductList();
		boolean inBasket = false;
		for (BasketItem b : bi) {
			System.out.println(b.getProduct().getProductName());
			if ((b.getProduct().getProductName()).equals(product
					.getProductName())) {
				System.out.println(b.getQuantity());
				b.setQuantity(b.getQuantity() + 1);
				service.save(b);
				inBasket = true;
			}
		}
		if (!inBasket) {
			BasketItem newbi = new BasketItem();
			bi.add(newbi);
			newbi.setProduct(product);
			newbi.setBasket(bk);
			newbi.setQuantity(1);
			service.save(newbi);
		}
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Basket List</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<table border=\" 1px\"><tr><th>Name</th><th>Price</th><th>Category</th><th>Quantity</th><th>Total</th></tr>");
		double total = 0;
		for (BasketItem b : bi) {
			total += b.getProduct().getUnitPrice() * b.getQuantity();
			out.println("<tr><td>" + b.getProduct().getProductName()
					+ "</td><td>" + b.getProduct().getUnitPrice() + "</td><td>"
					+ b.getProduct().getCategory() + "</td><td>"
					+ b.getQuantity() + "</td><td>"
					+ b.getProduct().getUnitPrice() * b.getQuantity()
					+ "</td></tr>");
		}
		out.println("<tr><td></td><td></td><td></td><td>Total Amount:</td><td>"
				+ total + "</td></tr></table>");
		out.println("</table>"
				+ "<a href =\"/ProductBasketSite/Home\">Home</a></BODY>");

		out.println("</HTML>");
	}
}
