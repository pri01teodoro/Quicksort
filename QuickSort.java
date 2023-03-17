
public class QuickSort {

    static void quicksort (int[] vetor, int esquerda, int direita){
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita); //divide o vetor
            quicksort(vetor, esquerda, p); //ordena a esquerda
            quicksort(vetor, p + 1, direita); //ordena a direita
        }
    }

    static int particao (int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita)/2;
        int pivot = vetor[meio];
        int inicio = esquerda - 1;
        int fim = direita + 1;

        while(true) {
            do{
                inicio++;
            }while(vetor[inicio] < pivot);

            do{
                fim--;
            }while(vetor[fim] > pivot);
            if (inicio >= fim){
                return fim;
            }
            int aux = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = aux;
        }
    }

        

    public static void main(String[] args) {
        int[] vetor = new int[100];
    
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
            
        }

        System.out.println("Desordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }

        quicksort(vetor, 0, vetor.length - 1);
        
        System.out.println("\n\nOrdenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println();
        
    }
}



