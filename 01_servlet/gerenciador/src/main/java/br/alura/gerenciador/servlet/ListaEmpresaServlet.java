package br.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "listaEmpresa", urlPatterns = { "/listaEmpresas" })
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		
		List<Empresa> listas = banco.getEmpresas();
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<ul>");
		
		for (Empresa empresa : listas) {
			out.println("<li>"+ empresa.getNome() +"</li>");
		}
		
		out.println("</ul>");
		
		out.println("</body>");
		out.println("</html>");
	}

	
}