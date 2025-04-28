package br.com.prozeducacao.sistemaHelpDesk;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HelpDesk {
	
	
	private static final Funcionario i = null;

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		List<Tecnico> tecnicos = new ArrayList<Tecnico>();
		List<Chamado> chamados = new ArrayList<Chamado>();
		
		
		// Menu principal
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
			
					// Método para cadastrar um novo funcionário
			case 1:
				String nomeFuncionario = JOptionPane.
						showInputDialog("Informe o nome do(a) funcionario(a): ");		
				String setor = JOptionPane.
						showInputDialog("Informe o setor do(a) " + nomeFuncionario);
				String email = JOptionPane.
						showInputDialog("Informe o e-mail do(a) " + nomeFuncionario);
				
				Funcionario f = new Funcionario(nomeFuncionario, email, setor);
			    funcionarios.add(f);
			    
			    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
				break;
			
				
				 // Método para cadastrar um novo técnico	
			case 2:
				String nomeTecnico = JOptionPane.
					showInputDialog("Informe o nome do(a) Tecnico(a): ");
				String especialidade = JOptionPane.
						showInputDialog("Informe a especialidade do(a) " + nomeTecnico);
				Tecnico t = new Tecnico(nomeTecnico, especialidade);
				tecnicos.add(t);
				
				JOptionPane.showMessageDialog(null, "Técnico cadastrado com sucesso!");
				
				break;
				
				
				// Método para cadastrar um novo chamado
			case 3:
				String titulo = JOptionPane.
						showInputDialog("Título do Chamado: ");
				String descricao = JOptionPane.
						showInputDialog("Descrição do Chamado: ");
				
				String lista = "Selecione o funcionário:\n";
		        for (int i = 0; i < funcionarios.size(); i++) {
		            lista += i + " - " + funcionarios.get(i).getNomeFuncionario() + "\n";
		        }

		        int indice = Integer.parseInt(JOptionPane.showInputDialog(lista));
		        Funcionario funcionario = funcionarios.get(indice);

				
				/*for (Funcionario funcionario : funcionarios) {
					if (funcionario.getNomeFuncionario().equals(funcionario)) {
						f1 = funcionario;
					}
				}*/
				String dataAbertura = JOptionPane.
						showInputDialog("Informe a data da abertura: ");
				String status = "ABERTO";
				
				
				Chamado c = new Chamado(titulo, descricao, funcionario, dataAbertura, status);
				chamados.add(c);
				
				JOptionPane.showMessageDialog(null, "Chamado cadastrado com sucesso!");
				break;
				
				
				
					// Método para atribuir um técnico a um chamado
			case 4:
				if (chamados.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Nenhum chamado cadastrado.");
		            return;
		        }

		        if (tecnicos.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Nenhum técnico cadastrado.");
		            return;
		        }
		        
		        String listaChamados = "Chamados sem técnico:\n";
		        ArrayList<Chamado> semTecnico = new ArrayList<>();
		        for (Chamado c1 : chamados) {
		            if (c1.getTecnico() == null) {
		                listaChamados += semTecnico.size() + " - " + c1.getTitulo() + "\n";
		                semTecnico.add(c1);
		            }
		        }
				
		        if (semTecnico.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Todos os chamados já têm técnico.");
		            return;
		        }
		        
		        int chIndex = Integer.parseInt(JOptionPane.showInputDialog(listaChamados));
		        Chamado chamado = semTecnico.get(chIndex);

		        String listaTecnicos = "Selecione o técnico:\n";
		        for (int i = 0; i < tecnicos.size(); i++) {
		            listaTecnicos += i + " - " + tecnicos.get(i).getNomeTecnico() + "\n";
		        }

		        int tIndex = Integer.parseInt(JOptionPane.showInputDialog(listaTecnicos));
		        Tecnico tecnico = tecnicos.get(tIndex);

		        chamado.setTecnico(tecnico);
		        chamado.setStatus("EM ANDAMENTO");

		        JOptionPane.showMessageDialog(null, "Técnico atribuído com sucesso!");
		        
				break;
				
				
				
				// Método para listagem de chamados por status e por funcionário
			case 5:
				String listaChamados1 = ""; // Variável não utilizada aqui
				
				/*for (Chamado chamado1 : chamados) {
					listaChamados1 += chamado1.exibirChamados();
				}
				JOptionPane.showInternalMessageDialog(null, listaChamados1);*/
				
				// Verifica se há chamados cadastrados
		        if (chamados.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Nenhum chamado cadastrado.");
		            return;
		        }
		        // Cria um array de opções para o usuário escolher como deseja filtrar
		        String[] opcoes = {
		        		"0 - Todos", 
		        		"1 - Por Status", 
		        		"2 - Por Funcionário"};
		        int escolha = JOptionPane.showOptionDialog(null, "Como deseja filtrar os chamados?", "Filtro", // Aviso se não houver chamado
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
		                opcoes, 		// Opções que serão exibidas
		                opcoes[0]);  	// Opção inicial selecionada

		        String resultado = ""; // Aqui vamos armazenar os chamados filtrados

		        
		     // Verifica qual filtro foi escolhido
		        switch (escolha) {
		            case 0: // Caso escolha "Todos"
		                for (Chamado c1 : chamados) { // Percorre todos os chamados
		                    resultado += c1.toString() + "\n----------------\n"; // Adiciona cada chamado na variável resultado
		                }
		                break;
		            case 1:
		                String status1 = JOptionPane.showInputDialog("Informe o status (Aberto, Em atendimento, Resolvido):"); // Pergunta qual status o usuário quer filtrar
		                for (Chamado c1 : chamados) { // Percorre todos os chamado
		                    if (c1.getStatus().equalsIgnoreCase(status1)) { // Se o status do chamado for igual ao informado
		                        resultado += c1.toString() + "\n----------------\n"; // Adiciona no resultado
		                    }
		                }
		                break;
		            case 2: // Caso escolha "Por Funcionário"
		                String nomeFuncionario1 = JOptionPane.showInputDialog("Nome do funcionário:"); // Percorre todos os chamados
		                for (Chamado c1 : chamados) {
		                    if (c1.getFuncionario().getNomeFuncionario().equalsIgnoreCase(nomeFuncionario1)) {
		                    	// Se o nome do funcionário bater com o informado
		                    	resultado += c1.toString() + "\n----------------\n";
		                    }
		                }
		                break;
		        }
				
		        // Exibe o resultado final após o filtro
		        JOptionPane.showMessageDialog(null, resultado);
				break;
				
				
				// Método para atualizar o status de um chamado
			case 6:
				String atualizarStatus = "";
				if (chamados.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Nenhum chamado cadastrado.");
		            return;
		        }

		        String lista1 = "Selecione o chamado:\n";
		        for (int i = 0; i < chamados.size(); i++) {
		            lista1 += i + " - " + chamados.get(i).getTitulo() + " [" + chamados.get(i).getStatus() + "]\n";
		        }

		        int indice1 = Integer.parseInt(JOptionPane.showInputDialog(lista1));
		        Chamado chamado1 = chamados.get(indice1);

		        String novoStatus = "";        
		        		JOptionPane.showInternalMessageDialog(null, "RESOLVIDO");
		        chamado1.setStatus(novoStatus);

		        JOptionPane.showMessageDialog(null, "Status atualizado com sucesso!");
				
				break;
						

			case 0:
				JOptionPane.showMessageDialog(null, "Sistema encerrado.");
				break;
			default:
				JOptionPane.showMessageDialog(null, ""
						+ "Opção Inválida!   \n"
						+ "Informe uma opção válida!");
			}
		} while (opcao != 0);
	}
}