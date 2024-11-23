package POO;

public class Gato extends Animal implements Carnivoro{
    String nome;
    String raca;
    int peso;

    public Gato(char genero, int idade, String nome, int peso, String raca) {
        super(genero, idade);
        this.nome = nome;
        this.peso = peso;
        this.raca = raca;
    }

    @Override
    public void gerarSom() {
        System.out.println("Meow meow");
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
        return "Olá! meu nome é " + this.nome + "e sou de pelagem " + this.raca;
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo Petiscos de carne");
    }

    @Override
    public void cacarPresa() {
        System.out.println("Procurando alvo");
    }
}
