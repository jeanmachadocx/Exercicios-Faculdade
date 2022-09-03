// Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido proporcionalmente ao
// valor que cada deu para a realizacao da aposta. Faca um programa que leia quanto cada apostador
// investiu, o valor do premio, e imprima quanto cada um ganharia do premio com base no valor investido.
package listaExercicio;
import java.util.*;
public class lista16 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double primeiroParticipante,segundoParticipante, terceiroParticipante, premio;
        double recebe1, recebe2, recebe3;
        System.out.println("Informe o valor do prêmio");
        premio = sc.nextDouble();
        System.out.println("Porcentagem de investimento do primeiro participante: ");
        primeiroParticipante = sc.nextDouble();
        System.out.println("Porcentagem de investimento do segundo participante: ");
        segundoParticipante = sc.nextDouble();
        System.out.println("Porcentagem de investimento do terceiro participante: ");
        terceiroParticipante = sc.nextDouble();
        recebe1 = premio * primeiroParticipante /100;
        recebe2 = premio * segundoParticipante /100;
        recebe3 = premio * terceiroParticipante /100;
        System.out.println("O primeiro particpante receberá: " + recebe1);
        System.out.println("O segundo particpante receberá: " + recebe2);
        System.out.println("O terceiro particpante receberá: " + recebe3);
        sc.close();
    }
}
