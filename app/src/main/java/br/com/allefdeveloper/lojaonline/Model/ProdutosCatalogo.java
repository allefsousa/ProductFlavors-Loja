package br.com.allefdeveloper.lojaonline.Model;

/**
 * Created by allef on 11/02/2018.
 */

public class ProdutosCatalogo {
    private String titulo;
    private Double preco;
    private String urlImagens;
    private int id;

    public ProdutosCatalogo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getUrlImagens() {
        return urlImagens;
    }

    public void setUrlImagens(String urlImagens) {
        this.urlImagens = urlImagens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
