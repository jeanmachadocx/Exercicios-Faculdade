//Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
package listaExercicio;
import java.util.*;
public class lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        celsius =  ((fahrenheit - 32) * 5/9);
        System.out.println("A temperatura em Celsius  é : " + celsius);
        sc.close();
    }
}
