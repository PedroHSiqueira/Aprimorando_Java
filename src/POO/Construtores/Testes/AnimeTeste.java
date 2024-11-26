package POO.Construtores.Testes;

import POO.Construtores.Classe.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("MF Ghost Season 1", "TV", 12, "Automobilismo");
        Anime anime2 = new Anime("Attack  on Titan", "TV", 80, "Ação e Sobrevivencia", "Mappa");
        System.out.println(anime.toString());
        System.out.println(anime2.toString() + " Studio: " + anime2.getStudio());
    }
}
