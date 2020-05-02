package Lista05.AgendaAbs;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Gui exibe = new Gui();

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
                case 1:
                 Pessoa novoContato = criarContato();
                 System.out.println(novoContato);
                 break;
            }

        } while (true);

    }

    private static int coletarOpcaoMenu() {
        System.out.print("Digite a sua opcao:");
        return Integer.parseInt(sc.nextLine());
    }

    private static Pessoa criarContato() {
        System.out.println("\nQuem voce deseja adicionar?\n:1: Pessoa Fisica\n:2: Empresa\n ");
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
        System.out.println("[OK] Contato Adicionado!");
        return new PessoaFisica(nome,endereco,telefone,rg);
        }
        if (escolha ==2) {
            System.out.print("Digite o CNPJ: ");
            String cnpj = sc.nextLine();
            System.out.println("[OK] Contato Adicionado!");
            return new PessoaJuridica(nome, endereco, telefone, cnpj);
        }
        return null;
    }


}

