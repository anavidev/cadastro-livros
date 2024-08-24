public class Livraria {

    private String autor;
    private String titulo;
    private int edicao;
    private String editora;
    private int anoDePublicacao;
    private String assuntoPrincipal;

    public void setDefinirAutor(String definirAutor) {
        this.autor = definirAutor;
    }

    public void setDefinirTitulo(String definirTitulo) {
        this.titulo = definirTitulo;
    }

    public void setDefinirEdicao(int definirEdicao) {
        this.edicao = definirEdicao;
    }

    public void setDefinirEditora(String definirEditora) {
        this.editora = definirEditora;
    }

    public void setDefinirAnoDePublicacao(int definirAnoDePublicacao) throws Exception {
        if (definirAnoDePublicacao > 2020) {
            throw new Exception("Ano inválido.");
        }
        this.anoDePublicacao = definirAnoDePublicacao;
    }

    public void setDefinirAssuntoPrincipal(String definirAssuntoPrincipal) {
        this.assuntoPrincipal = definirAssuntoPrincipal;
    }

    public String getVerLivro() {
        return("\nLivro '" + titulo + "'" + "\n\nAutor: " + autor + "\nEdição: " + edicao + "\nEditora: " + editora + "\nAno de publicação: " + anoDePublicacao + "\nAssunto principal: " + assuntoPrincipal);
    }

}