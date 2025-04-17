package Empresas;

public class EnderecoFirma {
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;

    public EnderecoFirma(String rua, int numero, String bairro, String complemento, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adress{");
        sb.append("bairro='").append(bairro).append('\'');
        sb.append(", rua='").append(rua).append('\'');
        sb.append(", numero=").append(numero);
        sb.append(", complemento='").append(complemento).append('\'');
        sb.append(", cidade='").append(cidade).append('\'');
        sb.append(", estado='").append(estado).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
