// 4. Escreva uma func¸ao para determinar a quantidade de n ˜ umeros primos abaixo N.
import java.util.*;
public class exercicio4 {
    public static  int calculaPrimo(int n){
        int qtd=0; int div;
          for(int i = 1; i <= n; i++) {
              div = 0;
              for(int j = 1; j <= n; j++) {
                  if (i % j == 0) {
                      div++;
                  }
              }
              if (div == 2) {
                  qtd++;
              }
          }
         return qtd;
      }
    public static void main(String []args) {
       Scanner sc = new Scanner(System.in);
        int  resultado;
        System.out.println("Digite um numero:");
        int n = sc.nextInt();
        resultado = calculaPrimo(n);
        System.out.println("Entre 1 e "+ n +" ha "+ resultado +" numeros primos!");
    }
   


}
