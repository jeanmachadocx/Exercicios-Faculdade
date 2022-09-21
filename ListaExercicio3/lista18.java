// Escreva um algoritmo que leia certa quantidade de numeros e imprima o maior deles e quantas vezes o
// maior numero foi lido. A quantidade de numeros a serem lidos deve ser fornecida pelo usuario.
import java.util.*;
public class lista18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lido, maior=0, numero,i=0;
        System.out.println("Quantos números serão lidos? ");
        lido = sc.nextInt();
        System.out.println("Digite o primeiro número: ");
        numero = sc.nextInt();
        maior = numero;
        while(i<lido){
            System.out.println("Digite um número:");
            numero = sc.nextInt();
            if(maior < numero){
                maior = numero;
                i++;
            }if(maior == numero){
                i++;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
        sc.close();
    }
}
