package br.com.gtraveller.beans;

public class Residencia {

	private int id;
	private int classificacao;
	private String cidade;
	private String endereco;
	private String valor;
	private String localizacao;
	private String obs;
	private String foto;
	private String contato;
	
//	CONSTRUCTORS
	
	public Residencia() {
		super();
	}	
	
	public Residencia(int id, int classificacao, String cidade, String endereco, String valor, String localizacao,
			String obs, String foto, String contato) {
		super();
		this.id = id;
		this.classificacao = classificacao;
		this.cidade = cidade;
		this.endereco = endereco;
		this.valor = valor;
		this.localizacao = localizacao;
		this.obs = obs;
		this.foto = foto;
		this.contato = contato;
	}
	
	//GETTERS & SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

//toString
	
	@Override
	public String toString() {
		return "Residencia [id=" + id + ", classificacao=" + classificacao + ", cidade=" + cidade + ", endereco="
				+ endereco + ", valor=" + valor + ", localizacao=" + localizacao + ", obs=" + obs + ", foto=" + foto
				+ ", contato=" + contato + "]";
	}
}
