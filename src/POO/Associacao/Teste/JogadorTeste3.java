package POO.Associacao.Teste;

import POO.Associacao.Classe.Jogador;
import POO.Associacao.Classe.Time;

public class JogadorTeste3 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Katagiri Kanata");
        Jogador jogador2 = new Jogador("Maihara Ozou");
        Time time = new Time("Equipe 86");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogadores ---");
        jogador1.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
