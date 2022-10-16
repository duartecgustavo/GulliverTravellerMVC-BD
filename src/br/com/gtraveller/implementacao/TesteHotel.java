package br.com.gtraveller.implementacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.gtraveller.beans.Hotel;
import br.com.gtraveller.beans.Usuario;

public class TesteHotel {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Hotel> listaHoteis = new ArrayList<Hotel>();

		listaHoteis.add(new Hotel(1, 5, "SÃO PAULO", "Avenida Faria Paulista, 1654", "R$350", "Proximo a estação Faria Lima da linha Amarela", "Proibido fumar", "hoteldossonhos@hoteldossonhos.com", "", "hoteldossonhos.com.br", "2543-2334"));
		listaHoteis.add(new Hotel(2, 4, "LAS VEGAS", "Avenue Vegas, 543", "$500", "Near lotus casino", "Permitido fumar", "thebestofvegas@thebestofvegas.com", "", "thebestofvegas.com", "321 543-2334"));
		listaHoteis.add(new Hotel(3, 2, "ORLANDO", "Orlandando, 34", "$350", "Proximo a estação Faria Lima da linha Amarela", "Proibido fumar", "hotelando@hotelando.com", "", "hotelando.com.br", "123 433-3422"));
		listaHoteis.add(new Hotel(4, 3, "RIO DE JANEIRO", "Avenida Ipanema ,555", "R$450", "Em frente a praia", "Proibido fumar", "ipanemapallace@ipanemapallace.com", "", "ipanemapallace.com.br", "25 4233-4242"));
		listaHoteis.add(new Hotel(5, 5, "ROMA", "Avenue Cesar de Cesar, 434", "¢¢150", "Proximo ao coliseu", "Permitido fumar", "colisiumpallace@colisiumpallace.com", "", "colisiumpallace.com.br", "1010 543-233"));
	
		for(Hotel hotel:listaHoteis) {
			System.out.println(hotel);
		}		
	}
}
