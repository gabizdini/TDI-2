package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Rotas
@WebServlet(urlPatterns = {""})
public class TestController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		//String addr = req.getRequestURI();
		String hora = Calendar.getInstance().getTime().toLocaleString();
		PrintWriter writer = resp.getWriter();
		//writer.append(addr);
		
		writer.append("<p>" + hora + "</p>");
	}
}
