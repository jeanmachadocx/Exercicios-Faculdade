// 13. Leia um numero inteiro de 4 d iıgitos (de 1000 a 9999) e imprima 1 dıgito por linha.

package listaExercicio;
import java.util.*;
public class lista13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3, num4;
   System.out.println("Digite um número para a posição 1:");
    num1 = sc.nextInt();
    System.out.println("Digite um número para a posição 2:");
    num2 = sc.nextInt();
    System.out.println("Digite um número para a posição 3:");
    num3 = sc.nextInt();
    System.out.println("Digite um número para a posição 4:");
    num4 = sc.nextInt();
    System.out.println();
    System.out.println(num4);
    System.out.println(num3);
    System.out.println(num2);
    System.out.println(num1);
    sc.close();
}
}
