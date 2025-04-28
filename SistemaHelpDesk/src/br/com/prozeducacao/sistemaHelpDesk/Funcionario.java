package br.com.prozeducacao.sistemaHelpDesk;

public class Funcionario {
	//Todo atributo DEVE ser privado
	private String nomeFuncionario;
	private String email;
	private String setor;
	

	public Funcionario(String nomeFuncionario,String email, String setor) {
		this.nomeFuncionario = nomeFuncionario;
		this.email = email;
		this.setor= setor;
	}

	
	// Getters e Setters
	//Método "get" para retornar valor - Sempre retorna uma valor com o tipo do atributo
	//Método "set" para alterar ou inserir valor
	//this é para acessar os atributos
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;  
	}

	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email; 
	}
	
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor; 
	}

		
	String exibirFuncionario() {
		return nomeFuncionario + " - " + setor + " - " + email;
	}
}
