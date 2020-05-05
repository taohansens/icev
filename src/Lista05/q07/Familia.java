package Lista05.q07;

import java.util.*;

public class Familia {
    private List<Pessoa> membros = new ArrayList<>();

    protected void adicionaPessoa(Pessoa p) {
        membros.add(p);
    }

    protected int getPessoasFamilia() {
        return membros.size();
    }

    protected int getQtdTrabalhadores() {
        int qtd=0;
        for (Pessoa pp: membros) {
            if (pp instanceof Trabalhador)
                qtd++;
        }
        return qtd;
    }

    protected int getQtdTrabAss() {
        int qtd=0;
        for (Pessoa pp: membros) {
            if (pp instanceof TrabAssalariado)
                qtd++;
        }
        return qtd;
    }

    protected int getQtdTrabHor() {
        int qtd=0;
        for (Pessoa pp: membros) {
            if (pp instanceof TrabHorista)
                qtd++;
        }
        return qtd;
    }

    protected int getQtdTrabAuto() {
        int qtd=0;
        for (Pessoa pp: membros) {
            if (pp instanceof TrabAutonomo)
                qtd++;
        }
        return qtd;
    }

    protected void todosMembros(){
        for (Pessoa pp:membros){
            System.out.println(pp.getNome());
        }
    }
}
