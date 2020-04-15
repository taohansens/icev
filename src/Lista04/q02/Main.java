package Lista04.q02; 

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static BaseDeDados bd = new BaseDeDados();

	public static void main(String[] args) {

		do {
			imprimeMenu();
			int opcao = coletarOpcaoDesejada();
			switch (opcao) {
			case 1: //adicionar tarefa
				Tarefa novaTarefa = criarTarefa();
				bd.adicionar(novaTarefa);
				break;

			case 2: //remover
				imprimeTarefa();
				System.out.println("\nVoce deve escolher uma das opcoes para remover");
				opcao = coletarOpcaoDesejada();
				bd.remover(opcao); 
				break;

			case 3:
				buscaTarefa();
				break;
			
			case 4:
				imprimeTarefa();
				alteraTarefa();
				
				break;

			case 0:
				System.exit(0);
			default:
				break;
			}
		} while (true);

	}

	private static void imprimeTarefa() {
		for (int posicao = 0; posicao < bd.tarefas.length; posicao++) {
			if (bd.buscar(posicao) != null) {
				Tarefa tmp = bd.buscar(posicao);
				System.out.println(
						posicao + ": DESCRICAO: " + tmp.getDescricao().toUpperCase() + ", DATA LIMITE "  + ", CONCLUIDA?: " + tmp.isStatus());
				//tmp.processaDadosData(tmp.getData()) TODO print DATA
				
			}
		}
	}

	private static void buscaTarefa() {
		do {
			System.out.println("\n## Buscar Contato ##");
			System.out.println(":1: Buscar por NOME :");
			System.out.println(":2: Buscar por TELEFONE :");

			System.out.println(":3: Voltar ao menu :\n");
			int opcao = coletarOpcaoDesejada();
			if (opcao == 1) {
				System.out.println("Digite o NOME do contato que voc� est� procurando: ");
				String nome = sc.nextLine();
				for (int posicao = 0; posicao < bd.tarefas.length; posicao++) {
					if (bd.buscar(posicao) != null) {
						Tarefa tmp = bd.buscar(posicao);
						if (tmp.getDescricao().toUpperCase().contentEquals(nome.toUpperCase())) {
							System.out.println(posicao + ": DESCRICAO: " + tmp.getDescricao().toUpperCase() + ", DATA LIMITE " + tmp.getData() + ", CONCLUIDA?: " + tmp.isStatus());
						} 						
					}
	
				}
				
			}

			if (opcao == 2) {
				System.out.println("Concluida? s/n ");
				String concl = sc.nextLine();
				for (int posicao = 0; posicao < bd.tarefas.length; posicao++) {
					if (bd.buscar(posicao) != null) {
						Tarefa tmp = bd.buscar(posicao);
						System.out.println(posicao + ": DESCRICAO: " + tmp.getDescricao().toUpperCase() + ", DATA LIMITE " + tmp.getData() + ", CONCLUIDA?: " + tmp.isStatus());
						}
					}
				}

			if (opcao == 3) {
				break;
			}
		} while (true);
	}

	
	private static void alteraTarefa() {
		System.out.println("Qual Tarefa voce deseja alterar? ");
		int posicaofinal = coletarOpcaoDesejada();		
		
		do {
			System.out.println("================================");
			System.out.println("======Tarefa Atual======");
			Tarefa tmp = bd.buscar(posicaofinal);
			System.out.println(posicaofinal + ": DESCRICAO: " + tmp.getDescricao().toUpperCase() + ", DATA LIMITE " + tmp.getData() + ", CONCLUIDA?: " + tmp.isStatus());
			System.out.println("================================");
			System.out.println("\n## Alterar Contato ##");
			System.out.println(":1: Altera TAREFA :");
			System.out.println(":2: Altera DATA :");
			System.out.println(":3: Altera STATUS :\n");
			System.out.println(":4: Voltar ao menu principal. :\n");
			int opcao = coletarOpcaoDesejada();
			if (opcao == 1) {
				System.out.println("Digite a nova descricao: ");
				String desc = sc.nextLine();
				bd.alterarDescricao(posicaofinal,desc);
			}
			if (opcao == 2) {
				System.out.println("Digite a nova data: ");
				String data = sc.nextLine();
			//TODO data//	bd.alterarData(posicaofinal,data);
			}

			if (opcao == 4) {
				break;
			}
				}while(true);
			}
	
	private static void imprimeMenu() {
		System.out.println("\n::: Tarefas ToDo :::");
		System.out.println(":::- Menu -:::");
		System.out.println(":1: Adicionar nova tarefa : ");
		System.out.println(":2: Excluir tarefa  :");
		System.out.println(":3: Buscar tarefa: ");
		System.out.println(":4: Alterar status da tarefa :");
		System.out.println(":0: Sair do programa :");
	}
	
	private static int coletarOpcaoDesejada() {
		System.out.print("Digite a sua opcao:");
		return Integer.valueOf(sc.nextLine());
	}

	
	/*
	 * CRIAR TOdo
	 */
	
	private static Tarefa criarTarefa() {
		System.out.print("Digite a tarefa: ");
		String descricao = sc.nextLine();
		System.out.print("Digite a data (DIA/MES/ANO): ");
		String dadosData = sc.nextLine();
		
		int[] dadosConvertidos = processaDadosData(dadosData);
		GregorianCalendar data = new GregorianCalendar(dadosConvertidos[2], dadosConvertidos[1], dadosConvertidos[0]);
		
		return new Tarefa(descricao, data);
	}
	
	/*
	 * GREGORIAN CALENDAR
	 */
	static int[] processaDadosData(String entrada) {
		
		// ex: [20][04][2020]
		String[] entradas = entrada.split("/");
		int[] data = new int[entradas.length];

		for(int p =0; p<entradas.length; p++) {
			data[p] = Integer.valueOf(entradas[p]);
		}
//		int dia  = Integer.valueOf(entradas[0]);
//		int mes  = Integer.valueOf(entradas[1]);
//		int ano  = Integer.valueOf(entradas[2]);
//		int[] data2 = {dia, mes, ano};
		
		
		return data;// data[0] == 20; data[1] == 04; data[2] = 2020;
	}
	
}
