// Faca um programa que leia 5 valores inteiros, armazeno-os em um vetor, calcule e apresente a soma
// destes valores.
import java.util.*;
public class exercicio1{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int soma =0;
   int []vet = new int[5];
    for(int i=0; i<vet.length; i++){
        System.out.println("Digite o valor: ");
        vet[i] = sc.nextInt();
        soma = soma + vet[i];
    }
   System.out.println("A soma é: " + soma);

   sc.close();
} 

}