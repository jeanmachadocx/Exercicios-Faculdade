// Fac¸a um programa para ler as dimensoes de um terreno (comprimento ˜ c e largura l), bem como o prec¸o
// do metro de tela p. Imprima o custo para cercar este mesmo terreno com tela.
package listaExercicio;
import java.util.*;
public class lista17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float comprimento, largura, preco, total, area;
        System.out.println("Informe a largura do terreno: ");
        largura = sc.nextFloat();
        System.out.println("Qual o comprimento?");
        comprimento = sc.nextFloat();
        System.out.println("Valor do metro da tela: ");
        preco = sc.nextFloat();
        area = 2*(largura + comprimento);
        total = preco * area;
        System.out.println("O valor total da tela é R$ " + total + " reais");
        sc.close();
    }
}
