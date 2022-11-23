// 7. Crie um programa que compara duas strings.

import java.util.*;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String a,b;
         System.out.println("Digite a primeira palavra: ");
         a = sc.next();
         System.out.println("Digite mais uma palavra: ");
         b =sc.next();
         if(a.equalsIgnoreCase(b)){
            System.out.println("A palavra: " + a + " é igual a palavra: " + b);
         }else{
            System.out.println(" As palavras são diferentes! ");
         }
        sc.close();
    }
}
