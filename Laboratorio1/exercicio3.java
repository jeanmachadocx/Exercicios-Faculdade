import java.util.Scanner;

public class exercicio3 {
    public static int calcula(int n){
    int fatorial=1;
       for( int i = 1; i <= n; i++ )
       {
       fatorial *= i;
       }
       return fatorial;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n, fatorial;
        System.out.println("Digite um número que queira calcular: ");
        n = sc.nextInt();
        fatorial = calcula(n);
        System.out.println(fatorial);
    }
}

