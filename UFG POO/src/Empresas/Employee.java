package Empresas;



public class Employee {
    private EnderecoFirma endereco;
    private String nome;
    private int matricula;

    public Employee(EnderecoFirma endereco, String nome, int matricula) {
        this.endereco = endereco;
        this.nome = nome;
        this.matricula = matricula;

    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("endereco=").append(endereco);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", matricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }
}
