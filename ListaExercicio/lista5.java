//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit
// Formula = F = C * (9.0/5.0)+32.0
package listaExercicio;
import java.util.*;
public class lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius, fahrenheit;
        System.out.println("Informe a temperatura em graus Celsius: ");
        celsius = sc.nextFloat();
        fahrenheit = celsius * 9 /5 + 32;
        System.out.println("A temperatura em Fahrenheit  é : " + fahrenheit);
        sc.close();
    }
}
