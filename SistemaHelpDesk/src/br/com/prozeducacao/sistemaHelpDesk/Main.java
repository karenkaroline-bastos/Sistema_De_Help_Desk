package br.com.prozeducacao.sistemaHelpDesk;

import javax.swing.JOptionPane;

public class Main {
	

	public static void main(String[] args) {
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "1. Cadastrar Funcionário\n"
					+ "2. Cadastrar Técnico\n"
					+ "3. Cadastrar Chamado\n"
					+ "4. Atribuir Técnico ao Chamado\n"
					+ "5. Listar de Chamados\n"
					+ "6. Atualizar Status do Chamado\n"
					+ "0. Sair"));
			
			
			switch (opcao) {
			case 1:
				String nomeFuncionario = JOptionPane.
						showInputDialog("Informe o nome do(a) funcionario(a): ");
				String setor = JOptionPane.
						showInputDialog("Informe o setor do(a) " + nomeFuncionario);
				String email = JOptionPane.
						showInputDialog("Informe o e-mail do(a) " + nomeFuncionario);
				break;
			
			case 2:
				String nomeTecnico = JOptionPane.
					showInputDialog("Informe o nome do(a) Tecnico(a): ");
				String especialidade = JOptionPane.
						showInputDialog("Informe a especialidade do(a) " + nomeTecnico);
				break;
				
			case 3:
				String titulo = JOptionPane.
						showInputDialog("Informe Título: ");
				String descricao = JOptionPane.
						showInputDialog("Informe ouma Descrição: ");
				String funcionario = JOptionPane.
						showInputDialog("Informe o nome do(a) funcionario(a): ");
				String tecnico = JOptionPane.
						showInputDialog("Informe o nome do(a) Tecnico(a): ");
				String dataAbertura = JOptionPane.
						showInputDialog("Informe a data da abertura: ");
				String status = JOptionPane.
						showInputDialog("Status do Chamado: Aberto");
				break;

			case 4:
				
				break;
			case 5:
				break;
				
			case 6:
				break;

			case 0:
				break;
			}
		} while (opcao != 0);
	}
}