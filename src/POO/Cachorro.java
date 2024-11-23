package POO;

public class Cachorro extends Animal implements Carnivoro{
    String nome;
    String raca;
    int peso;

    public Cachorro(char genero, int idade, String nome, int peso, String raca) {
        super(genero, idade);
        this.nome = nome;
        this.peso = peso;
        this.raca = raca;
    }

    @Override
    public void gerarSom() {
        System.out.println("Wan Wan");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Olá! meu nome é " + this.nome + "e sou da raça " + this.raca;
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo Carne");
    }

    @Override
    public void cacarPresa() {
        System.out.println("Procurando");
    }
}
