package br.com.gtraveller.implementacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.gtraveller.beans.Hospedagem;
import br.com.gtraveller.beans.Usuario;

public class TesteHospedagem {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Hospedagem> listaHospedagens = new ArrayList<Hospedagem>();
		
		listaHospedagens.add(new Hospedagem(1, "Residencia", "FLORIANÓPOLIS"));
		listaHospedagens.add(new Hospedagem(2, "Residencia", "SÃO PAULO"));
		listaHospedagens.add(new Hospedagem(3, "Hotel", "PARIS"));
		listaHospedagens.add(new Hospedagem(4, "Hotel", "LAS VEGAS"));
		listaHospedagens.add(new Hospedagem(5, "Hotel", "RIO DE JANEIRO"));
		
		for(Hospedagem hospedagem:listaHospedagens) {
			System.out.println(hospedagem);
		}		
	}
}
