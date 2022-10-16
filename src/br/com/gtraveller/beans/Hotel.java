package br.com.gtraveller.beans;

public class Hotel {
	
	private int id;
	private int classificacao;
	private String cidade;
	private String endereco;
	private String valor;
	private String localizacao;
	private String obs;
	private String Email;
	private String foto;
	private String fone;
	private String site;

//	CONSTRUCTORS
	
	public Hotel() {
		super();
	}
	
	public Hotel(int id, int classificacao, String cidade, String endereco, String valor, String localizacao, String obs,
			String email, String foto, String site,  String fone) {
		super();
		this.id = id;
		this.classificacao = classificacao;
		this.cidade = cidade;
		this.endereco = endereco;
		this.valor = valor;
		this.localizacao = localizacao;
		this.obs = obs;
		Email = email;
		this.foto = foto;
		this.site = site;
		this.fone = fone;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
//toString
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", classificacao=" + classificacao + ", cidade=" + cidade + ", endereco=" + endereco
				+ ", valor=" + valor + ", localizacao=" + localizacao + ", obs=" + obs + ", Email=" + Email + ", foto="
				+ foto + ", site=" + site + "]";
	}

}
