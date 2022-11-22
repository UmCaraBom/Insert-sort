package insert;

import java.util.Scanner;

//criando algoritmo de ordenação por inserção em java usando lista ligada 
public class programa2{
    public static void main(String[] args) {
        //criando objeto para a lista ligada
        ListaLigada lista = new ListaLigada();
        //criando objeto para entrada de dados
        Scanner entrada = new Scanner(System.in);
        //criando variáveis para o programa
        int tamanho, valor;
        //pedindo para o usuário digitar o tamanho da lista
        System.out.println("Digite o tamanho da lista: ");
        tamanho = entrada.nextInt();
        //pedindo para o usuário digitar os valores da lista
        System.out.println("Digite os valores da lista: ");
        for(int i = 0; i < tamanho; i++){
            valor = entrada.nextInt();
            lista.inserirFinal(valor);
        }
        //chamando método para ordenar a lista
        lista.ordenar();
        //mostrando a lista ordenada
        System.out.println("Lista ordenada: ");
        lista.imprimir();
    }
}