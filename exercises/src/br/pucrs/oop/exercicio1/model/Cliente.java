package br.pucrs.oop.exercicio1.model;

public abstract class Cliente {

    // == fields ==
    private String codigo;
    private String nome;

    // == constructors ==
    Cliente(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // == public methods ==
    public abstract String getId();

    public abstract void setId(String id);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;

        Cliente cliente = (Cliente) o;

        return codigo.equals(cliente.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
