// 2. Crie um programa que calcula o comprimento de uma string 
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A;
        System.out.println("Digite uma STRING:");
        A = sc.next();
        System.out.println("Tamanho da STRING: " + A.length());        
        sc.close();
    }
}
