package Lista04.q03;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static BasedeDados bd = new BasedeDados();
	
	public static void main(String[] args) {
		do {
			Gui.menuPrincipal();
			int opcao = selecionaMenu();
			switch (opcao) {
				case 1:
					Conta novaConta = criarConta();
					bd.adicionar(novaConta);
					break;
				case 2:


			}


		} while (true);
	}


	private static int selecionaMenu() {
		int valor=0;
		boolean erro = false;
		while(!erro){
			try{
				System.out.println("Digite a sua opcao: ");
				valor = Integer.valueOf(sc.nextLine());
				erro = true;
			}catch(NumberFormatException e) {
				System.err.print("ERRO - Digite um valor valido.\n"); }}
		return valor;
	}

	private static Conta criarConta() {
		String dadosNome = "";
		String dadosData = "";
		String dadosAgencia = "";
		String dadosConta = "";
		boolean deuErro;
		do{
			deuErro=false;
			try{
				System.out.print("Digite o nome do Cliente: ");
				dadosNome = sc.nextLine();
				if(!dadosNome.matches("[a-zA-Z]{3,}")){
					throw new Exception("\nO nome deve ter ao menos 3 letras.");}}
			catch(Exception e){
				System.err.println("\nNão é permitido numeros no nome" + e.getMessage());
				deuErro = true;}
		}while(deuErro);

		do{
			deuErro=false;
			try{
				System.out.print("Digite o numero da agencia (4 digitos): ");
				dadosAgencia = sc.nextLine();
				if(!(dadosAgencia.matches("\\d{4}")))
					throw new Exception("\nA Agencia deve possuir 4 digitos.");}
			catch(Exception e){
				System.err.println(e.getMessage());
				deuErro = true;}
		}while(deuErro);

		do{
			deuErro=false;
			try{
				System.out.print("Digite o numero da conta (5 digitos): ");
				dadosConta = sc.nextLine();
				if(!(dadosConta.matches("\\d{5}")))
					throw new Exception("\nA Conta deve possuir 5 digitos.");}
			catch(Exception e){
				System.err.println(e.getMessage());
				deuErro = true;}
		}while(deuErro);

		do{
			deuErro=false;
			try{
				System.out.print("Digite a data de abertura da conta (dd/mm/aaaa): ");
				dadosData = sc.nextLine();
				if(!(dadosData.matches("\\d{2}/\\d{2}/\\d{4}")))
					throw new Exception("\nA data deve ser no formato dd/mm/yyyy.");}
			catch(Exception e){
				System.err.println(e.getMessage());
				deuErro = true;}
		}while(deuErro);

		int[] dadosConvertidos = processaDadosData(dadosData);
		GregorianCalendar data = new GregorianCalendar(dadosConvertidos[2], dadosConvertidos[1]-1, dadosConvertidos[0]);

		return new Conta(dadosNome, dadosAgencia, dadosConta, dadosData);
	}

	static int[] processaDadosData(String entrada) {

		// ex: [20][04][2020]
		String[] entradas = entrada.split("/");
		int[] data = new int[entradas.length];

		for (int p = 0; p < entradas.length; p++) {
			data[p] = Integer.valueOf(entradas[p]);
		}
		return data;
	}

	private static String format(GregorianCalendar calendar) {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		fmt.setCalendar(calendar);
		String dateFormatted = fmt.format(calendar.getTime());

		return dateFormatted;
	}}


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
				
			}*/
