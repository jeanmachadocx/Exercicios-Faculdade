// Fac ̧a uma func ̧ ̃ao que receba por parˆametro dois valores X e Z. Calcule e retorne o resultado de X*Z para
// o programa principal. Atenc ̧ ̃ao n ̃ao utilize nenhuma func ̧ ̃ao pronta de exponenciac ̧ ̃
import java.util.*;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, z, resultado;
        System.out.println("Valor para X");
        x = sc.nextInt();
        System.out.println("Valor para Z");
        z = sc.nextInt();
        resultado = valorFinal(x, z);
        System.out.println(resultado);
    }
    public static int valorFinal(int x, int z){
       int resultado=0;
        resultado = x * z;
        return resultado;
    }
}
