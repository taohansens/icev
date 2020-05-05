package Lista05.q07;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static List<Familia> censo = new ArrayList<>();

	public static void main(String[] args) {
		do {
			System.out.println("\n#####SENSO IBGX######");
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
			System.out.println("Membro adicionado [OK]\n");
		}
		censo.add(f);
		System.out.println("Familia Adicionada [OK]");
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
		System.out.println("QUANTIDADE TOTAL DE MEMBROS: " +qtdTotalMembros());
		System.out.println("=================================");
		System.out.println("PESSOAS QUE NÃO TRABALHAM: "+ (qtdTotalMembros()-qtdTrabalhadores()));
		System.out.println("PESSOAS QUE TRABALHAM: "+ qtdTrabalhadores());
		System.out.println("=================================");
		System.out.println("QTD DE TRAB. ASSALARIADOS: "+ QtdTrabAss());
		System.out.println("QTD DE TRAB. HORISTAS: "+ QtdTrabHor());
		System.out.println("QTD DE TRAB. AUTONOMOS: "+ QtdTrabAuto());
		System.out.println("=================================\n");
		System.out.println("Retornando ao menu principal... \n");
	}

	private static int qtdTotalMembros(){
		int total=0;
		for (Familia ff : censo) {
			total += ff.getPessoasFamilia();
		}
		return total;
	}

	private static int qtdTrabalhadores(){
		int total=0;
		for (Familia ff : censo) {
			total += ff.getQtdTrabalhadores();
		}
		return total;
	}

	private static int QtdTrabAss(){
		int total=0;
		for (Familia ff : censo) {
			total += ff.getQtdTrabAss();
		}
		return total;
	}

	private static int QtdTrabHor(){
		int total=0;
		for (Familia ff : censo) {
			total += ff.getQtdTrabHor();
		}
		return total;
	}

	private static int QtdTrabAuto(){
		int total=0;
		for (Familia ff : censo) {
			total += ff.getQtdTrabAuto();
		}
		return total;
	}
}
