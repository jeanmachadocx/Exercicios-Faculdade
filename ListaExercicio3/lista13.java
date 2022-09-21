// Fac ̧a um programa que leia um n ́umero inteiro positivo par N e imprima todos os n ́umeros pares de 0 ate
// N em ordem crescente.
import java.util.Scanner;
public class lista13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, num;
        System.out.println("Digite um valor: ");
        num = sc.nextInt();    
           while(i <=num){
            if(num %2==0){
                System.out.println(i);
                i+=2;
            } else{
                System.out.println("Digite um número PAR!");
                break;
            }
           }
        sc.close();
    }
}

