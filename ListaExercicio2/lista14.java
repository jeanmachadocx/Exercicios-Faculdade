// 14. Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mˆes correspondente a
// este numero. Isto ´e, janeiro se 1, fevereiro se 2, e assim por diante

import java.util.*;
public class lista14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Informe o número do mês:");
        num= sc.nextInt();
       if((num >12)||(num <1)){
        System.out.println("Opção inválida");
       }
            switch(num){
                case 1:
                System.out.println("Janeiro");
                break;
            } switch(num){
                case 2:
                System.out.println("Fevereiro");
                break;
            } switch(num){
                case 3:
                System.out.println("Março");
                break;
            } switch(num){
                case 4:
                System.out.println("Abril");
                break;
            } switch(num){
                case 5:
                System.out.println("Maio");
                break;
            } switch(num){
                case 6:
                System.out.println("Junho");
                break;
            } switch(num){
                case 7:
                System.out.println("Julho");
                break;
            } switch(num){
                case 8:
                System.out.println("Agosto");
                break;
            } switch(num){
                case 9:
                System.out.println("Setembro");
                break;
            } switch(num){
                case 10:
                System.out.println("Outubro");
                break;
            } switch(num){
                case 11:
                System.out.println("Novembro");
                break;
            } switch(num){
                case 12:
                System.out.println("Dezembro");
                 break;
        
            }
        
        sc.close();
    }
}
