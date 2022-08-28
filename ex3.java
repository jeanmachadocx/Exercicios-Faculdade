//Escreva um programa em Java para exibir a tabuada de multiplicação de um dado inteiro. 

import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num,j;
        System.out.println("Digite um número que queira calcular: ");
        num = sc.nextInt();
        System.out.println("Quantas vezes: ");
        j = sc.nextInt();
        for(j=0; j<num; j++){
            System.out.println(num + " X " + j + " = " + num*j);
        }
    sc.close(); 
    }
}
