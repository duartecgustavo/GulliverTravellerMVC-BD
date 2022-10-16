package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.CidadeDao;
import dao.DataSource;
import model.Cidade;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataSource;
import dao.UsuarioDao;
import model.Cidade;
import model.Usuario;
@WebServlet("/cadastrar_usuario")
public class CadastrarUsuarioServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		String pagina = "";
		
		try {
			
			ArrayList<Cidade> cidades = this.listarCidades();
			request.setAttribute("ListaCidades", cidades);
			pagina = "/cadastrar_usuario.jsp";
		}
		catch (Exception e) {
			pagina = "/erro.jsp";
		}
		
		
		RequestDispatcher dispatecher = getServletContext().getRequestDispatcher(pagina); 
		dispatecher.forward(request, response);
	
	}
	
	private ArrayList<Cidade> listarCidades(){
		DataSource dataSource = new DataSource();
		CidadeDao cidadeDao = new CidadeDao(dataSource);
		
		return (ArrayList<Cidade>)cidadeDao.read();
	}

}
