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

    //buscar contato por nome.
    Pessoa buscar(String nome) {
        for (Pessoa pessoa : agendaBd) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }

    //buscar contato por telefone.
    Pessoa buscar(int telefone, int a) {
        for (Pessoa pessoa : agendaBd) {
            if (pessoa.getTelefone() == telefone) {
                return pessoa;
            }
        }
        return null;
    }

}
