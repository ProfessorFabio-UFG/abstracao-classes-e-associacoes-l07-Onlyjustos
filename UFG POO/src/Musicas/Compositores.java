package Musicas;

public class Compositores {
    String nome;
    String nasc;

    public Compositores(String nome, String nasc){

        this.nome = nome;
        this.nasc = nasc;

    }
    @Override
    public String toString() {
        return this.nome+ " "+ this.nasc;
    }


}


