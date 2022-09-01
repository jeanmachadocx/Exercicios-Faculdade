//2. Faca um programa que leia um n ́umero real e o imprima.

package listaExercicio;
import java.util.*;
public class lista2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numReal;
    System.out.println("Digite um número: ");
    numReal = sc.nextDouble();
    System.out.println("O número digitado foi: " + numReal);
    sc.close();
}    
}
