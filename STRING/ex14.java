
// Fac ̧a um programa que leia uma palavra (m ́aximo de 50 letras) e some 1 no valor ASCII de cada caractere
// da palavra. Imprima a string resultante.
import java.util.*;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra: ");
        palavra = sc.next();
        char[] charArray = new char[50];
        palavra.getChars(0, palavra.length(), charArray, 0);
        for (int i = 0; i < palavra.length(); i++) {
            charArray[i]++;
        }
        System.out.println(charArray);
        sc.close();
    }
}
