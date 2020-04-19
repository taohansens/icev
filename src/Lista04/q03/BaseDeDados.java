package Lista04.q03;

public class BasedeDados {
	Conta[][] contas;
	int numAgencia;
	int numConta;
	
	public BasedeDados() {
		contas = new Conta[100][100];
		numAgencia = 0;
		numConta = 0;
	}
	
	void adicionar(Conta novaConta) {
		contas[numAgencia][numConta]=novaConta;
		numAgencia++;
		numConta++;
	}
	
	Conta buscar(int posicaoAg,int posicaoConta) {
		return contas[posicaoAg][posicaoConta];
	}
	
	Conta buscar(String titular) {
		for (int posicaoAge = 0; posicaoAge < contas.length; posicaoAge++) {
			for (int posicaoConta = 0; posicaoConta < contas.length; posicaoConta++) {
			Conta contaTemp = contas[posicaoAge][posicaoConta];
			if (contaTemp == null)
				continue;
			else if (contaTemp.getTitular().equals(titular)) {
				return contaTemp;
			}
		}
		return null;
	}
		return null;
	}
}

