// 12. Fac ̧a um programa que leia um n ́umero inteiro positivo N e imprima todos os n ́umeros naturais de 0 ate
// N em ordem decrescente.
import java.util.*;
public class lista12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n, i=0;
          System.out.println("Digite um número");
          n = sc.nextInt();
          i= n;
          while(i>0){
              System.out.println(i);
              i--;
          }
          System.out.println("Numero digitado: " + n);
          sc.close();
      }
}
