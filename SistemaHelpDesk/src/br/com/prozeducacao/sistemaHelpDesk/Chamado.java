package br.com.prozeducacao.sistemaHelpDesk;

//Classe que representa um chamado de suporte técnico
public class Chamado {
	// Atributos principais do chamado
	private String titulo;
	private String descricao;
	private Funcionario funcionario; 			// Quem abriu o chamado
	private String dataAbertura;
	private String status;
	
	// Construtor - cria o chamado com os dados iniciais
	public Chamado(String titulo,String descricao, Funcionario funcionario, String dataAbertura, String status) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.funcionario = funcionario;
		this.dataAbertura = dataAbertura;
		this.status = "ABERTO"; 				// Padrão inicial);
		
	}

	// Getters e Setters
	//Método "get" para retornar valor - Sempre retorna uma valor com o tipo do atributo
	//Método "set" para alterar ou inserir valor
	//this é para acessar os atributos
	
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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
	
	

	String exibirChamados() {
		return "Titulo: " + titulo + " \n"
				+ "Descrição: " + descricao + " \n"
				+ "Funcionario: " + funcionario.getNomeFuncionario() + " \n"
				+ "Data Abertura: " + dataAbertura + "\n"
				+ "Status: " + status + "\n"
				+ "------------------------------------------" + "\n";
	}

	public Object getTecnico() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTecnico(Tecnico tecnico) {
		// TODO Auto-generated method stub
		
	}

}
