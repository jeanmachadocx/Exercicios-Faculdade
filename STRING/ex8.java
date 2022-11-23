// 8. Fac¸a um programa que conte o numero de 1ß que aparecem em um string. Exemplo: ”0011001¿ 3 ´

import java.util.*;
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, s;
        int cont=0;
        System.out.println(" Contar quantas vezes um dado caractere aparece na string. Esse caractere desse ser informado pelo usuario ");
        System.out.println();
        System.out.println(" Escreva a sequencia: ");
        a = sc.next();
        char[] charArray = new char[a.length()];
        a.getChars(0, a.length(), charArray, 0);
        System.out.println(" Qual número quer verificar? ");
        s = sc.next();
        for( int i =0; i<a.length(); i++){
            if(charArray[i]== '1'){
                cont++;
            }
        }
        System.out.println(charArray);
        System.out.println("O número " + s + " aparece " + cont + " vezes");
        sc.close();
    }
}
