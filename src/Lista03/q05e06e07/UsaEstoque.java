package Lista03.q05e06e07;

public class UsaEstoque {

	public static void main(String[] args) {
		Estoque estoque1 = new Estoque("Impressora jato de tinta", 13, 6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 Pol", 11, 13);
		Estoque estoque3 = new Estoque("Mouse Otico", 6, 2);

		
		System.out.println("========QTD original======");
		System.out.println(estoque1.mostra()+"\n\n"+estoque2.mostra()+"\n\n"+estoque3.mostra());
		System.out.println();
		
		/*
		 * Se valor de baixa ou qtdMinima <0, operação não será efetuada.
		 */
		
		//darBaixa e repor estoque
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		//mostrar se precisa repor ou não
		
		estoque1.mudarQtdMinima(10);
		estoque2.mudarQtdMinima(10);
		estoque3.mudarQtdMinima(10);
		
		System.out.println("========QTD final======");
		System.out.println(estoque1.mostra()+"\n\n"+estoque2.mostra()+"\n\n"+estoque3.mostra());
		System.out.println();
		
		
		
	}
}
