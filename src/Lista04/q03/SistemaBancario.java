package Lista04.q03;

public class SistemaBancario {
		ContaBancaria[] contas;
		int numContas;

		public SistemaBancario() {
			contas = new ContaBancaria[100];
			numContas = 0;
		}

		void adicionar(ContaBancaria novaConta) {
			contas[numContas] = novaConta;
			numContas++;
		}

		ContaBancaria buscar(int posicao) {
			return contas[posicao];
		}

		ContaBancaria buscar(String cliente) {
			// TODO buscar
			for (int posicao = 0; posicao < contas.length; posicao++) {
				ContaBancaria contaPosicaoAtual = contas[posicao];
				if (contaPosicaoAtual == null)
					continue;
				else if (contaPosicaoAtual.getCliente().equals(cliente)) {
					return contaPosicaoAtual;
				}
			}
			return null;
		}

		// TODO alterar
		void alterarAgencia(int posicao, int novaAgencia) {
			contas[posicao].setAgencia(novaAgencia);
		}

		void alterarSaldo(int posicao, int novaAgencia) {
			contas[posicao].setAgencia(novaAgencia);
		}
		
		void altera(int posicao) {
			boolean atual = tarefas[posicao].isStatus();
			tarefas[posicao].setStatus(!atual);
		}

		void remover(int posicao) {
			tarefas[posicao] = null;
			numTarefas--;
		}

	}

}
