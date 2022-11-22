package insert;

public class Ponto {
    private String valor;
    private Ponto proximo;

    // criando construtor para inserir valor ao ponto
    public Ponto(String novoValor) {
        this.valor = novoValor;
    }

    // criar getters e setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Ponto getProximo() {
        return proximo;
    }

    public void setProximo(Ponto proximo) {
        this.proximo = proximo;
    }

    public Ponto(String valor, Ponto proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }
}