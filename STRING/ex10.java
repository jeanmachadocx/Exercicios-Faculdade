// Fac¸a um programa que receba uma palavra e a imprima de tras para frente.
import java.util.*;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra: ");
        palavra = sc.next();
        char [] charArray = new char[palavra.length()];
        palavra.getChars(0, palavra.length(), charArray, 0);
        System.out.println(palavra + " ao contrário: " );
        for(int i =palavra.length()-1; i >=0; i--){
            
            System.out.print(charArray[i]);
        }

        sc.close();
    }
}
