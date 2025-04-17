package Alunos;

import java.util.Arrays;

public class Students {


    private int ano;
    private int matricula;
    private Cursos[] curso;
    public Students(Cursos[] curso, int ano, int matricula) {
        this.curso = curso;
        this.ano = ano;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Students{");
        sb.append("ano=").append(ano);
        sb.append(", matricula=").append(matricula);
        sb.append(", curso=").append(Arrays.toString(curso));
        sb.append('}');
        return sb.toString();
    }
}
