> 11 ) Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e
modificadores (setters). Atributos: String nome; String endereço; String telefone;
> 
>12 ) Considere, como subclasse da classe Pessoa (desenvolvida no item anterior) a classe Fornecedor. Considere que
cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os atributos
valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida
para com o fornecedor).
>
> 13 ) Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método
 obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida.
>
> 14 ) Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o
 funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
>
>> 15 ) Considere, como outra subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe
 Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro),
 salarioBase (vencimento base) e imposto (porcentagem retida dos impostos).
>
 > 16 ) Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario. Escreva
 um programa de teste adequado para a classe Empregado.
>
 > 17 ) Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem
 como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas
 referentes a viagens, estadias, ...). Note que deverá redefinir na classe Administrador o método herdado
 calcularSalario (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das
 ajuda de custo). Escreva um programa de teste adequado para esta classe