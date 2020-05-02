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
                //TODO Adicionar Pessoa
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

    //Metodo para criar contato
    private static Pessoa criarContato() {
        System.out.println("Quem voce deseja adicionar?\n:1: Pessoa Fisica\n:2: Empresa ");
        int escolha = coletarOpcaoMenu();

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine().toUpperCase();
        System.out.print("Digite o telefone: ");
        int telefone = sc.nextInt();
        System.out.print("Digite o endereco: ");
        String endereco = sc.nextLine();
        if (escolha == 1){
        System.out.print("Digite o RG: ");
        String rg = sc.nextLine();
        return new PessoaFisica(nome,endereco,telefone,rg);
        }
        if (escolha ==2) {
            System.out.print("Digite o CNPJ: ");
            String cnpj = sc.nextLine();
            return new PessoaJuridica(nome, endereco, telefone, cnpj);
        }
        return null;
    }


}

