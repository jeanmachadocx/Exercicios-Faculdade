// Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles, assim como a ´
// diferenc¸a a existente entre ambos.

import java.util.*;
public class lista17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, diferenca;
        System.out.println("Informe dois valores");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
      
        if((num1 >=0)&&(num2 >=0)){
            if(num1 > num2){
                System.out.println("O maior número é: " +num1);
                diferenca = num1 - num2; 
                System.out.println("A diferença entre eles é: " + diferenca);
            }else if(num2 > num1){
                System.out.println("O maior número é: " + num2);
                diferenca = num2 - num1;
                System.out.println("A diferença entre eles é: " + diferenca);
            }else{
                System.out.println("Os números são iguais");
            }
        }
        sc.close();
    }
}
