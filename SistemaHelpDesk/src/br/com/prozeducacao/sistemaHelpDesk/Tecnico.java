package br.com.prozeducacao.sistemaHelpDesk;

public class Tecnico {
	private String nomeTecnico;
	private String especialidade;
	
	public Tecnico(String nomeTecnico,String especialidade) {
		this.setNomeTecnico(nomeTecnico);
		this.setEspecialidade(especialidade);
	}

	
	
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
