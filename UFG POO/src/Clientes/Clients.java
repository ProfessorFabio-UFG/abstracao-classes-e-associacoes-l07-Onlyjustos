package Clientes;

public class Clients {
    String nome;
    int cpf;
    Adress endereco;

    public Clients(Adress endereco, String nome, int cpf) {
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return endereco+" "+nome+" "+cpf;
    }
}
