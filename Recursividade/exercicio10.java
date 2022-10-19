// Fac¸a uma func¸ao recursiva que receba um n ˜ umero inteiro positivo par N e imprima todos os n ´ umeros ´
// pares de 0 at´e N em ordem decrescente.
import java.util.*;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y=0;
        System.out.println("Informe o número: ");
        n = sc.nextInt();
        System.out.println(imprime(n,y));
        sc.close();
    }
    public static int imprime(int n, int y){
        if(n ==0){
        return 0;
        }else{
            System.out.println(n);
            return imprime(n-2, y++);
        }
    }
}
