// // Escreva um programa que substitui as ocorrˆencias de um caractere ”0¨em uma string por "1"

import java.util.*;
public class ex9 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Escreve um sequência de números");
        a = sc.nextLine();
        char[] charArray = new char[a.length()];
        a.getChars(0, a.length(), charArray, 0);

        for (int i=0; i<a.length(); i++){
            if(charArray[i] == '0'){
                charArray[i] = '1';
            }
        }
        System.out.println(charArray);
        sc.close();
    }
 }
