// . Crie uma funcao recursiva que receba dois inteiros positivos k e n e calcule  k^n
import java.util.*;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,n;    
        System.out.println("Digite a base: ");
        k = sc.nextInt();
        System.out.println("Digite o expoente: ");
        n = sc.nextInt();
        System.out.println(calcula(k, n));
        sc.close();
    }
    public static int calcula(int k, int n){
        if(k ==0){
           return 1;
        }else{
           return k * calcula(k, n-1);
        }
    }
    
}
