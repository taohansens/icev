package Lista05.q08;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Familia> censo = new ArrayList<Familia>();

	public static void main(String[] args) {
		do {
			System.out.println("#####SENSO IBGX######");
			System.out.println("###1. Adicionar Familia");
			System.out.println("###2. Listar");
			int opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o numero de pessoas da familia: ");
				int qtdPessoas = sc.nextInt();
				Familia f = new Familia();
				for (int i=0; i<qtdPessoas; i++) {
					Pessoa novaPessoa = criarPessoa();
					f.adicionaPessoa(novaPessoa);
				}
				censo.add(f);
				Familia.cont++;
				break;
			case 2:
				 for (Familia ff : censo) {
					 System.out.println("Pessoas da Familia:");
					 ff.getPessoasFamilia();
				 }
				
				System.out.println("LISTANDO TODAS FAMILIAS...\n");
				 for (Familia ff : censo) {
					 System.out.println(ff);
				 }
			}
		} while (true);
	}

	private static Pessoa criarPessoa() {
		sc.nextLine();
		System.out.print("Digite o nome: ");
		String novoNome = sc.nextLine();
		System.out.println("Trabalha? \n1-Sim 0-Não");
		int trabalha = sc.nextInt();
		if (trabalha == 1) {
			System.out.print("Digite o emprego: ");
			sc.nextLine();
			String novoEmprego = sc.nextLine().toUpperCase();
			System.out.print("Digite o tipo de Emprego: \n" + "1- Assalariado\n" + "2- Horista\n" + "3- Autonomo");
			System.out.print("Escolha uma opcao:");
			int tipoEmprego = sc.nextInt();
			switch (tipoEmprego) {
			case 1:
				return new TrabAssalariado(novoNome, novoEmprego);
			case 2:
				return new TrabHorista(novoNome, novoEmprego);
			case 3:
				return new TrabAutonomo(novoNome, novoEmprego);

			}
		} else {
			return new Pessoa(novoNome);
		}
		return new Pessoa(novoNome);
	}
}
