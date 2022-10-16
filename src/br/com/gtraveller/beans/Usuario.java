package br.com.gtraveller.beans;

import java.sql.Date;

public class Usuario {

	private int id;
	private String nivel;
	private String nome;
	private String email;
	private String senha;
	private String genero;
	private String foto;
	private String fone;
	private Date  nascimento;
	private Date  ultimoAcesso;
	private String cidade;
	
//	CONSTRUCTORS
	
	public Usuario() {
		super();
	}
	
	public Usuario(int id, String nivel, String nome, String email, String senha, String genero, String foto, String fone,
			Date nascimento, Date ultimoAcesso, String cidade) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.genero = genero;
		this.foto = foto;
		this.fone = fone;
		this.nascimento = nascimento;
		this.ultimoAcesso = ultimoAcesso;
		this.cidade = cidade;
	}
	
//	GETTERS & SETTERS
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
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
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}
	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
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
		return "Usuario [id=" + id + ", nivel=" + nivel + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", genero=" + genero + ", foto=" + foto + ", fone=" + fone + ", nascimento=" + nascimento
				+ ", ultimoAcesso=" + ultimoAcesso + ", cidade=" + cidade + "]";
	}
	
}
