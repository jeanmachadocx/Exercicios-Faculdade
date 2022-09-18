//1. Faca um programa que receba dois numeros e mostre qual deles  ́e o maior

import java.util.*;
public class lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        System.out.println("Informe dois números: ");
        x = sc.nextFloat();
        y= sc.nextFloat();
        if(x > y){
            System.out.println("O número " + x + " é maior que: " +y);
        }else if(y > x){
            System.out.println("O número " + y + " é maior que: " + x);
        } else{
            System.out.println("Os números " + x + " e " + y + "são iguais");
        }
        sc.close();
    }
}
