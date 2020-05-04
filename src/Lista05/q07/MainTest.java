package Lista05.q07;

import Lista05.q07.Familia;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static junit.framework.Assert.assertEquals;
import static Lista05.q07.Main.censo;

class MainTest {

    @Test
    //Familia com 1 pessoa
    public void testeC1Pessoa() {
        Familia e = new Familia();
        Pessoa ab = new TrabAutonomo("af1");
        e.adicionaPessoa(ab);
        assertEquals(1, e.getPessoasFamilia());
    }
    //Familia com 3 pessoas
    @Test
    public void testeC3Pessoa() {
        Familia f = new Familia();
        Pessoa a = new TrabHorista("af");
        Pessoa b = new Pessoa("bf");
        Pessoa c = new Pessoa("cf");
        f.adicionaPessoa(a);
        f.adicionaPessoa(b);
        f.adicionaPessoa(c);
        assertEquals(3, f.getPessoasFamilia());
    }

    //Familia com 4 pessoas
    @Test
    public void testeC4Pessoa() {
        Familia g = new Familia();
        Pessoa d = new TrabAssalariado("dg");
        Pessoa e = new Pessoa("eg");
        Pessoa gg = new Pessoa("fg");
        Pessoa hh = new Pessoa("gg");
        g.adicionaPessoa(d);
        g.adicionaPessoa(e);
        g.adicionaPessoa(gg);
        g.adicionaPessoa(hh);
        assertEquals(4, g.getPessoasFamilia());

    }

    //Adicionando familias
    @Test
    public void testeFamilias() {
        Familia e = new Familia();
        Pessoa ab = new TrabAutonomo("af1");
        e.adicionaPessoa(ab);

        Familia f = new Familia();
        Pessoa a = new TrabHorista("af");
        Pessoa b = new Pessoa("bf");
        Pessoa c = new Pessoa("cf");
        f.adicionaPessoa(a);
        f.adicionaPessoa(b);
        f.adicionaPessoa(c);

        Familia g = new Familia();
        Pessoa d = new TrabAssalariado("dg");
        Pessoa ee = new TrabAutonomo("ee");
        Pessoa gg = new TrabHorista("fg");
        Pessoa hh = new TrabAssalariado("gg");
        g.adicionaPessoa(d);
        g.adicionaPessoa(ee);
        g.adicionaPessoa(gg);
        g.adicionaPessoa(hh);

        censo.add(e);
        censo.add(f);
        censo.add(g);

        assertEquals(4,g.getPessoasFamilia());

    }

}
