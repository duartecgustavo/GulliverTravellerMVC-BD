package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dao.CidadeDao;
import dao.DataSource;
import model.Cidade;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataSource;
import dao.UsuarioDao;
import model.Cidade;
import model.Usuario;

@WebServlet("/efetivar_cadastro")
public class EfetivarCadastro extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paginaDestino = "";
		
		try {
			
			Usuario usuario = new Usuario();
			
			Cidade cidade =new Cidade();
			cidade.setId(Integer.parseInt(request.getParameter("ddlCidade")));
			usuario.setCidade(cidade);
			
			usuario.setEmail(request.getParameter("email"));
			usuario.setFoto(request.getParameter("foto"));
			usuario.setGenero(request.getParameter("genero"));
			usuario.setNascimento(
					LocalDate.parse(request.getParameter("data_nascimento"), DateTimeFormatter.ofPattern("yyyy-MM-dd"))
					);
			usuario.setNivel(request.getParameter("acesso"));
			usuario.setNome(request.getParameter("nome"));
			usuario.setSenha(request.getParameter("senha"));
			
			DataSource dataSource = new DataSource();
			UsuarioDao usuarioDao = new UsuarioDao(dataSource);
			usuarioDao.create(usuario);
			dataSource.getConnection().close();
			
			paginaDestino = "/sucesso.jsp";
			
			RequestDispatcher dispatecher = getServletContext().getRequestDispatcher(paginaDestino); 
			dispatecher.forward(request, response);
			
			
		}
		catch(Exception ex) {
			request.setAttribute("ErroMSG", "Erro desconhecido no cadastro");
			ex.printStackTrace();
			paginaDestino = "/erro.jsp";
			
			RequestDispatcher dispatecher = getServletContext().getRequestDispatcher(paginaDestino); 
			dispatecher.forward(request, response);
		}
		
		
	}
	

}
