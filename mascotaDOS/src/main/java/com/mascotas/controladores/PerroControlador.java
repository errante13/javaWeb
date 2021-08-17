package com.mascotas.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mascotas.modelos.Perro;


@WebServlet("/PerroControlador")
public class PerroControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PerroControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String raza = request.getParameter("raza");;
		int peso =Integer.parseInt(request.getParameter("peso"));
		
		Perro perro = new Perro(nombre,raza,peso);
		
		request.setAttribute("perro", perro);
		
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/mostrarPerro.jsp");
		vista.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
