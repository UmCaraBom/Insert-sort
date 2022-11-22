//criando algoritmo de ordenação por inserção em java
package insert;
import java.util.Scanner;
public class programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[10]; //criando vetor de 10 posições
        int i, j, aux; //criando variáveis para o programa

        //AGORA VAMOS PREENCHER O VETOR COM OS VALORES DO USUÁRIO E ORDENAR ELES DE FORMA CRESCENTE

        for (i = 0; i < 10; i++) {//lendo os valores do vetor e armazenando no vetor 
            System.out.println("Digite o " + (i + 1) + "º número: ");// pedindo os valores
            vetor[i] = input.nextInt(); //  armazenando os valores
        }

        //AGORA VAMOS ORDENAR O VETOR COM O ALGORITMO DE INSERÇÃO

        for (i = 1; i < 10; i++) { // percorrendo o vetor e ordenando os valores 
            aux = vetor[i]; // auxiliar recebe o valor do vetor na posição i
            j = i - 1; // j recebe o valor de i - 1 (decremento da posição) 
            while ((j >= 0) && (aux < vetor[j])) { // enquanto j for maior ou igual a 0 e aux for menor que o valor do vetor na posição j 
                vetor[j + 1] = vetor[j]; // vetor na posição j + 1 recebe o valor do vetor na posição j 
                j--; // decremento de j 
            }
            vetor[j + 1] = aux; // vetor na posição j + 1 recebe o valor de aux 
        }
        //fim do 'for' de ordenação do vetor por inserção 

        //Agora vamos imprimir o vetor ordenado
        System.out.println("Vetor ordenado: "); 
        for (i = 0; i < 10; i++) { //percorrendo o vetor e imprimindo os valores ordenados
            System.out.println(vetor[i]);
        }
    }
}
