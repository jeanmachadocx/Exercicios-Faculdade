// 20. Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre: o total a
// pagar com desconto de 10%; o valor de cada parcela, no parcelamento de 3× sem juros; a comissao do ˜
// vendedor, no caso da venda ser parcelada (5% sobre o valor total).

package listaExercicio;
import java.util.*;
public class lista20 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double valor, desconto, comissao,parcela;
    System.out.println("Informe o valor total: ");
    valor = sc.nextDouble();
    desconto = (valor *0.10);
    parcela = (valor - desconto)/3;
    System.out.println("O valor de cada parcela será: " + parcela +" reais");
    comissao = (valor *0.05) ;
    System.out.println("Valor da comissão do vendedor: " + comissao +" reais");
    sc.close();
   }
}
