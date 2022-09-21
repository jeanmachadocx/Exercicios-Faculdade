// Fac ̧a um programa que leia um n ́umero inteiro positivo  ́ımpar N e imprima todos os n ́umeros  ́ımpares de
// 1 ate N em ordem decrescente.
import java.util.*;
public class lista16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um número");
        num = sc.nextInt();
        if(num %2!=0){
            do {
                num-=2;
                System.out.println(num);
            } while (num >1);
        }else{
            System.out.println("Informe um número ÍMPAR!");
        }
        sc.close();
    }
}
