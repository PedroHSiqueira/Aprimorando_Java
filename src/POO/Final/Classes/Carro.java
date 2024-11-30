package POO.Final.Classes;

public class Carro {
    private String nome;

    //Se torna uma constante com a palavra Final, não pode mais ser alterada
    public static final double VELOCIDADE_LIMITE = 250;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
