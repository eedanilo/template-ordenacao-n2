public class InsertionSort implements SortingStrategy {

    /**
    * O array  está ordenado exceto pelo último elemento. Esse método
    * deve colocar o último elemento em sua posição.
    * Importante: seu algoritmo deve ser O(n).
    */
    public void insereUltimoOrdenado(int[] v) {
        int i;
        int ultimo = v[v.length - 1];
        for (i = v.length - 2; i >= 0 && v[i] > ultimo; i--) {
            v[i + 1] = v[i];
        }
        v[i + 1] = ultimo;
    }
   
    /**
    * O array  está ordenado exceto pelo primeiro elemento. Esse método
    * deve colocar o primeiro elemento em sua posição. Ao final da execução,
    * v deve estar ordenado.
    * Importante: seu algoritmo deve ser O(n);
    */
    public void inserePrimeiroOrdenado(int[] v) {
        int i;
        int primeiro = v[0];
        for (i = 1; i < v.length && v[i] < primeiro; i++) {
            v[i-1] = v[i];
        }
        v[i - 1] = primeiro;
    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort.
    */
    public void sort(int[] v) {
        for (int i = 0; i < v.length; i++){
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;

        }
    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort de maneira recursiva.
    * Pense que insertion sort são várias execuções da inserção ordenada e use
    * essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método, mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */
    public void sortRecursivo(int[] v) {
        sortRec(v, v.length);
    }  
    private void sortRec(int[] v, int n) {
        if (n <= 1) {
            return;
        }
        sortRec(v, n - 1);
        int chave = v[n - 1];
        int j = n - 2;
        while (j >= 0 && v[j] > chave) {
            v[j + 1] = v[j];
            j--;
        }
        v[j + 1] = chave;
    }
}
