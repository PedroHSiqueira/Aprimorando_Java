package POO.Classes;

public abstract class Animal {
    protected char genero;
    protected int idade;

    public Animal(char genero, int idade) {
        this.genero = genero;
        this.idade = idade;
    }

    public abstract void gerarSom();
}
