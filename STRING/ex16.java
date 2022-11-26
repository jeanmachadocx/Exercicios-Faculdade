// Leia uma cadeia de caracteres e converta todos os caracteres para mai ́uscula. Dica: subtraia 32 dos
// caracteres cujo c  ́odigo ASCII est ́a entre 97 e 122
import java.util.*;
public class ex16 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String palavra;
    System.out.println("Digite uma palvra: ");
    palavra = sc.next();
    palavra.toLowerCase();
    System.out.println(palavra.toUpperCase());
    sc.close();
   }
}
