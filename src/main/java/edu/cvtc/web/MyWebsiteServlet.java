package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MyWebsiteServlet
 */
@WebServlet("/MyWebsiteServlet")

public class MyWebsiteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<html><head><title>My Website</title>");
		response.getWriter().append("<style>body{text-align: center;background-color: #A1E1DB;}");
		response.getWriter().append("header{font-family: Calibri, sans-serif;font-size: 24pt;color: #1efad2;background-color: #fa1eb4;border-style: outset;border-width: small;border-color: #db1a9a;border-radius: 25px;}");
		response.getWriter().append("footer{font-family: Calibri, san-serif;border-style: outset;border-width: small;border-color: #db1a9a;position: fixed;bottom: 0;width: 100%;border-radius: 25px;}");
		response.getWriter().append("ul{list-style-type: none; margin: -20px;padding: -20px;font-family: Calibri, sans-serif;font-size: 24pt;color: #AABEE4;border-radius: 25px;border-style: outset;border-width: small;border-color: #71C4BB;background-color: #469E95;position: center;left: 80px;top: 145px;width: 80%}");
		response.getWriter().append("li{display: inline;text-decoration: none;color: #AABEE4}"
				+ "p{position: center; font-family: Calibri, sans-serif;}</style></head>");
		response.getWriter().append("<body><header><h1>Heather Johnson's Webpage</h1></header>");
		response.getWriter().append("<ul><li><a href='MyWebsiteServlet'>Home</a></li>\t");
		response.getWriter().append("<li><a href='ContactServlet'>Contact</a></li>\t<li><a href='AboutServlet'>About</a></li></ul>");
		response.getWriter().append("<section><p>Welcome to my website!</p></section><footer><p>&copy; Heather Johnson 2016</p></footer></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
