package Lista05.q10;

public class Pessoa {

}



abstract class Empregado extends Pessoa{

}

abstract class Cliente extends Pessoa{
	
}


abstract class Gerente extends Empregado{
	private String nomeGerencia;

	protected String getNomeGerencia() {
		return nomeGerencia;
	}

	protected void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
}

abstract class Vendedor extends Empregado{
	private double valorVendas;
	private int qntVendas;
	
}