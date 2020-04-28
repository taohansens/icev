package Lista05.q09;

abstract class Animal {
	private String nome;
	private double peso;
	
	protected Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected double getPeso() {
		return peso;
	}
	protected void setPeso(double peso) {
		this.peso = peso;
	}	
}

class Peixe extends Animal {
	private String tipoHabitat;

	protected Peixe(String nome, double peso, String tipoHabitat) {
		super(nome, peso);
		this.tipoHabitat = tipoHabitat;
	}

	protected String getTipoHabitat() {
		return tipoHabitat;
	}

	protected void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}

	@Override
	public String toString() {
		return "Peixe - Nome: " + getNome() + ", Peso: " + getPeso() + "Kg , Tipo de Habitat: " + getTipoHabitat();
	}
	
	
	
}

class Cachorro extends Animal {
	private String raca;
	protected Cachorro(String nome, double peso, String raca) {
		super(nome, peso);
		this.raca = raca;
	}

	protected String getRaca() {
		return raca;
	}

	protected void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Cachorro - Nome: " + getNome() + ", Peso: " + getPeso() + "Kg , Raca: " + getRaca();
	}
	
}