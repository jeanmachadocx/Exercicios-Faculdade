// 7. Leia um angulo em graus e apresente-o convertido em radianos. 
//A f ́ormula de conversao  ́e: R = G * π/180,
// sendo G o ˆangulo em graus e R em radianos e π = 3.14.

package listaExercicio;
import java.util.*;
import java.util.Scanner;

public class lista7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double angulo, radiano;
    System.out.println("Digite um ângulo em graus ");
    angulo = sc.nextDouble();
    radiano = ((angulo * 3.18) / 180);
    System.out.println("O ângulo convertido em radiano é: " +  radiano);
    sc.close();
    }
}    

