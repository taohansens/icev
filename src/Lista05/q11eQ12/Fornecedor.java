package Lista05.q11eQ12;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    protected double getValorCredito() {
        return valorCredito;
    }

    protected void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    protected double getValorDivida() {
        return valorDivida;
    }

    protected void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
