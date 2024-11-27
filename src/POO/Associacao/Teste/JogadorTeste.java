package POO.Associacao.Teste;

import POO.Associacao.Classe.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Siqueira");
        Jogador jogador2 = new Jogador("Ludtke");
        Jogador jogador3 = new Jogador("Monteiro");
        Jogador[]  jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
