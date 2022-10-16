package br.com.gtraveller.beans;

public class Hospedagem {

	private int id;
	private String tipo;
	private String cidade;
	
//	CONSTRUCTORS
	
	public Hospedagem() {
		super();
	}
	
	public Hospedagem(int id, String tipo, String cidade) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cidade = cidade;
	}

//GETTERS & SETTERS
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

//	toString

	@Override
	public String toString() {
		return "Hospedagem [id=" + id + ", tipo=" + tipo + ", cidade=" + cidade + "]";
	}
		
}
