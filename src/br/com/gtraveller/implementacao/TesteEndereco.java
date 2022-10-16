package br.com.gtraveller.implementacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.gtraveller.beans.Endereco;
import br.com.gtraveller.beans.Usuario;

public class TesteEndereco {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Endereco> listaEnderecos = new ArrayList<Endereco>();
		
		listaEnderecos.add(new Endereco(1, "Avenida Faria Paulista", "1654", "Bela Vista", "SÃO PAULO", "08423-423"));
		listaEnderecos.add(new Endereco(2, "Avenue Vegas", "543", "Park Vegas", "LAS VEGAS", "432-7654-789"));
		listaEnderecos.add(new Endereco(3, "Street Orlandando", "34", "Orlando Central", "ORLANDO", "543-6543-234"));
		listaEnderecos.add(new Endereco(4, "Avenida Ipanema", "555", "Ipanema", "RIO DE JANEIRO", "00044-543"));
		listaEnderecos.add(new Endereco(5, "Avenue Cesar de Cesar", "434", "Roma brooklyn", "ROMA", "435-423-123"));
		
		for(Endereco endereco:listaEnderecos) {
			System.out.println(endereco);
		}		

	}
}
