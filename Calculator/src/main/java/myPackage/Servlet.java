package myPackage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class MyServlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String joke[]= {
			"Why do Java developers wear glasses? Because they don't C#!",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
	};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		String var=request.getParameter("btn");
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		int op=Integer.parseInt(var);
		int ans = 0;
		switch(op)
		{
		case 1:
			ans=num1+num2;
			break;
		case 2:
			 ans=num1-num2;
			break;
		case 3:
			 ans=num1*num2;
			break;
		case 4:
			 ans=num1/num2;
			break;
		}
		
		
		
		int randomeNumber=(int) (Math.random()*joke.length);
		String randomeJoke=joke[randomeNumber];
		
		response.sendRedirect("index.jsp?ans="+ans+"&randomeJoke="+randomeJoke);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}