// Altere o programa anterior para calcular e apresentar a m ́edia dos valores entrados e aqueles sendo
// maiores e menores que a m ́edi
import java.util.*;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[5];
        int i, soma=0; float media;
        for(i=0; i<5; i++){
            System.out.println("Qual o valor? ");
            vet[i] = sc.nextInt();
            soma = soma + vet[i];
        }
        media = soma/5;
        System.out.println("A média é: " + media);
       
        for(i=0; i<5; i++){
        if(vet[i]>media){
            System.out.println(" Os números " + i + " é maior que a média");
        }else{
            System.out.println("Os números " + i + " é menor que a média" );
        }
        }
        sc.close();
    }
}
