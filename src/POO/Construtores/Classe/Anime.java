package POO.Construtores.Classe;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //Iniciando um Contrutor / Nome igual ao da classe
    public Anime(String nome, String tipo, int episodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    //Sobrecarga de Construtores
    public Anime(){

    }

    @Override
    public String toString() {
        return "Nome do anime: " +  this.nome + ", tipo do anime: " + this.tipo + ", Numero de episodios: " + this.episodios + ", Genero: " + genero ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
