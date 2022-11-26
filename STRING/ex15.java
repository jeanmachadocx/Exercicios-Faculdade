// Escreva um programa para converter uma cadeia de caracteres de letras 
//maiusculas em letras minusculas.
import java.util.*;
public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palvra: ");
        palavra = sc.next();
        palavra.toUpperCase();
        System.out.println(palavra.toLowerCase());
        sc.close();
    }
}
