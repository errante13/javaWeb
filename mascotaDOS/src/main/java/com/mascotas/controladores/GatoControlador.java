package com.mascotas.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mascotas.modelos.Gato;


@WebServlet("/GatoControlador")
public class GatoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GatoControlador() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String raza = request.getParameter("raza");;
		int peso =Integer.parseInt(request.getParameter("peso"));
		
		Gato gato = new Gato(nombre,raza,peso);
		
		request.setAttribute("gato", gato);
		
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/mostrarGato.jsp");
		vista.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
