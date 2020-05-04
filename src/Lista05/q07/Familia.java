package Lista05.q07;

import java.util.*;

public class Familia {
    List<Pessoa> membros = new ArrayList<>();

    public void adicionaPessoa(Pessoa p) {
        membros.add(p);
    }

    public void getPessoasFamilia() {
        for (Pessoa pp : membros) {
            System.out.println(pp.getNome());
        }
    }
}
