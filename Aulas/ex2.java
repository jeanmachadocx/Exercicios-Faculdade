// Escreva um programa Java que mantenha um número do usuário
//  e gere um inteiro entre 1 e 7 e exiba o nome do dia da semana.
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.println("Digite um número: ");
        dia = sc.nextInt();
        if(dia <= 0 || dia > 7 ){
            System.out.print("Insira um número entre: 1 e 7 ");
        }
        switch(dia){
            case 1:
                 System.out.println(" Domingo");
                break;
            case 2: 
                System.out.println(" Segunda-feira");
                break;
            case 3: 
                System.out.println("Terça-feira");
                break;   
            case 4: 
                System.out.println("Quarta-feira");
                break;   
            case 5: 
                System.out.println("Quinta-feira");
                break;   
            case 6: 
                System.out.println("Sexta-Feira");
                break;   
            case 7: 
                System.out.println("Sábado");
                break;   
                }
            sc.close();     
    }
}
