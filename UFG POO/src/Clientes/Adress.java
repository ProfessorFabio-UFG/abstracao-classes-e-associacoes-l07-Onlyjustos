package Clientes;

public class Adress {
    private String rua;
    private int numero;
    private int CEP;
    private String cidade;
    private String complemento;
    private String estado;

    public Adress(String rua, int numero, int CEP, String cidade, String complemento, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;

    }

    @Override
    public String toString() {
        return this.rua+" "+this.numero+" "+this.CEP+" "+this.cidade+" "+this.complemento+" "+this.estado;
    }
}
