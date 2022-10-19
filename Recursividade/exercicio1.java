// Crie uma func¸ao recursiva que receba um n ˜ umero inteiro positivo N e calcule o somat ´ orio dos n ´ umeros ´
// de 1 a N.
import java.util.*;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i,soma=0;
        System.out.println("Digite um número que queira calcular: ");
        n = sc.nextInt();
        for(i=0;i<n;i++){
            soma+= i;
        }
      System.out.println(soma(5));
      sc.close();
    }
    public static int soma(int n){
        if(n==1){
            return 1;
        }
        return n + soma(n-1);
    }
}
