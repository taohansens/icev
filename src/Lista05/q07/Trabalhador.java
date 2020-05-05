package Lista05.q07;

abstract class Trabalhador extends Pessoa {

    protected Trabalhador(String nome) {
        super(nome);
    }

}

class TrabAssalariado extends Trabalhador {

    protected TrabAssalariado(String nome) {
        super(nome);
    }
}

class TrabHorista extends Trabalhador {
    protected TrabHorista(String nome) {
        super(nome);
    }
}

class TrabAutonomo extends Trabalhador {
    protected TrabAutonomo(String nome) {
        super(nome);
    }
}