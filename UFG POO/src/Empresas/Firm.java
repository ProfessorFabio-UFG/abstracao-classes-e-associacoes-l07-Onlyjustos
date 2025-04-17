package Empresas;



import java.util.Arrays;

public class Firm {
    String cnpj;
    String razao;
    Employee[] empregado;
    EnderecoFirma endereco;

    public Firm(String cnpj, String razao, Employee[] empregado, EnderecoFirma endereco) {
        this.cnpj = cnpj;
        this.razao = razao;
        this.empregado = empregado;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Firm{");
        sb.append("cnpj='").append(cnpj).append('\'');
        sb.append(", razao='").append(razao).append('\'');
        sb.append(", empregado=").append(Arrays.toString(empregado));
        sb.append(", endereco=").append(endereco);
        sb.append('}');
        return sb.toString();
    }

}
