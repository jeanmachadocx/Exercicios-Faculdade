// Fac¸a uma func¸ao recursiva que receba um n ˜ umero inteiro positivo par N e imprima todos os n ´ umeros ´
// pares de 0 at´e N em ordem crescente.
import java.util.*;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y=0;
        System.out.println("Informe o número: ");
        n = sc.nextInt();
        System.out.println(imprimPares(n,y));
        sc.close();
    }
    static int imprimPares(int n, int y){
        if( n > 0){
            while(y <= n){
            System.out.println(y);
            y+=2;
            }
            return imprimPares(n-1, y+2);
        } else{
            return 0;
        }
    }



}
