// Fac ̧a um programa que leia um n ́umero inteiro positivo  ́ımpar N e imprima todos os n ́umeros  ́ımpares de
// 1 ate N em ordem crescente.
import java.util.Scanner;
public class lista15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i=0;
        System.out.println("Digite um número");
        num = sc.nextInt();
            do {
                if((num%2!=0)&&(num>0)){  
                System.out.println(i);
                i++;
            }else{
                System.out.println("Digite um número Par");    
                break;
            }
                
            } while (i<=num);
            
        
        sc.close();
    }
}

