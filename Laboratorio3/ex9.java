// 9. Fac¸a um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule e imprima a
// m´edia geral.

import java.util.*;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[15];
        int i=0; int soma=0; int media;
        for( i =0; i<vet.length; i++){
            System.out.println("Digite a nota: ");
            vet[i] = sc.nextInt();
            soma = soma + vet[i];
        }
        media = soma/15;
        System.out.println("A média é: " + media);
    }
}
