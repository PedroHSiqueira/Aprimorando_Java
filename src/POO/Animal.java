package POO;

public abstract class Animal {
    char genero;
    int idade;

    public Animal(char genero, int idade) {
        this.genero = genero;
        this.idade = idade;
    }

    public abstract void gerarSom();
}
