package unitins;

import java.util.Arrays;

public class Quicksort {
    public static void quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quicksort(arr, left, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 6, 4, 8, 7, 1};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
/*
 * 
 Este código é uma implementação em Java do algoritmo Quicksort, um algoritmo de ordenação que usa divisão e conquista (recursão).

 A função quicksort é a função principal do algoritmo. Ela recebe como entrada um array de inteiros arr, o índice left do primeiro
 elemento do array a ser ordenado e o índice right do último elemento do array a ser ordenado. A condição if (left < right) é verificada
 para garantir que ainda haja elementos a serem ordenados na sublista atual. Caso contrário, a recursão termina.

 A função partition é usada para escolher um pivô, reorganizar o array de modo que os elementos menores que o pivô estejam à esquerda
 dele e os elementos maiores estejam à direita, e retornar o índice do pivô. O pivô é escolhido como o elemento mais à direita (int pivot = arr[right]).
 A variável i é inicializada como left - 1 para que o primeiro elemento a ser trocado seja o primeiro elemento do array. O loop for percorre a sublista do
 índice left até right - 1. Se um elemento for menor que o pivô, ele é trocado com o elemento imediatamente à direita de i (a posição j) e i é incrementado.
 Após o loop, o pivô é colocado na posição correta na lista (a posição i + 1) e o índice do pivô é retornado.

 Na função quicksort, o array é particionado em torno do pivô retornado por partition. Em seguida, as duas sub-listas resultantes são
 ordenadas recursivamente, usando a função quicksort.

 Na função main, um array de inteiros é criado e ordenado usando o método quicksort. O resultado é impresso na saída padrão usando o 
 método Arrays.toString(). O resultado do programa é a lista ordenada [1, 2, 3, 4, 5, 6, 7, 8, 9].
 */
