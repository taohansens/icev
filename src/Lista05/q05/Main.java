package Lista05.q05;

public class Main {

	public static void main(String[] args) {

		/*
		 * Trabalhador por hora <= 40 horas.
		 */
		TrabalhadorPorHora trabalhador1 = new TrabalhadorPorHora();
		trabalhador1.setNome("Lucas");
		trabalhador1.calcularPagamento(39); // Trabalhou 39 horas.

		/*
		 * Trabalhador por hora > 40 horas.
		 */

		TrabalhadorPorHora trabalhador2 = new TrabalhadorPorHora();
		trabalhador2.setNome("Andre");
		trabalhador2.calcularPagamento(45); // Trabalhou 45 horas.

		/*
		 * Trabalhador Assalariado == independe de carga horaria.
		 */
		TrabalhadorAssalariado trabalhador3 = new TrabalhadorAssalariado();
		trabalhador3.setNome("Cazuza");
		trabalhador3.calcularPagamento(50); // independe de carga horaria.

		/*
		 * SySout
		 */
		System.out.println("SALARIOS: ");
		System.out.println(trabalhador1+"\n");
		System.out.println(trabalhador2+"\n");
		System.out.println(trabalhador3);

	}

//	public static void mostraTrab(Trabalhador t) {
		//System.out.println("\nNOME: " + t.getNome() + "\nSAL: " + t.getSalario());
//		System.out.println();
//	}
}
