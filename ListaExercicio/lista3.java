// 3. Pec ̧a ao usu ́ario para digitar tres valores inteiros e imprima a soma deles.
package listaExercicio;
import java.util.*;
public class lista3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float num1, num2, num3, soma;
    System.out.println("Insira três valores: ");
    num1 = sc.nextFloat();
    num2 = sc.nextFloat();
    num3 = sc.nextFloat();
    soma = num1 + num2 + num3;
    System.out.println("A soma de " + num1 + " + " + num2 + " + " + num3 + " é igual a: " + soma );
    sc.close();
   } 
}
