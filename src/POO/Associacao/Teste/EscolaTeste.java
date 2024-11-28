package POO.Associacao.Teste;

import POO.Associacao.Classe.Escola;
import POO.Associacao.Classe.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Gladimir");
        Professor professor2 = new Professor("Angelo");
        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("Unisenac");
        Escola escola1 = new Escola("Escola Senac", professores);

        escola1.imprime();
    }
}
