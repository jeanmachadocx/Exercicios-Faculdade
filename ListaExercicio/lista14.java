//14. Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos.
package listaExercicio;
import java.util.*;
public class lista14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int seg, horas, minutos, segundos, resto;
        System.out.println("Digite o valor de segundos: ");
        seg = sc.nextInt();
        horas = seg / 3600;
        resto = seg % 3600;
        minutos = resto / 60;
        segundos = resto % 60;
        System.out.println(horas+ "h : " + minutos +  "m : " + segundos + "s" );
        sc.close();
    }
}
