// Faca um programa que leia um numero inteiro positivo de tr ´ ˆes d´ıgitos (de 100 a 999). Gere outro numero ´
// formado pelos dıgitos invertidos do numero lido. Exemplo: n ´ umeroLido = 123, n ´ umeroGerado = 321.
package listaExercicio;
import java.util.*;
public class lista12 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a, b, c;
        System.out.println(" Digite um número: ");
        a = sc.nextInt();
        System.out.println(" Digite mais um valor: ");
        b = sc.nextInt();
        System.out.println(" Mais um valor: ");
        c = sc.nextInt();
        System.out.println(c + ""+b + ""+ "" + a);
     sc.close();
    }
}
