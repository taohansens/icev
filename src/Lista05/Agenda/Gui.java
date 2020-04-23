package Lista05.Agenda;

public class Gui {
	
	public void menuPrincipal() {
		System.out.println("\n::: Agenda :::");
		System.out.println(":::- Menu Principal -:::");
		System.out.println(":1: Adicionar Contato : ");
		System.out.println(":2: Buscar Contato  :");
		System.out.println(":3: Listar Contatos: ");
		System.out.println(":4: Editar Contato: ");
		System.out.println(":5: Remover Contato :");
		System.out.println(":0: Sair do programa :");
	}

	public void menuImprimeCon1
	() {
		System.out.println("\n## Listar Contatos ##");
		System.out.println(":1: Listar TODOS :");
		System.out.println(":2: Listar apenas Pessoas :");
		System.out.println(":3: Listar apenas Empresas :\n");
		System.out.println(":4: Voltar ao menu principal :\n");
	}
	
	public void menuPessoaOuEmpresa() {
		System.out.println("Quem voce deseja adicionar?");
		System.out.println(":1: Pessoa :");
		System.out.println(":2: Empresa :");
	}
	
	public static void menuAlteraContato() {
	System.out.println("================================");
	System.out.println("\n## Alterar Contato ##");
	System.out.println(":1: Altera NOME :");
	System.out.println(":2: Altera ENDERECO :\n");
	System.out.println(":3: Altera TELEFONE :\n");
	System.out.println(":4: Voltar ao menu principal. :\n");
	}
}
