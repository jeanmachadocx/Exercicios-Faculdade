// 17. Fac ̧a um programa que leia um n ́umero inteiro positivo n e calcule a soma dos n primeiros n ́umeros
// naturais.
import java.util.*;
public class lista17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma=0, i=1,num; 
         
        System.out.println("Digite um número");
        num = sc.nextInt();
       if(num >0){ 
            while(i<=num){
            soma = soma+i;
            i++;
        }
         }else{
        System.out.println(" Digite um valor positivo!");
    }
        System.out.println("A soma é: " + soma);
        sc.close();
    }
}
