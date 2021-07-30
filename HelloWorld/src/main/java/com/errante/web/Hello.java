package com.errante.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userName = request.getParameter("name");
		String lenguaje = request.getParameter("lenguaje");
		String ciudad = request.getParameter("ciudad");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(userName==null) {
			userName = "unknown";
		}
		if(lenguaje==null) {
			lenguaje = "unknown";
		}if(ciudad ==null)
		{
			ciudad="desconocido";
			
		}
		out.write("<h1>bienvenido "+userName+"</h1>");
		out.write("<h1>Tu lenguaje favorito es:  "+lenguaje+"</h1>");
		out.write("<h1>y eres de  "+ciudad+"</h1>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
