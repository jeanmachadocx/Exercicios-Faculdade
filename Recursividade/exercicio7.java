// Fac¸a uma func¸ao recursiva que receba um n ˜ umero inteiro positivo N e imprima todos os n ´ umeros naturais ´
// de 0 at´e N em ordem crescente.
import java.util.*;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y=1;
        System.out.println("Informe o número: ");
        n = sc.nextInt();
        System.out.println(imprime(n,y));
        sc.close();
    }
    public static int imprime(int n, int y){
       if(n > 0){
         System.out.println(y++);
            return imprime(n-1, y);
        }else{ 
            return 0;
            }
        }
    }

