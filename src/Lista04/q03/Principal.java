package Lista04.q03;


public class Principal {
	static BasedeDados Banco = new BasedeDados();
	
	public static void main(String[] args) {
		
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
		System.out.println("############");
		System.out.println("BD exper");
		System.out.println("############");
		Banco.adicionar(c1);
		Conta tmp=Banco.buscar("Alfredo");
		System.out.println("TITULAr: " + tmp.getTitular().toUpperCase() + "\nNum Conta: " +  tmp.getAgencia() +"|" +tmp.getNumero());
	
		System.out.println("AGENCIA [0]");
		for (int i = 0; i < Banco.contas.length; i++) {
			System.out.println(Banco.contas[0][i].getAgencia());
			//for (int j = 0; j < Banco.contas.length; j++) {
				
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	}

