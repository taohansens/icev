package Lista05.q07;

abstract class Trabalhador extends Pessoa {

    public Trabalhador(String nome) {
        super(nome);
    }

}

class TrabAssalariado extends Trabalhador {

    public TrabAssalariado(String nome) {
        super(nome);
    }
}

class TrabHorista extends Trabalhador {
    public TrabHorista(String nome) {
        super(nome);
    }
}

class TrabAutonomo extends Trabalhador {
    public TrabAutonomo(String nome) {
        super(nome);
    }
}