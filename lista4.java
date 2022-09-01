package listaExercicio;
import java.util.*;
public class lista4{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     float num, quintaParte;
     System.out.println("Digite um número");
     num = sc.nextFloat();
     quintaParte = num /5;
     System.out.println("A quinta parte de " + num + " é: " + quintaParte );
     sc.close();   
    }
}
