// . Fac¸a uma func¸ao recursiva que calcule o valor da s ˜ ´erie S descrita a seguir para um valor n > 0 a ser
// fornecido como parametro para a mesma. ˆ
import java.util.*;
public class exercicio3 {
   
public static double termo(int n){
    if(n>0){
        // soma = (1+(n*n))/2;
        return (1+(n *n))/2 +  termo(n-1);
    }else{
        return 0;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; double soma=0;
        System.out.println("Defina um valor para N");
        n = sc.nextInt();
        System.out.println(termo(n));
        sc.close();
    }
}
