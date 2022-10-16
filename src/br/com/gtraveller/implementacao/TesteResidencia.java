package br.com.gtraveller.implementacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.gtraveller.beans.Residencia;
import br.com.gtraveller.beans.Usuario;

public class TesteResidencia {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Residencia>listaResidencias = new ArrayList<Residencia>();
		
		listaResidencias.add(new Residencia(1, 4, "SÃO PAULO", "Avenida Brigadeiro Faria Lima", "R$500", "Proximo a Paulista", "Pet Friendly", "", "apesp2@yayahoo.com"));
		listaResidencias.add(new Residencia(2, 3, "PARIS", "Avenue Eiffel", "$$300", "près de la tour eiffek", "pas de fumée", "", "apesp3@lolohoo.com"));
		listaResidencias.add(new Residencia(3, 4, "FLORIANÓPOLIS", "Avenida Floripense", "R$350", "Proximo a aos acessos a praia", "Pode fumar", "", "apesp3@laland.com"));
		listaResidencias.add(new Residencia(4, 5, "SALVADOR", "Rua Salvador Dali", "R$650", "Bem perto da praia", "Pet Friendly, proibido fumar", "", "apesp4@bombom.com"));
		listaResidencias.add(new Residencia(5, 3, "RIO DE JANEIRO", "Avenida Princesa Isabel", "R$800", "2 quarteirões de copacabana", "Pode fumar", "", "apesp5@copabom.com"));
		
		for(Residencia residencia:listaResidencias) {
			System.out.println(residencia);
		}		

	}

}
