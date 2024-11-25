package POO.Classes;

import POO.Interfaces.Carnivoro;

public class Gato extends Animal implements Carnivoro {
    private String nome;
    private String raca;
    private int peso;

    public Gato(char genero, int idade, String nome, int peso, String raca) {
        super(genero, idade);
        this.nome = nome;
        this.peso = peso;
        this.raca = raca;
    }

    //Métodos vindos da Classe Abstrata Animal
    @Override
    public void gerarSom() {
        System.out.println("Meow meow");
    }

    //Métodos vindos da Interface Carnivoro
    @Override
    public void comerCarne() {
        System.out.println("Comendo Petiscos de carne");
    }

    @Override
    public void cacarPresa() {
        System.out.println("Procurando alvo");
    }

    //Encapsulamento
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
}
