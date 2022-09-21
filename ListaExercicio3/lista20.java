// Ler uma sequencia de n ́umeros inteiros e determinar se eles s ̃ao pares ou n ̃ao. Dever a ser informado o
// n ́umero de dados lidos e n ́umero de valores pares. O processo termina quando for digitado o n ́umero
// 1000.

import java.util.Scanner;
public class lista20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd_digitados=0, qtd_pares=0, num;
        System.out.println("Digite um número:");   
        num = sc.nextInt();
        while(num != 1000){
          if(num %2==0){
            qtd_pares++;
          }  
          qtd_digitados++;
        }
        System.out.println("Quantidade digitada: " +qtd_digitados );
        System.out.println("Quantidade par: " + qtd_pares);
        sc.close();
    }
}
