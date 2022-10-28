// 7. Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima o vetor, o maior ´
// elemento e a posic¸ao que ele se encontra.
import java.util.*;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [10];  int maior=0; 
        int i=0;
        for( i=0; i<vet.length; i++){
            System.out.println("Preencha os valores: ");
            vet[i] = sc.nextInt();
        }
        for( i=0;i<10;i++){
            if(vet[i] > maior){
                maior= vet[i];
                    if (vet[i]==maior)
                        System.out.println("O maior elemento é " + maior + " na posição " + i);
                }
         }
         sc.close();
}
}