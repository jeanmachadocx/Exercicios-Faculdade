// 12. Fac¸a um programa que receba uma palavra e calcule quantas vogais (a, e, i, o, u) possui essa palavra.
// Entre com um caractere (vogal ou consoante) e substitua todas as vogais da palavra dada por esse
// caractere

import java.util.*;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vow = 0;

        String ref = "aeiouAEIOU";
        String str, modifica;
        System.out.println("Digite a palavra: ");
        str = sc.next();
        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= 'A'
                    && str.charAt(i) <= 'Z')
                    || (str.charAt(i) >= 'a'
                            && str.charAt(i) <= 'z')) {
                if (ref.indexOf(str.charAt(i)) != -1)
                    vow++;
            }
        }
        System.out.println("A palavra: " + str + " possui: " + vow );

        System.out.println("\n Deseja substituir as vogais de: " + str + " por qual letra?");
        modifica = sc.next();
        str.replaceAll(ref, modifica);
        System.out.println(str);

        sc.close();

    }
}
