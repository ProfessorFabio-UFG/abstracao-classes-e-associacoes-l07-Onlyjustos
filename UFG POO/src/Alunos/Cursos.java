package Alunos;

public class Cursos {
    String nome;
    String sigla;
    Departamento dept;

    public Cursos(String nome, String sigla, String nomeD,String siglaD) {
        dept= new Departamento(nomeD,siglaD);
        this.nome = nome;
        this.sigla = sigla;
    }

    @Override
    public String toString() {

        return this.nome + " " + this.sigla + " " + this.dept;
    }
}
