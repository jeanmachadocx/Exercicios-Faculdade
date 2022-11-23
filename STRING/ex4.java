// 4. Fac¸a um programa que leia um nome e imprima as 4 primeiras letras do nome.

import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite um nome: ");
        nome = sc.next();
        char[] charArray = new char[4];
        nome.getChars(0, 4, charArray, 0);
        for(char caracter : charArray){
        System.out.print(caracter);
        }
        sc.close();
    }
}
