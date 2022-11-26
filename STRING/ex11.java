// 11. Fac¸a um programa que receba do usuario uma string. O programa imprime a string sem suas vogais. ´
import java.util.*;
public class ex11 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a;
    System.out.println("Insira a palavra: ");
    a = sc.nextLine();
    a = a.replaceAll("a","");
    a = a.replaceAll("e", "");
    a = a.replaceAll("i", "");
    a = a.replaceAll("o", "");
    a = a.replaceAll("u", "");
    System.out.println(a);
    sc.close();
 }   
}
