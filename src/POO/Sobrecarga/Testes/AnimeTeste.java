package POO.Sobrecarga.Testes;

import POO.Sobrecarga.Classe.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("MF Ghost", "TV", 24, "Automobilismo");
        System.out.println(anime.toString());
    }
}
