package com.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datadao.Datadao;
import com.loginmodel.Loginmodel;

/**
 * Servlet implementation class Loginservlet
 */
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action=request.getParameter("action");
		if(action.equals("edit"))
		{
			String userid=request.getParameter("userid");
			Datadao d=new Datadao();
                  Loginmodel model= d.fetch(Integer.parseInt(userid));	
                  
                  request.setAttribute("data", model);
                  RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
                  rd.forward(request, response);
			
		}
		
		else if(action.equals("update"))
		{
			String id=request.getParameter("id");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String language=request.getParameter("language");
			String city=request.getParameter("city");
			
			Loginmodel model=new Loginmodel();
			
			
			model.setUsername(username);
			model.setPassword(password);
			model.setAddress(address);
			model.setEmail(email);
			model.setGender(gender);
			model.setLang(language);
			model.setCity(city);
			model.setId(Integer.parseInt(id));
			
			
			Datadao da=new Datadao();
			
		String s=da.update(model);
		
		
		if(s.equals("done"))
		{
			
	
			RequestDispatcher rd=request.getRequestDispatcher("Showdata");
			rd.forward(request, response);
		}
			
		}
		else 
		{
			String userid=request.getParameter("userid");
			Datadao d=new Datadao();
			
		String s2=	d.delete(Integer.parseInt(userid));
		if(s2.equals("done"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Showdata");
			rd.forward(request, response);
		}
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pr=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String language=request.getParameter("language");
		 String[] lang = request.getParameterValues("lang");
		  for(int i=0; i<lang.length; i++){
		  pr.println("<br>Language : " + lang[i]);

		String city=request.getParameter("city");
		
		Loginmodel model=new Loginmodel();
		
		
		model.setUsername(username);
		model.setPassword(password);
		model.setAddress(address);
		model.setEmail(email);
		model.setGender(gender);
		model.setCity(city);
		
		
		Datadao da=new Datadao();
		
	String s=da.insert(model);
	
	
	if(s.equals("done"))
	{
		String m="data inserted" ;
		request.setAttribute("user", m);
		RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
		rd.forward(request, response);
	}
		
		
		
		
		
	}
	}
}
