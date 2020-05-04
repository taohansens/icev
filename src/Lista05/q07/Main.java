package Lista05.q07;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Familia> censo = new ArrayList<>();

	public static void main(String[] args) {
		do {
			System.out.println("#####SENSO IBGX######");
			System.out.println(":.1. Adicionar Familia");
			System.out.println(":.2. Listar");
			System.out.println("=======================");
			System.out.print("Escolha uma opcao: ");
			int opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				addFamilia();
				break;
			case 2:
				listCenso();
				break;
			}
		} while (true);
	}

	//Metodo para adicionar o obj familia à lista de familias
	private static void addFamilia() {
		System.out.println("-----ADICIONAR FAMILIA-----");
		System.out.print("Digite o numero de pessoas da familia: ");
		int qtdPessoas = sc.nextInt();
		Familia f = new Familia();
		for (int i=0; i<qtdPessoas; i++) {
			System.out.print("MEMBRO ["+(i+1)+"/"+qtdPessoas+"] ");
			Pessoa novaPessoa = criarPessoa();
			f.adicionaPessoa(novaPessoa);
			System.out.print("Membro adicionado [OK]");
		}
		censo.add(f);
		System.out.println("\nFamilia Adicionada [OK]");
		System.out.println("Retornando ao menu principal...\n");
	}

	// Metodo para criar pessoa da familia
	private static Pessoa criarPessoa() {
		sc.nextLine();
		System.out.print("Digite o nome: ");
		String novoNome = sc.nextLine();
		System.out.println("Trabalha? \n1-Sim 0-Nao");
		int trabalha = sc.nextInt();
		if (trabalha == 1) {
			System.out.println("Tipo de emprego: \n" + "1- Assalariado\n" + "2- Horista\n" + "3- Autonomo");
			System.out.print("Escolha uma opcao:");
			int tipoEmprego = sc.nextInt();
			switch (tipoEmprego) {
			case 1:
				return new TrabAssalariado(novoNome);
			case 2:
				return new TrabHorista(novoNome);
			case 3:
				return new TrabAutonomo(novoNome);

			}
		} else {
			return new Pessoa(novoNome);
		}
		return new Pessoa(novoNome);
	}

	//Metodo para consultas
	private static void listCenso(){
		System.out.println("--------- CENSO ------------");
		System.out.println("=================================");
		System.out.println("TOTAL DE FAMILIAS: "+ censo.size());
		//PROBLEMA AQUI//
		int total=0;
		for (Familia g : censo) {
			total = g.getPessoasFamilia();
			total++;
		}
		// RETORNANDO +1
		System.out.println("QUANTIDADE TOTAL DE MEMBROS: "+ total);
		System.out.println("=================================");
		//System.out.println("PESSOAS QUE NÃO TRABALHAM: "+ (qtdTotalMembros()-qtdTrabalhadores()));
		//System.out.println("PESSOAS QUE TRABALHAM: "+ trabalham);
		//System.out.println("=================================");
		//System.out.println("QTD DE TRAB. ASSALARIADOS: "+ censo.size());
		//System.out.println("QTD DE TRAB. HORISTAS: "+ censo.size());
		//System.out.println("QTD DE TRAB. AUTONOMOS: "+ censo.size());
		//System.out.println("=================================\n");
		System.out.println("Voltando ao menu...\n");
	}


	private static int qtdTotalMembros(){
		int total=0;
		for (Familia f : censo) {
			total = f.getPessoasFamilia();
			total++;
		}
		return total;
	}

	private static int qtdTrabalhadores(){
		int total=0;
		for (Familia ff : censo) {
			total = ff.getQtdTrabalhadores();
			total++;
		}
		return total;
	}
}
