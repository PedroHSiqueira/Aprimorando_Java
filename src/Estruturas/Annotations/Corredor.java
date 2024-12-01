package Estruturas.Annotations;

@MuitoImportante
public class Corredor {
    private String nome;
    private String carro;

    public Corredor(String nome, String carro) {
        this.nome = nome;
        this.carro = carro;
    }

    @Instantaneo(vezes = 3)
    public void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
}
