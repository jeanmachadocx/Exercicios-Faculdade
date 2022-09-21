// Fac¸a um programa que leia um numero inteiro positivo N e imprima todos os n ´ umeros naturais de 0 ate ´
//N em ordem crescente.
import java.util.*;
public class lista11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n, i=0;
        System.out.println("Digite um número");
        n = sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println(i);
        }
        System.out.println("Numero digitado: " + n);
       sc.close();
    }
}
