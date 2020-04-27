package Lista05.q08;
import java.util.*;

public class Familia {
	List<Pessoa> membros = new ArrayList<Pessoa>();
	static int cont;
	public void adicionaPessoa(Pessoa p) {
		membros.add(p);
	}
	
	public void getPessoasFamilia() {
	for (Pessoa pp : membros) {
		System.out.println(pp.getNome());
	}
	}
}
