package POO.BlocosInicializacao.Testes;

import POO.BlocosInicializacao.Classes.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Initial D");

        for(int num : anime.getEpisodios()){
            System.out.print(num + " ");
        }
    }
}
