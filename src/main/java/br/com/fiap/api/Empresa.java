package br.com.fiap.api;

public class Empresa {

    //encapsulamento,dados e atributos:
    private String cnpj;
    private String nome;
    private String abertura;
    private String situacao;
    private String tipo;
    private String porte;
    private String logradouro;
    private String numero;
    private String bairro;
    private String municipio;
    private String uf;
    private String cep;
    private String telefone;
    private String email;

    //construtor vazio:

    public Empresa() {
    }

    //construtor cheio:

    public Empresa(String cnpj, String nome, String abertura, String situacao, String tipo, String porte, String logradouro, String numero, String bairro, String municipio, String uf, String cep, String telefone, String email) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.abertura = abertura;
        this.situacao = situacao;
        this.tipo = tipo;
        this.porte = porte;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    //getter e setter:

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //To String:

    @Override
    public String toString() {
        return "Empresa" +
                "\ncnpj='" + cnpj + '\'' +
                "\nnome='" + nome + '\'' +
                "\nabertura='" + abertura + '\'' +
                "\nsituacao='" + situacao + '\'' +
                "\ntipo='" + tipo + '\'' +
                "\nporte='" + porte + '\'' +
                "\nlogradouro='" + logradouro + '\'' +
                "\nnumero='" + numero + '\'' +
                "\nbairro='" + bairro + '\'' +
                "\nmunicipio='" + municipio + '\'' +
                "\nuf='" + uf + '\'' +
                "\ncep='" + cep + '\'' +
                "\ntelefone='" + telefone + '\'' +
                "\nemail='" + email + '\'';
    }
}
