package Lista03.q02;

public class Lampada {
	boolean ligada;
		
	void liga() {
		ligada = true;
	}
	
	void desliga() {
		ligada = false;
	}
	
	public String observa() {
		String statusDaLampada =(ligada)?"Ligada":"Desligada";
		return statusDaLampada;
	}
	
}