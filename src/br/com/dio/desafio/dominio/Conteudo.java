package br.com.dio.desafio.dominio;

public abstract class Conteudo {
// static >> indica que é possível consultar essa constante fora da classe
// final >> indica que é uma constante
    protected static final double XP_PRADRAO = 10d;

    private String titulo;
    private String descricao;

    // indica que a classe que herda conteúdo vai ter esse método.
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
