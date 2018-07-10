package javawebwork3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class loginservlet extends HttpServlet {
	public loginservlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		Object username=session.getAttribute("username");
		Object password=session.getAttribute("password");
		System.out.println(username+":"+password);
		//session.invalidate();
		response.sendRedirect("login.jsp");
		
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		 
		 if ("0164576".equals(username) && "123456".equals(password)) {
	            HttpSession session = request.getSession();  
	            session.setAttribute("username", username);  
	            session.setAttribute("password", password);
	            session.setAttribute("logginged", false);
	            response.sendRedirect("index.jsp");
	           
	        } else {
	            response.sendRedirect("login.jsp");  
	        } 
	

	}

	public void init() throws ServletException {
		// Put your code here
	}

}
