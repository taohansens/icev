package Lista03.q03;

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
		
}