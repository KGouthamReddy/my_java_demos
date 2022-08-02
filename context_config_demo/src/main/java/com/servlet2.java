package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	ServletConfig config = getServletConfig();
    	PrintWriter out = response.getWriter();
    	out.println("<h1>Accessing Content parameters in Servlet 2</h1>");
    	out.println("sql = " + config.getInitParameter("sql"));
    	out.println("xMessage = " + config.getInitParameter("message"));
    	
    	out.println("<h1>Accessing Content parameters in Servlet 2</h1>");
    	ServletContext applications = getServletContext();
    	out.println("Driver Name = " + applications.getInitParameter("driver"));
    	out.println("Url = " + applications.getInitParameter("url"));
    	
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
