package Lista05.q05;

public abstract class Trabalhador {
	
	protected double vhora = 20; // R$ por Hora.
	
	protected String nome;
	protected double salario;

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
}

class TrabalhadorPorHora extends Trabalhador {
	void calcularPagamento(int horas) {
		if (horas > 40) {
			this.salario = (40 * vhora) + ((horas - 40) * 1.5) * vhora;
		} else {
			this.salario = horas * vhora;
		}
	}
}

class TrabalhadorAssalariado extends Trabalhador {
	void calcularPagamento(int horas) {
		this.salario = 40 * vhora;
	}
}
