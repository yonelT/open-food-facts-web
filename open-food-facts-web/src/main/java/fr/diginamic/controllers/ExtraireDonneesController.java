package fr.diginamic.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/extraire/*")
public class ExtraireDonneesController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		//req.getPathInfo(); c'est quoi?
	
		// recupere la valeur d'un parametre dont le nom est idCategorie
		String idCategorie = req.getParameter("idCategorie");
		// code HTML ecrit dans le corps de la reponse
		resp.getWriter().write("<h1>Categorie à extraire</h1>"
		+ "<ul>"
		+ "<li>identifiant="+ idCategorie + "</li>"
		+ "</ul>");
		
		HttpSession session = req.getSession(true);
		
		//session.setAttribute("utilisateur", "Yonel");
		
		req.setAttribute("utilisateur", "Toussay");
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/second");
		dispatcher.forward(req, resp);
		
		
		
	}

}