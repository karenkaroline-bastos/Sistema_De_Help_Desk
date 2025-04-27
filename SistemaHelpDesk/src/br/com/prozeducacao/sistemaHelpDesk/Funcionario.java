package br.com.prozeducacao.sistemaHelpDesk;

public class Funcionario {
	//Todo atributo DEVE ser privado
	private String nomeFuncionario;
	private String email;
	private String setor;

	public Funcionario(String nomeFuncionario,String email, String setor) {
		this.setNomeFuncionario(nomeFuncionario);
		this.setEmail(email);
		this.setSetor(setor);
	}

	//Método "get" para retornar valor - Sempre retorna uma valor com o tipo do atributo
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	//Método "set" para alterar ou inserir valor
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;  //this é para acessar os atributos
	}

	
	//Método "get" para retornar valor - Sempre retorna uma valor com o tipo do atributo
	public String getEmail() {
		return email;
	}
	
	//Método "set" para alterar ou inserir valor
	public void setEmail(String email) {
		this.email = email; //this é para acessar os atributos
	}
	
	
	//Método "get" para retornar valor - Sempre retorna uma valor com o tipo do atributo
	public String getSetor() {
		return setor;
	}

	//Método "set" para alterar ou inserir valor
	public void setSetor(String setor) {
		this.setor = setor; //this é para acessar os atributos
	}

	String exibirFuncionario() {
		return nomeFuncionario + " - " + setor + " - " + email;
	}
}
