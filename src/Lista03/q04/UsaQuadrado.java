package Lista03.q04;

public class UsaQuadrado {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		
		System.out.println("Q1 Lado("+q1.getLado()+")");
		q1.imprime();
		System.out.println("\nQ2 Lado("+q2.getLado()+")");
		q2.imprime();
		System.out.println("\nQ3 Lado("+q3.getLado()+")");
		q3.imprime();
	}

}
