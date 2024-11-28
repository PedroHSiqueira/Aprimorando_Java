package POO.Associacao.Teste;

import POO.Associacao.Classe.Jogador;
import POO.Associacao.Classe.Time;

public class JogadorTeste2 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Katagiri Kanata");
        Time time = new Time("Equipe 86");

        jogador.setTime(time);
        jogador.imprime();
    }
}
