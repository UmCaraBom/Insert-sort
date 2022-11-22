package insert;
import java.util.Scanner;

//criando algoritmo de ordenação por inserção em java com lista ligada

//criando classe para a lista ligada
public class ListaLigada {
    //criando classe para os pontos da lista ligada
    private class Ponto{
        private int valor;
        private Ponto proximo;
        //criando construtor para inserir valor ao ponto
        public Ponto(int novoValor){
            this.valor = novoValor;
        }
        //criar getters e setters
        public int getValor(){
            return valor;
        }
        public void setValor(int valor){
            this.valor = valor;
        }
        public Ponto getProximo(){
            return proximo;
        }
        public void setProximo(Ponto proximo){
            this.proximo = proximo;
        } 
    }
    //criando variáveis para a lista ligada
    private Ponto primeiro;
    private Ponto ultimo;
    private int tamanho;
    //criando construtor para a lista ligada
    public ListaLigada(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    //criando método para inserir no início da lista ligada
    public void inserirInicio(int valor){
        Ponto novoPonto = new Ponto(valor);
        novoPonto.setProximo(primeiro);
        primeiro = novoPonto;
        if(tamanho == 0){
            ultimo = primeiro;
        }
        tamanho++;
    }
    //criando método para inserir no final da lista ligada
    public void inserirFinal(int valor){
        if(tamanho == 0){
            inserirInicio(valor);
        }else{
            Ponto novoPonto = new Ponto(valor);
            ultimo.setProximo(novoPonto);
            ultimo = novoPonto;
            tamanho++;
        }
    }
    //criando método para inserir em uma posição específica da lista ligada
    public void inserirPosicao(int valor, int posicao){
        if(posicao == 0){
            inserirInicio(valor);
        }else if(posicao == tamanho){
            inserirFinal(valor);
        }else{
            Ponto novoPonto = new Ponto(valor);
            Ponto anterior = primeiro;
            for(int i = 0; i < posicao - 1; i++){
                anterior = anterior.getProximo();
            }
            Ponto proximo = anterior.getProximo();
            anterior.setProximo(novoPonto);
            novoPonto.setProximo(proximo);
            tamanho++;
        }
    }
    //criando método para remover do início da lista ligada
    public int removerInicio(){
        if(tamanho == 0){
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
        int valor = primeiro.getValor();
        primeiro = primeiro.getProximo();
        tamanho--;
        if(tamanho == 0){
            ultimo = null;
        }
        return valor;
    }
    //criando método para remover do final da lista ligada
    public int removerFinal(){
        if(tamanho == 0){
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
        int valor = ultimo.getValor();
        if(tamanho == 1){
            primeiro = null;
            ultimo = null;
        }else{
            Ponto anterior = primeiro;
            for(int i = 0; i < tamanho - 2; i++){
                anterior = anterior.getProximo();
            }
            anterior.setProximo(null);
            ultimo = anterior;
        }
        tamanho--;
        return valor;
    }
    //criando método para remover de uma posição específica da lista ligada
    public int removerPosicao(int posicao){
        if(posicao < 0 || posicao >= tamanho){
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if(posicao == 0){
            return removerInicio();
        }else if(posicao == tamanho - 1){
            return removerFinal();
        }else{
            Ponto anterior = primeiro;
            for(int i = 0; i < posicao - 1; i++){
                anterior = anterior.getProximo();
            }
            Ponto atual = anterior.getProximo();
            Ponto proximo = atual.getProximo();
            anterior.setProximo(proximo);
            tamanho--;
            return atual.getValor();
        }
    }
    //criando método para imprimir a lista ligada
    public void imprimir(){
        Ponto atual = primeiro;
        for(int i = 0; i < tamanho; i++){
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
    //criando método para ordenar a lista ligada
    public void ordenar(){
        Ponto atual = primeiro;
        Ponto proximo = atual.getProximo();
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho - 1; j++){
                if(atual.getValor() > proximo.getValor()){
                    int aux = atual.getValor();
                    atual.setValor(proximo.getValor());
                    proximo.setValor(aux);
                }
                atual = atual.getProximo();
                proximo = proximo.getProximo();
            }
            atual = primeiro;
            proximo = atual.getProximo();
        }
    }
    //criando método para buscar um valor na lista ligada
    public int buscar(int valor){
        Ponto atual = primeiro;
        for(int i = 0; i < tamanho; i++){
            if(atual.getValor() == valor){
                return i;
            }
            atual = atual.getProximo();
        }
        return -1;
    }
    //criando método para retornar o tamanho da lista ligada
    public int getTamanho(){
        return tamanho;
    }
}