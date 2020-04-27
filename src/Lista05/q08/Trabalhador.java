package Lista05.q08;

abstract class Trabalhador extends Pessoa {
	String emprego;


	public Trabalhador(String nome, String emprego) {
		super(nome);
		this.emprego = emprego;
	}
	
}

class TrabAssalariado extends Trabalhador {

	public TrabAssalariado(String nome, String emprego) {
		super(nome,emprego);
	}
}

class TrabHorista extends Trabalhador {
	public TrabHorista(String nome, String emprego) {
		super(nome, emprego);
	}
}

class TrabAutonomo extends Trabalhador {
	public TrabAutonomo(String nome, String emprego) {
		super(nome, emprego);
	}
}