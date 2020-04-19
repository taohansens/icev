package Lista04.q03;

import Lista04.q01.BaseDeDados;
import Lista04.q01.Contato;
import Lista04.q02.Tarefa;

public class Principal {

	public static void main(String[] args) {
		
		Agencia age = new Agencia();
		/*
		//Construtor (titular, agencia, numero, dataDeAbertura)
		Conta c1 = new Conta("Alfredo", "1584", 17548, "18/04/2020");
		Conta c2 = new Conta("Baltazar", "1582", 10015, "18/04/2020");
		Conta c3 = new Conta("Carlofredo", "101", 11542, "18/04/2020");
		
		//Criadas as contas c1,c2,c3;
		//Alfredo achou 20R$ e depositou em sua conta.
		c1.deposita(20);
		//imprimir saldo.
		c1.aposTransacao();
	
		//Baltazar vendeu sua televisao e depositou o dinheior.
		c2.deposita(900);
		c2.aposTransacao();
		//e teve que sacar no outro dia R$140;
		c2.saca(140);
		c2.aposTransacao();
		
		//A tia de Carlofredo depositou 4000;
		c3.deposita(4000);
		c3.aposTransacao();
		//Calofredo deixou o dinheiro por um mes na poupanca;
		c3.calcularRendimento();
		
		//E tudo ficou assim:
		System.out.println("\n"+c1.recuperaDadosParaImpressao());
		System.out.println("\n"+c2.recuperaDadosParaImpressao());
		System.out.println("\n"+c3.recuperaDadosParaImpressao());	
		*/
		
		//Criar agência
		Agencia a1 = new Agencia("Alameda", 001);
		age.criarAgencia(a1);
		

		
		private static void imprimeAgencia() {
			for (int posicao = 0; posicao < age.agencia; posicao++) {
				if (bd.buscar(posicao) != null) {
					Tarefa tmp = bd.buscar(posicao);
					String stat = (tmp.isStatus()) ? "CONCLUIDA" : "PENDENTE";
					System.out.println("\n[" + posicao + "]" + tmp.getDescricao().toUpperCase()
							+ "\nDATA LIMITE: "+ format(tmp.getData()) + "\nTAREFA " + stat);
				}
			}
		}
		
		
	}
}
