package br.com.prozeducacao.sistemaHelpDesk;

public class Chamado {
	private String titulo;
	private String descricao;
	private String funcionario;
	private String tecnico;
	private String dataAbertura;
	private String status;
	
	
	public Chamado(String titulo,String descricao, String funcionario, String tecnico, String dataAbertura, String status) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.setFuncionario(funcionario);
		this.setTecnico(tecnico);
		this.setDataAbertura(dataAbertura);
		this.setStatus(status);
		
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}


	public String getTecnico() {
		return tecnico;
	}


	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}


	public String getDataAbertura() {
		return dataAbertura;
	}


	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	String exibirChamado() {
		return "Titulo: " + titulo + " \n"
				+ "Descrição: " + descricao + " \n"
				+ "Funcionario: " + funcionario + " \n"
				+ "Tecnico: " + tecnico + "\n"
				+ "Data Abertura:" + dataAbertura + "\n"
				+ "Status" + status;
	} 

}
