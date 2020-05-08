package Lista05.q11eQ12;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    protected int getCodigoSetor() {
        return codigoSetor;
    }

    protected void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    protected double getSalarioBase() {
        return salarioBase;
    }

    protected void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    protected double getImposto() {
        return imposto;
    }

    protected void setImposto(double imposto) {
        this.imposto = imposto/100;
    }

    protected double calcularSalario(){
        return getSalarioBase()*(1-getImposto());
    }
}

class Administrador extends Empregado {
    private double ajudaDeCusto;

    protected double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    protected void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    protected void setSalarioBase(double salarioBase) {
        super.setSalarioBase(salarioBase+getAjudaDeCusto());
    }
}
