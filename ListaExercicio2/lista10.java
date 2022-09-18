// 10. Fac¸a um programa que leia trˆes numeros inteiros positivos e efetue o c ´ alculo de uma das seguintes ´
// medias de acordo com um valor num´erico digitado pelo usuario: ´
// (a) Geom´etrica
// (b) Ponderada:
// (c) Harmonica: 
// (d) Aritm´etica: x+y+z

import java.util.*;
public class lista10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double geometrica, ponderada, harmonica, aritmetica;
        double x,y,z,produto, expoente;
        int num;
        System.out.println("Defina um valor para: X, Y, Z:");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        System.out.println("Escolha uma operação: 1 - Geometrica, 2 - Ponderada, 3 - Harmonica, 4 - Aritmética.");
        num = sc.nextInt();
        switch (num){
            case 1:
            expoente = 1 /3;
            produto = x * y * z;
            geometrica = Math.pow(produto,expoente);
            System.out.println("A média geométrica é: " + geometrica);
            break;
        } 
        switch(num){
            case 2:
            ponderada = ((x+2)*(y+3)*z)/6;
            System.out.println("A média ponderada é: " + ponderada);
            break;
        }
        switch(num){
            case 3:
            harmonica = 3 / (1/x)+(1/y)+(1/z);
            System.out.println("A média harmonica é: " + harmonica);
            break;
        }
        switch(num){
            case 4:
            aritmetica = (x+y+z)/3;
            System.out.println("A média aritmética é: " + aritmetica);
            break;
            
            default:
            System.out.println("Opção inválida");
        }

        sc.close();
    }
    
}
