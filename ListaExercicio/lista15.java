// Escreva um programa que leia as coordenadas x e y de pontos no R2 e calcule sua distancia da origem
// (0, 0)
package listaExercicio;
import java.util.*;
public class lista15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1,y2;
        double parte1, parte2, distancia;
        System.out.println("Digite o valor de X1: ");
        x1 = sc.nextInt();
        System.out.println("Digite o valor de X2:");
        x2= sc.nextInt();
        System.out.println("Digite o valor de Y1:");
        y1 = sc.nextInt();
        System.out.println("Digite o valor de Y2:");
        y2 = sc.nextInt();
        parte1 = Math.pow(x1 - x2, 2);
        parte2 = Math.pow(y1 - y2, 2);
        distancia = Math.sqrt(parte1 + parte2);
        System.out.println("Distância: " + distancia);
        sc.close();
    }
}
