package Lista04.q03;

public class BaseDeDados {

	Conta[] contas;
	int numContas;

	public BaseDeDados() {
		contas = new Conta[100];
		numContas = 0;
	}

	void adicionar(Conta novaConta) {
		// TODO adicionar
		contas[numContas] = novaConta;
		numContas++;
	}

	Conta buscar(int posicao) {
		return contas[posicao];
	}

	Conta buscar(String nome) {
		// TODO buscar
		for (int posicao = 0; posicao < contas.length; posicao++) {
			Conta contatoPosicaoAtual = contas[posicao];
			if (contatoPosicaoAtual == null)
				continue;
			else if (contatoPosicaoAtual.getTitular().equals(nome)) {
				return contatoPosicaoAtual;
			}
		}
		return null;
	}

	void alterarAgencia(int posicao, String novaAgencia) {
		contas[posicao].setAgencia(novaAgencia);
	}

	void alterarTelefone(int posicao, String novoTelefone) {
	//	contas[posicao].(novoTelefone);
	}

	void fecharConta(int posicao) {
		// TODO remover
		contas[posicao] = null;
		numContas--;
	}

}
