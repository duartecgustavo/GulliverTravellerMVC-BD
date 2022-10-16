package br.com.gtraveller.implementacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.gtraveller.beans.Cidade;
import br.com.gtraveller.beans.Usuario;

public class TesteCidade {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Cidade> listaCidades = new ArrayList<Cidade>();
		
		listaCidades.add(new Cidade(1,"SÃO PAULO", "SÃO PAULO", "SP", "BRASIL", "BR"));
		listaCidades.add(new Cidade(2,"RIO DE JANEIRO", "RIO DE JANEIRO", "RJ", "BRASIL", "BR"));
		listaCidades.add(new Cidade(3,"FLORIANÓPÓLIS", "SANTA CATARINA", "SC", "BRASIL", "BR"));
		listaCidades.add(new Cidade(4,"SALVADOR", "BAHIA", "BH", "BRASIL", "BR"));
		listaCidades.add(new Cidade(5,"ORLANDO", "FLORIDA", "FL", "ESTADOS UNIDOS", "US"));
		
		for(Cidade cidade:listaCidades) {
			System.out.println(cidade);
		}		
	}

}
