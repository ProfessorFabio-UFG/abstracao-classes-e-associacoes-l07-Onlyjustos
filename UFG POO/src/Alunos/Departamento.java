package Alunos;

public class Departamento {
    private String nome;
    private String sigla;

    public Departamento(String nome, String sigla){
        this.nome=nome;
        this.sigla=sigla;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sigla;
    }
}
