// 18. Fac¸a um programa que leia o valor de um produto e imprima o valor com desconto, tendo em vista que
// o desconto foi de 12%.

package listaExercicio;
import java.util.*;
public class lista18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, desconto, valorFinal;
        System.out.println("Qual o valor do produto? ");
        valor = sc.nextFloat();
        desconto = (valor * 12)/100;
        valorFinal = valor - desconto;
        System.out.println("O valor do produto com 12% de desconto é: " +valorFinal);
        sc.close();
    }
}