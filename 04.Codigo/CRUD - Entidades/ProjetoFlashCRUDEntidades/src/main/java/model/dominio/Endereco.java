package model.dominio;

/**
 * Created by danilo on 24/09/16.
 */
public class Endereco implements Cloneable {
    private String municipio;
    private String bairro;
    private String endereco;
    private String numero;
    private String cep;

    public Endereco() {
        this.municipio = "";
        this.bairro = "";
        this.endereco = "";
        this.numero = "";
        this.cep = "";
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public Object clone() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
