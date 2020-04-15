package Lista04.q02;

public class Gui {
	
	public void menuPrincipal() {
		System.out.println("\n::: Tarefas ToDo :::");
		System.out.println(":::- Menu -:::");
		System.out.println(":1: Adicionar ToDo : ");
		System.out.println(":2: Listar tarefas  :");
		System.out.println(":3: Concluir tarefa: ");
		System.out.println(":4: Remover tarefa :");
		System.out.println(":0: Sair do programa :");
	}
	
	public void menuTarefas() {
		System.out.println("\n## Listar Tarefas ##");
		System.out.println(":1: Listar TODAS :");
		System.out.println(":2: Listar apenas PENDENTES :");
		System.out.println(":3: Listar apenas CONCLUIDAS :\n");
		System.out.println(":4: Voltar ao menu :\n");
	}
}
