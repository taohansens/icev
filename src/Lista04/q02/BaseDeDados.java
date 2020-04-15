package Lista04.q02;

public class BaseDeDados {

	Tarefa[] tarefas;
	int numTarefas;

	public BaseDeDados() {
		tarefas = new Tarefa[100];
		numTarefas = 0;
	}

	void adicionar(Tarefa novaTarefa) {
		tarefas[numTarefas] = novaTarefa;
		numTarefas++;
	}

	Tarefa buscar(int posicao) {
		return tarefas[posicao];
	}

	Tarefa buscar(String nome) {
		// TODO buscar
		for (int posicao = 0; posicao < tarefas.length; posicao++) {
			Tarefa tarefaPosicaoAtual = tarefas[posicao];
			if (tarefaPosicaoAtual == null)
				continue;
			else if (tarefaPosicaoAtual.getDescricao().equals(nome)) {
				return tarefaPosicaoAtual;
			}
		}
		return null;
	}

	// TODO alterar
	void alterarDescricao(int posicao, String novaDescricao) {
		tarefas[posicao].setDescricao(novaDescricao);
	}

	void alteraStatus(int posicao, String novoEndereco) {
		boolean atual = tarefas[posicao].isStatus();
		tarefas[posicao].setStatus(!atual);
	}

	void remover(int posicao) {
		tarefas[posicao] = null;
		numTarefas--;
	}

}
