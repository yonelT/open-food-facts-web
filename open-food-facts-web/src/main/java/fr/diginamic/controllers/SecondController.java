package fr.diginamic.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/second/*")
public class SecondController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
	
		
		HttpSession session = req.getSession(true);
		//Object utilisateur = session.getAttribute("utilisateur");
		Object utilisateur = req.getAttribute("utilisateur");
		resp.getWriter().write("User: "+ utilisateur);
		
		
		
	}

}

