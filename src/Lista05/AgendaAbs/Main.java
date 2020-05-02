package Lista05.AgendaAbs;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Gui exibe = new Gui();
    static BancoDeDados bd = new BancoDeDados();

    public static void main(String[] args) {
        int opcao;

        do {
            // Menu principal, em loop.
            exibe.menuPrincipal();
            opcao = coletarOpcaoMenu();
            switch (opcao) {
                case 0:
                    System.out.println("Desligando...");
                    System.exit(0);

                //Adiciona contato ao banco de dados;
                case 1:
                 System.out.println("\n-------ADICIONAR CONTATO -------");
                 Pessoa novoContato = criarContato();
                 bd.adicionar(novoContato);
                 break;

                case 2:
                    buscaContato();

            }

        } while (true);

    }

    private static void buscaContato() {


    }

    private static int coletarOpcaoMenu() {
        System.out.print("Digite a sua opcao:");
        return Integer.parseInt(sc.nextLine());
    }


    /*
     * Metodo para criar objeto e adicionar no ArrayList de BancoDeDados;
     */

    private static Pessoa criarContato() {
        System.out.println("Quem voce deseja adicionar?\n:1: Pessoa Fisica\n:2: Empresa\n ");
        int escolha = coletarOpcaoMenu();

        System.out.print("\nDigite o nome: ");
        String nome = sc.nextLine().toUpperCase();
        System.out.print("Digite o telefone: ");
        int telefone = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o endereco: ");
        String endereco = sc.nextLine();
        if (escolha == 1){
        System.out.print("Digite o RG: ");
        String rg = sc.nextLine();
        System.out.println("[OK] Contato Adicionado!\n");
        return new PessoaFisica(nome,endereco,telefone,rg);
        }
        if (escolha ==2) {
            System.out.print("Digite o CNPJ: ");
            String cnpj = sc.nextLine();
            System.out.println("[OK] Contato Adicionado!\n");
            return new PessoaJuridica(nome, endereco, telefone, cnpj);
        }
        return null;
    }


}

