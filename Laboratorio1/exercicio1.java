// Fac ̧a uma func ̧ ̃ao que receba dois n ́umeros inteiros positivos por parˆametro e retorne a soma dos N
// n ́umeros inteiros existentes entre eles.
import java.util.*;
public class exercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, resultado;
        System.out.println("Valor de X: ");
        x = sc.nextInt();
        System.out.println("Valor de Y: ");
        y = sc.nextInt();
        resultado = soma(x,y);
        System.out.println(resultado);
    }
    public static int soma(int x, int y){
        int resultado=0;
        for (int i = 1; i <=y ; i++){
            resultado = resultado +i;
            System.out.println(i);
            
            System.out.println(resultado);
        }
        return resultado;
    }
}