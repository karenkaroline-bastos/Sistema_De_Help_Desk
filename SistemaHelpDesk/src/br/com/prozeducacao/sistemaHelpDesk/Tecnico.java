package br.com.prozeducacao.sistemaHelpDesk;

public class Tecnico {
	private String nomeTecnico;
	private String especialidade;
	
	public Tecnico(String nomeTecnico,String especialidade) {
		this.nomeTecnico = nomeTecnico;
		this.especialidade = especialidade;
	}

	
	// Getters e Setters
	//Método "get" para retornar valor - Sempre retorna uma valor com o tipo do atributo
	//Método "set" para alterar ou inserir valor
	//this é para acessar os atributos
	
	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}

	
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
	String exibirTecnico() {
		return nomeTecnico + " - " + especialidade;
	}

}
