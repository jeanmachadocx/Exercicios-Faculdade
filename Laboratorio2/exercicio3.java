// Fac ̧a um programa que leia 10 valores reais e os apresente na ordem inversa entrada.
import java.util.*;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetA = new int[10];
        for(int i=0; i<vetA.length; i++){
            System.out.println("Qual o valor? ");
            vetA[i] = sc.nextInt();
        }
        System.out.println("Os valores na ordem inversa: ");
        for(int i=0; i<10; i++){
            System.out.println(vetA[9-i]);
        }

        sc.close();
    }
}
