package Lista05.q10;

public class Main {

	public static void main(String[] args) {
		/*
		 * Teste: Criar cada pessoa (Gerente, Vendedor, Cliente). E mostrar sua saída de
		 * dados. (toString)
		 */
		Pessoa gerente = new Gerente("Adalto", 39, "M", 5000, "945786", "Gerente de RH");
		Pessoa vendedor = new Vendedor("Lucas", 25, "M", 1045, "945887", 1000, 10);
		Pessoa cliente = new Cliente("Luciana", 24, "F", 15000, 1996);

		System.out.println(gerente + "\n");
		System.out.println(vendedor + "\n");
		System.out.println(cliente + "\n");
	}
}
