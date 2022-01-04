package br.alura.gerenciador_2.servlet;

public class Empresa {  
	
	
	private Integer id;
	
	private String nome;
	
	
	public Empresa(String nome) {
		this.nome = nome;
	}
	
	public Empresa() {
		this("");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	
	
	

}
