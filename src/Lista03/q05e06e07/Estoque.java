package Lista03.q05e06e07;

public class Estoque {
	String nome;
	int qtdAtual;
	int qtdMinima;

	public Estoque() {
	}

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	String getNome() {
		return nome;
	}

	void mudarNome(String nome) {
		this.nome = nome;
	}

	int getQtdAtual() {
		return qtdAtual;
	}

	void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	int getQtdMinima() {
		return qtdMinima;
	}

	void mudarQtdMinima(int qtdMinima) {
		int qtdTemp = qtdMinima;
		if (qtdTemp >= 0) {
			this.qtdMinima = qtdTemp;
		}
		else {
		
		}
	}
	
	void repor(int qtd) {
		this.qtdAtual = this.qtdAtual + qtd;
	}
	
	void darBaixa(int qtd) {
		int qtdTemp = this.qtdAtual - qtd;
		if (qtdTemp >= 0) {
			this.qtdAtual = qtdTemp;
		}
		else {
		
		}
	}
	
	String mostra() {
		return ("Nome: "+this.getNome()+"\nqtdAtual: "+this.getQtdAtual()+
				"\nqtdMinima: "+this.getQtdMinima()+"\nPrecisa repor? "+precisaRepor());
		
	}
	
	boolean precisaRepor() {
		return (this.qtdAtual<this.getQtdMinima())?true:false;
	}
	
	
}