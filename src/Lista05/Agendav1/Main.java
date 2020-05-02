package Lista05.Agendav1;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static BaseDeDados bd = new BaseDeDados();
	static Gui exibe = new Gui();

	public static void main(String[] args) {

		do {
			exibe.menuPrincipal();
			int opcao = coletarOpcaoDesejada();
			switch (opcao) {
			case 1:
				Pessoa novoContato = criarContato();
				bd.adicionar(novoContato);
				break;
			// TODO buscar Contato
			case 2:
				buscaContato();
				break;

			case 3:
				imprimeContatos();
				break;

			case 4:
				imprimeContatos();
				alteraContato();

				break;

			case 5:
				imprimeContatos();
				System.out.println("\nVoce deve escolher uma das opcoes para remover");
				opcao = coletarOpcaoDesejada();
				bd.removerContato(opcao);
				break;
			case 0:
				System.exit(0);
			default:
				break;
			}
		} while (true);

	}

	private static void imprimeContatos() {
		do {
			exibe.menuImprimeCon1();
			int opcao = coletarOpcaoDesejada();
			if (opcao == 1) {
				for (int posicao = 0; posicao < bd.getTotal(); posicao++) {
					if (bd.buscar(posicao) != null) {
						Pessoa tmp = bd.buscar(posicao);
						System.out.println("\n(" + posicao + ") ----");
						System.out.println("NOME: " + tmp.getNome());
						if (tmp.getPfPj()) {
							System.out.println("TIPO: PESSOA");
							System.out.println("DOCUMENTO: " + tmp.getRg());
						} else {
							System.out.println("TIPO: EMPRESA");
							System.out.println("CNPJ: " + tmp.getCnpj());
						}
						System.out.println("ENDERECO: " + tmp.getEndereco().toUpperCase());
						System.out.println("TELEFONE: " + tmp.getTelefone());
						System.out.println("----");
					}
				}
			}
			if (opcao == 2) {
				for (int posicao = 0; posicao < bd.getTotal(); posicao++) {
					if (bd.buscar(posicao) != null) {
						Pessoa tmp = bd.buscar(posicao);
						if (tmp.getPfPj()) {
							System.out.println("\n(" + posicao + ") ----");
							System.out.println("NOME: " + tmp.getNome());
							System.out.println("DOCUMENTO: " + tmp.getRg());
							System.out.println("ENDERECO: " + tmp.getEndereco().toUpperCase());
							System.out.println("TELEFONE: " + tmp.getTelefone());
							System.out.println("----");
						}
					}
				}

			}
			if (opcao == 3) {
				for (int posicao = 0; posicao < bd.getTotal(); posicao++) {
					if (bd.buscar(posicao) != null) {
						Pessoa tmp = bd.buscar(posicao);
						if (tmp.getPfPj() == false) {
							System.out.println("\n(" + posicao + ") ----");
							System.out.println("NOME: " + tmp.getNome());
							System.out.println("CNPJ: " + tmp.getRg());
							System.out.println("ENDERECO: " + tmp.getEndereco().toUpperCase());
							System.out.println("TELEFONE: " + tmp.getTelefone());
							System.out.println("----");
						}
					}
				}

			}
			if (opcao == 4) {
				break;
			}
		} while (false);
	}

	private static void buscaContato() {
		do {
			System.out.println("\n## Buscar Contato ##");
			System.out.println(":1: Buscar por NOME :");
			System.out.println(":2: Buscar por TELEFONE :");

			System.out.println(":3: Voltar ao menu :\n");
			int opcao = coletarOpcaoDesejada();
			if (opcao == 1) {
				System.out.println("Digite o NOME do contato que voce esta procurando: ");
				String nome = sc.nextLine().toUpperCase();
				Pessoa tmp = bd.buscar(nome);
				if (tmp != null) {
					System.out.println("====== NOME " + tmp.getNome().toUpperCase() + " LOCALIZADO ====");
					if (tmp.getPfPj() == true) {
						System.out.println("DOCUMENTO: " + tmp.getRg());
					} else if (tmp.getPfPj() == false) {
						System.out.println("CNPJ: " + tmp.getCnpj());
					}
					System.out.println(
							"TELEFONE: " + tmp.getTelefone() + "\nENDERECO " + tmp.getEndereco().toUpperCase());
				} else {
					System.out.println("NOME -" + nome + "- NAO ENCONTRADO.");
				}
			}

			if (opcao == 2)

			{
				System.out.println("Digite o TELEFONE de quem voce esta procurando: ");
				String telefone = sc.nextLine();
				Pessoa tmp = bd.buscar(telefone, 0);
				if (tmp != null) {
					if (tmp.getPfPj() == true) {
						System.out.println("DOCUMENTO: " + tmp.getRg());
					} else if (tmp.getPfPj() == false) {
						System.out.println("CNPJ: " + tmp.getCnpj());
					}
					System.out.println(
							"NOME: " + tmp.getNome().toUpperCase() + "\nENDERECO " + tmp.getEndereco().toUpperCase());
				} else {
					System.out.println("TELEFONE NAO ENCONTRADO.");
				}
			}
			if (opcao == 3) {
				break;
			}
		} while (true);
	}

	private static void alteraContato() {
		System.out.println("Qual Contato voce deseja alterar? ");
		int posicaofinal = coletarOpcaoDesejada();

		do {
			System.out.println("================================");
			System.out.println("======Contato Atual======");
			Pessoa tmp = bd.buscar(posicaofinal);
			System.out.println("NOME: " + tmp.getNome().toUpperCase() + "| ENDERECO: " + tmp.getEndereco().toUpperCase()
					+ "| TELEFONE: " + tmp.getTelefone().toUpperCase());
			Gui.menuAlteraContato();
			int opcao = coletarOpcaoDesejada();
			if (opcao == 1) {
				System.out.println("Digite o novo NOME: ");
				String nome = sc.nextLine();
				bd.alterarNomePessoa(posicaofinal, nome);
			}

			if (opcao == 2) {
				System.out.println("Digite o novo TELEFONE: ");
				String telefone = sc.nextLine();
				bd.alterarTelefone(posicaofinal, telefone);
			}
			if (opcao == 3) {
				System.out.println("Digite o novo ENDERECO: ");
				String endereco = sc.nextLine();
				bd.alterarEndereco(posicaofinal, endereco);
			}
			if (opcao == 4) {
				break;
			}
		} while (true);
	}

	private static int coletarOpcaoDesejada() {
		System.out.print("Digite a sua opcao:");
		return Integer.valueOf(sc.nextLine());
	}

	/*
	 * Criar Contato
	 */
	private static Pessoa criarContato() {
		boolean pfOuPj = true;
		exibe.menuPessoaOuEmpresa();
		int escolha = coletarOpcaoDesejada();
		if (escolha == 1) {
			pfOuPj = true;
		} else if (escolha == 2) {
			pfOuPj = false;
		}
		System.out.print("Digite o nome: ");
		String novoNome = sc.nextLine().toUpperCase();
		System.out.print("Digite o RG/CNPJ: ");
		String novoDocumento = sc.nextLine();
		System.out.print("Digite o telefone: ");
		String novoTelefone = sc.nextLine();
		System.out.print("Digite o endereco: ");
		String novoEndereco = sc.nextLine();

		return new Pessoa(pfOuPj, novoNome, novoDocumento, novoTelefone, novoEndereco);
	}
}
