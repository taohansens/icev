package Lista05.Agendav1;

import java.util.*;

public class BaseDeDados {

	private List<Pessoa> Agenda = new ArrayList<Pessoa>();

	static int numContatos = 0;

	int getTotal() {
		return Agenda.size();
	}

	void adicionar(Pessoa p) {
		Agenda.add(p);
	}

	Pessoa buscar(int posicaoNaAgenda) {
		return Agenda.get(posicaoNaAgenda);
	}

	Pessoa buscar(String nome) {
		for (int i = 0; i < Agenda.size(); i++) {
			if (Agenda.get(i).getNome().equals(nome)) {
				return Agenda.get(i);
			} else {
				continue;
			}
		}
		return null;
	}

	Pessoa buscar(String telefone, int tel) {
		for (int i = 0; i < Agenda.size(); i++) {
			if (Agenda.get(i).getTelefone().equals(telefone.toUpperCase())) {
				return Agenda.get(i);
			} else {
				continue;
			}
		}
		return null;
	}

	void alterarNomePessoa(int posicaoNaAgenda, String novoNome) {
		Agenda.get(posicaoNaAgenda).setNome(novoNome);
	}

	void alterarDocumento(int posicaoNaAgenda, String novoDocumento) {
		if (Agenda.get(posicaoNaAgenda).getPfPj()) {
			Agenda.get(posicaoNaAgenda).setRg(novoDocumento);
		} else {
			Agenda.get(posicaoNaAgenda).setCnpj(novoDocumento);
		}
	}

	void alterarEndereco(int posicaoNaAgenda, String novoEndereco) {
		Agenda.get(posicaoNaAgenda).setEndereco(novoEndereco);
	}

	void alterarTelefone(int posicaoNaAgenda, String novoTelefone) {
		Agenda.get(posicaoNaAgenda).setTelefone(novoTelefone);
	}

	void removerContato(int posicaoNaAgenda) {
		Agenda.remove(posicaoNaAgenda);
	}
}