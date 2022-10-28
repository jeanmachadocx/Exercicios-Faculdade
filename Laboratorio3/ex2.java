// Crie um programa que lˆe 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int vetA[] = new int[6];
        int i=0;
        for( i =0; i<6; i++){
            System.out.println("Valores do vetor: ");
            vetA[i] = sc.nextInt();
        }
        System.out.println("");
        for( i =0; i<6; i++){
            System.out.println("Valores digitados: " + vetA[i]);
        }
        sc.close();
    }
}
