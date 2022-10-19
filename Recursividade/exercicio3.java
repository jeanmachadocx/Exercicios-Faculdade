// Escreva uma func¸ao recursiva que calcule a soma dos primeiros n cubos:
import java.util.*;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        System.out.println("Digite um número");
        n = sc.nextInt();
       System.out.println(soma(n));

    }
    public static double soma(int n){
        int i;
        if( n==0){
            return 0;
        }else{
            return (soma(n-1) +(Math.pow(n, 3)));
        }
    }
}
