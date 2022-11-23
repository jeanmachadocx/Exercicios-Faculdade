// 1. Faca um programa que entao leia uma string e a imprima. 

import java.util.*;
public class ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A;
        System.out.println("Digite uma STRING:");
        A = sc.next();
        System.out.println(" Foi digitado: " + A);
        sc.close();
    }
}