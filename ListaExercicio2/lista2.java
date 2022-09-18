// . Faca um programa que calcule e mostre a area de um trapezio. Sabe-se que: A =
// (basemaior+basemenor)×2

import java.util.*;
public class lista2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float baseMaior, baseMenor, area;
        System.out.println("Digite o valor para a base: ");
        baseMaior = sc.nextFloat();
        System.out.println("Digite mais um valor : ");
        baseMenor = sc.nextFloat();
        if ((baseMaior > 0)&&(baseMenor >0)){
            area = ((baseMaior + baseMenor)*2)/2;
            System.out.println("o valor da área é: " + area);
        } else{
            System.out.println("Os números devem ser maior que 0!");
        }
        sc.close();
    }
}