//1. Faca um programa que leia um n ́umero inteiro e o imprima.

package listaExercicio;
import java.util.*;
public class lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um número");
        num = sc.nextInt();
        System.out.println("O número digitado foi " + num);
        sc.close();
    }
}
