package br.com.prozeducacao.sistemaHelpDesk;

/*String listaChamados1 = ""; // Variável não utilizada aqui
				
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
		        JOptionPane.showMessageDialog(null, resultado);*/