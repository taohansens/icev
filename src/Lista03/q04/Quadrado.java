package Lista03.q04;

public class Quadrado {
	double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	double area() {
		double area = getLado()*getLado();
		return area;
	}
	
	double perimetro() {
		double perim = getLado()*4;
		return perim;
	}
	
	void imprime() {
		System.out.println("Area = " + area());
		System.out.println("Perimetro = " + perimetro());
	}
	
}