//package com.example.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.example.dao.BasketImp;
//import com.example.dao.BasketService;
//import com.example.dao.ProductImp;
//import com.example.dao.ProductService;
//import com.example.model.Basket;
//import com.example.model.Product;
//
///**
// * Servlet implementation class Basket
// */
//public class BasketPage extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private Basket basket;
//
//	public BasketPage() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	protected void doGet(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//
//		int id = Integer.parseInt(request.getParameter("productID"));
//		System.out.println(id);
//		ProductService service = new ProductImp();
//		BasketService basSer = new BasketImp();
//
//		basket = basSer.getBasket("Basket 1");
//
//		Product product = service.getSingleProduct(id);
//		System.out.println("-------------------");
//		System.out.println(product);
//		basket.addProduct(product);
//		basSer.save(basket);
//		service.save(product);
//
//		List<Product> allItem = basket.getProductList();
//		// List<Integer> quantity = new ArrayList<Integer>();
//		List<String> productInfor = new ArrayList<String>();
//		for (Product p : allItem) {
//			productInfor.add(p.getProductName() + ", " + p.getUnitPrice()
//					+ ", " + p.getCategory());
//		}
//
//		System.out.println("________________________");
//
//		PrintWriter out = response.getWriter();
//		out.println("<HTML>");
//		out.println("<HEAD>");
//		out.println("<TITLE>Basket List</TITLE>");
//		out.println("</HEAD>");
//		out.println("<BODY>");
//		out.println("<table border=\" 1px\"><tr><th>Name</th><th>Price</th><th>Category</th><th>Quantity</th><th>Total</th></tr>");
//		Set<String> uniqueSet = new HashSet<String>(productInfor);
//		for (String temp : uniqueSet) {
//			String[] productSpilt = temp.split(", ");
//			double price = Double.parseDouble(productSpilt[1]);
//			int quantity = Collections.frequency(productInfor, temp);
//			out.println("<tr><td>" + productSpilt[0] + "</td><td>"
//					+ productSpilt[1] + "</td><td>" + productSpilt[2]
//					+ "</td><td>" + quantity + "</td><td>" + price * quantity
//					+ "</td></tr>");
//		}
//
//		out.println("</table>"
//				+ "<a href =\"/ProductBasketSite/Home\">Home</a></BODY>");
//
//		out.println("</HTML>");
//
//	}
//}
