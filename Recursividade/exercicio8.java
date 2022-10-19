// 8. Fac¸a uma func¸ao recursiva que receba um n ˜ umero inteiro positivo N e imprima todos os n ´ umeros naturais ´
// de 0 at´e N em ordem decrescente.
import java.util.*;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Informe o número: ");
        n = sc.nextInt();
        System.out.println(imprime(n));

        sc.close();
    }
    static int imprime(int n){
       if(n > 0){
         System.out.println(n-1);
            return imprime(n-1);
           
        }else{ 
            return 0;
            }
          
        }
}
