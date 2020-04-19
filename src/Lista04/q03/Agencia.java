package Lista04.q03;

public class Agencia {
	String nomeAgencia;
	int numeroAgencia;
	int numContas;
	Agencia[][] agencias;
	int numAgencias;
	

	/**
	 * @param nomeAgencia
	 * @param numeroAgencia
	 */
	public Agencia(String nomeAgencia, int numeroAgencia) {
		this.nomeAgencia = nomeAgencia;
		this.numeroAgencia = numeroAgencia;
	}

	public Agencia() {
		agencias = new Agencia[100][100];
		numAgencias = 0;
		numContas = 0;
	}
	
	void criarAgencia(Agencia novaAgencia) {
	agencias[numAgencias][numContas] = novaAgencia;
	numAgencias++;
		}	
	
	Agencia[] buscar(int posicao) {
		return agencias[posicao];
	}
	
	
	Agencia[] buscar(String nome) {
		// TODO buscar
		for (int posicao = 0; posicao < agencias.length; posicao++) {
			Agencia[] agenciaPosicaoAtual = agencias[posicao];
			if (agenciaPosicaoAtual == null)
				continue;
			//else if (agenciaPosicaoAtual.equals(nome)) {
				return agenciaPosicaoAtual;
			}
		return null;
	}
	

	}
