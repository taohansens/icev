package Lista05.q11eQ12;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPessoa {

    @Test
    void TestaPessoa01() {
        Pessoa p1 = new Pessoa();
        Fornecedor p2 = new Fornecedor();

        p1.setNome("Jonas");
        p1.setEndereco("rua do farol");
        p1.setTelefone("99999");

        p2.setNome("Carlos");
        p2.setEndereco("rua da alameda");
        p2.setTelefone("88888");
        p2.setValorCredito(8000);
        p2.setValorDivida(3000);


        assertEquals(5000, p2.obterSaldo());
        assertEquals("Carlos", p2.getNome());
        assertEquals("rua da alameda", p2.getEndereco());
        assertEquals("88888", p2.getTelefone());
        assertEquals("Jonas", p1.getNome());
        assertEquals("rua do farol", p1.getEndereco());
        assertEquals("99999", p1.getTelefone());
    }
}