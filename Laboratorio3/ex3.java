// Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das componentes ´
// deste vetor, armazenando o resultado em outro vetor. Os conjuntos tˆem 10 elementos cada. Imprimir
// todos os conjuntos.

import java.util.*;
public class ex3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float []vetA = new float [10];
    float []vetB= new float [10];
        for(int i=0; i<10;i++){
            System.out.println("Preencha o vetor: ");
            vetA[i] = sc.nextFloat();
        }
        System.out.println();

        for(int i=0; i<10;i++){
         vetB[i] = vetA[i] *   vetA[i];
         System.out.println(vetB[i]);  
        }
        sc.close();
    }
}
