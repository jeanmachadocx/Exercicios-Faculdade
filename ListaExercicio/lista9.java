// Uma empresa contrata um encanador a R$ 30, 00 por dia. Fac¸a um programa que solicite o numero de ´
// dias trabalhados pelo encanador e imprima a quantia l´ıquida que devera ser paga, sabendo-se que s ´ ao˜
// descontados 8% para imposto de renda.

package listaExercicio;
import java.util.*;
public class lista9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, quantidadeDias, desconto;
        System.out.println("Quantidade de dias trabalhados: ");
        quantidadeDias = sc.nextInt();
        dia = quantidadeDias * 30;
        desconto = dia * 8 /100;
        System.out.println("O seu pagamento final é: " + desconto);
        sc.close();
    }
}
