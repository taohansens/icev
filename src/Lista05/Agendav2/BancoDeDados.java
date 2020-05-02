package Lista05.Agendav2;

import java.util.*;

public class BancoDeDados {

    private List<Pessoa> agendaBd = new ArrayList<>();


    //retornar tamanho da agenda.
    int getTotal() {
        return agendaBd.size();
    }

    //adicionar contato.
    void adicionar(Pessoa pessoa) {
        agendaBd.add(pessoa);
    }

    //Posicao no array.
    Pessoa buscar(int posicaoNaAgenda) {
        return agendaBd.get(posicaoNaAgenda);
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

    //mostrar contatos.
    void imprimeContato() {
        for (Pessoa pessoa : agendaBd) {
            System.out.println("\n["+ agendaBd.indexOf(pessoa)+"]");
            System.out.println(pessoa);
        }
    }
    //mostrar PF
    void imprimePessoaF() {
        for (Pessoa pessoa : agendaBd) {
            if (pessoa instanceof PessoaFisica) {
                System.out.println("\n["+ agendaBd.indexOf(pessoa)+"]");
                System.out.println(pessoa);
            }
        }
    }
    //mostrar PJ
    void imprimePessoaJ() {
        for (Pessoa pessoa : agendaBd) {
            if (pessoa instanceof PessoaJuridica) {
                System.out.println("\n["+ agendaBd.indexOf(pessoa)+"]");
                System.out.println(pessoa);
            }
        }

    }

    //Alteracoes
    void alterarNome(int posicaoNaAgenda, String novoNome) {
        agendaBd.get(posicaoNaAgenda).setNome(novoNome);
    }

    void alterarEndereco(int posicaoNaAgenda, String novoEndereco) {
        agendaBd.get(posicaoNaAgenda).setEndereco(novoEndereco);
    }

    void alterarTelefone(int posicaoNaAgenda, int novoTelefone) {
        agendaBd.get(posicaoNaAgenda).setTelefone(novoTelefone);
    }

    void removerContato(int posicaoNaAgenda) {
        agendaBd.remove(posicaoNaAgenda);
    }
}

