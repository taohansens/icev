package Lista05.AgendaAbs;

import java.util.*;

public class BancoDeDados {

    private List<Pessoa> agendaBd = new ArrayList<Pessoa>();


    //retornar tamanho da agenda.
    int getTotal() {
        return agendaBd.size();
    }

    //adicionar contato.
    void adicionar(Pessoa pessoa) {
        agendaBd.add(pessoa);
    }


}
