package Lista05.q09;

public class Main {

	public static void main(String[] args) {
		/*
		 * Teste: Criar cada pessoa (Gerente, Vendedor, Cliente). E mostrar sua saída de
		 * dados. (toString)
		 */
		Animal peixe = new Peixe("Tambaqui", 0.8, "Ornamental");
		Animal cachorro = new Cachorro("Madchen", 40, "Weimaraner");

		System.out.println(peixe + "\n");
		System.out.println(cachorro + "\n");
	}
}
