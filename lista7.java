// Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado possui uma taxa
// diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%). Fac¸a um programa em que o
// usuario entre com o valor e o estado destino do produto e o programa retorne o pre ´ c¸o final do produto
// acrescido do imposto do estado em que ele sera vendido. Se o estado digitado nao for v ˜ alido, mostrar ´
// uma mensagem de erro.

import java.util.*;
public class lista7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        String estado;
        System.out.println("Digite o valor do produto: ");
        valor = sc.nextDouble();
        System.out.println("Qual estado será feito a entrega?");
        estado = sc.next(); 
        switch (estado){
            case "MG":
            valor = valor* 0.07;
            System.out.println("O preço final do produto é: " + valor);
            break;
        }
        switch (estado){
            case "SP":
            valor = valor *0.12;
            System.out.println("O preço final do produto é: " + valor);
            break;
        }
        switch(estado){
            case "RJ":
            valor = valor *0.15;
            System.out.println("O preço final do produto é: " + valor);
            break;
        }
        switch(estado){
            case "MS":
            valor = valor * 0.08;
            System.out.println("O preço final do produto é: " + valor);
            break;
        
        default:
        System.out.println("Não realizamos entrega nesse Estado");
        }
        sc.close();
    }
}
