package POO.BlocosInicializacao.Classes;

public class Anime {
    private String nome;
    private int[] episodios = new int[100];

    //Bloco executado sempre antes do construtor da classe
    {
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
