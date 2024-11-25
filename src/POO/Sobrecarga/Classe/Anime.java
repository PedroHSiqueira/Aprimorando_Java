package POO.Sobrecarga.Classe;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //Sobrecarga / Mesmo nome mas parametros diferentes
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void  init(String nome, String tipo, int episodios, String genero ){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome do anime: " +  this.nome + ", tipo do anime: " + this.tipo + ", Numero de episodios: " + this.episodios ;
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
