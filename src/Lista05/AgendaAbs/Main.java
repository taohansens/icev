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
                //Encerra o programa.
                case 0:
                    System.out.println("Desligando...");
                    System.exit(0);

                    //Adiciona contato ao banco de dados;
                case 1:
                    System.out.println("\n-------ADICIONAR CONTATO -------");
                    Pessoa novoContato = criarContato();
                    bd.adicionar(novoContato);
                    break;
                //Buscar contato.
                case 2:
                    buscaContato();
                    break;

                //Mostra contatos.
                case 3:
                    mostraContato();
                    break;
                case 4:
                    mostraContato();
                    alteraContato();
                    break;
                case 5:
                    mostraContato();
                    removerContato();
                    break;
            }
        } while (true);

    }

    private static int coletarOpcaoMenu() {
        System.out.print("Digite a sua opcao:");
        return Integer.parseInt(sc.nextLine());
    }

    //Adicionar contato no Array do BancoDeDados.
    private static Pessoa criarContato() {
        System.out.println("Quem voce deseja adicionar?\n:1: Pessoa Fisica\n:2: Empresa\n ");
        int escolha = coletarOpcaoMenu();

        System.out.print("\nDigite o nome: ");
        String nome = sc.nextLine().toUpperCase();
        System.out.print("Digite o telefone: ");
        int telefone = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o endereco: ");
        String endereco = sc.nextLine().toUpperCase();
        if (escolha == 1) {
            System.out.print("Digite o RG: ");
            String rg = sc.nextLine();
            System.out.println("[OK] Contato Adicionado!\n");
            return new PessoaFisica(nome, endereco, telefone, rg);
        }
        if (escolha == 2) {
            System.out.print("Digite o CNPJ: ");
            String cnpj = sc.nextLine();
            System.out.println("[OK] Contato Adicionado!\n");
            return new PessoaJuridica(nome, endereco, telefone, cnpj);
        }
        return null;
    }

    //Buscar contatos
    private static void buscaContato() {
        do {
            System.out.println("\n------- Buscar Contato -------");
            System.out.println(":1: Buscar por NOME :");
            System.out.println(":2: Buscar por TELEFONE :");
            System.out.println(":3: Voltar ao menu :\n");
            int opcao = coletarOpcaoMenu();

            //Buscar contato por nome.
            if (opcao == 1) {
                System.out.println("Digite o NOME do contato que voce esta procurando: ");
                String nome = sc.nextLine().toUpperCase();
                Pessoa tmp = bd.buscar(nome);
                if (tmp != null) {
                    System.out.println(tmp);
                } else {
                    System.out.println("NOME -" + nome + "- NAO ENCONTRADO.");
                }
            }

            //Buscar contato por telefone.
            if (opcao == 2) {
                System.out.println("Digite o TELEFONE de quem voce esta procurando: ");
                int telefone = sc.nextInt();
                sc.nextLine();
                Pessoa tmp = bd.buscar(telefone, 0);
                if (tmp != null) {
                    System.out.println(tmp);
                } else {
                    System.out.println("TELEFONE NAO ENCONTRADO.");
                }
            }
            if (opcao == 3) {
                break;
            }
        } while (true);
    }

    //Mostrar contatos
    private static void mostraContato() {
        do {
            exibe.menuMostraCon();
            int opcao = coletarOpcaoMenu();
            if (opcao == 1) {
                bd.imprimeContato();
            }

            if (opcao == 2) {
                bd.imprimePessoaF();
            }

            if (opcao == 3) {
                bd.imprimePessoaJ();

            }
            if (opcao == 4) {
                break;
            }
        } while (false);
    }

    //Alterar contatos
    private static void alteraContato() {
        System.out.println("-----------------------");
        System.out.println("\nQual Contato voce deseja alterar? \nDigite o numero [x]");
        int posicaofinal = coletarOpcaoMenu();

        do {
            System.out.println("\n------ Contato a ser editado ------");
            Pessoa tmp = bd.buscar(posicaofinal);
            System.out.println(tmp);

            Gui.menuAlteraContato();
            int opcao = coletarOpcaoMenu();

            if (opcao == 1) {
                System.out.println("\nDigite o novo NOME: ");
                String nome = sc.nextLine().toUpperCase();
                bd.alterarNome(posicaofinal, nome);
            }
            if (opcao == 2) {
                System.out.println("Digite o novo ENDERECO: ");
                String endereco = sc.nextLine().toUpperCase();
                bd.alterarEndereco(posicaofinal, endereco);
            }
            if (opcao == 3) {
                System.out.println("Digite o novo TELEFONE: ");
                int telefone = sc.nextInt();
                sc.nextLine();
                bd.alterarTelefone(posicaofinal, telefone);
            }

            if (opcao == 4) {
                break;
            }
        } while (true);
    }

    //Remover contatos
    private static void removerContato(){
        System.out.println("-----------------------");
        System.out.println("\nQual Contato voce deseja remover? \nDigite o numero [x]");
        int posicaofinal = coletarOpcaoMenu();
        bd.removerContato(posicaofinal);
        System.out.println("[OK] Contato Removido.");
    }

}

