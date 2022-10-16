package br.com.gtraveller.implementacao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.gtraveller.beans.Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(new Usuario(1,"ADMIN", "Gulliver Viajante", "gulliver@gtraveller.com", "abcd", "MASCULINO", "", "1198888-8888", new Date(01/8/1996),new Date(20/6/2022), "SÃO PAULO" ));
		listaUsuarios.add(new Usuario(2,"USER", "Leila Viajante", "leila@gtraveller.com", "1234", "FEMININO", "", "1194444-4444", new Date(25/3/1998),new Date(22/7/2022), "BAHIA" ));
		listaUsuarios.add(new Usuario(3,"USER", "Claudemir Viajante", "claudemir@gtraveller.com", "4321", "MASCULINO", "", "1193333-3333", new Date(01/5/1992),new Date(20/4/2022), "PARIS" ));
		listaUsuarios.add(new Usuario(4,"USER", "Renata Viajante", "renata@gtraveller.com", "qwer", "FEMININO", "", "1192222-2222", new Date(13/5/1995),new Date(13/8/2022), "CURITIBA" ));
		listaUsuarios.add(new Usuario(5,"USER", "Vinicius Viajante", "vini@gtraveller.com", "9876", "MASCULINO", "", "1191111-1111", new Date(12/6/1994),new Date(17/2/2022), "CAMPINAS" ));
		
		
		for(Usuario usuario:listaUsuarios) {
			System.out.println(usuario);
		}		
	}
}
