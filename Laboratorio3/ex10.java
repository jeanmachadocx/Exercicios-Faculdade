// 10. Fac¸a um programa que preencha um vetor com 10 numeros reais, calcule e mostre a quantidade de ´
// numeros negativos e a soma dos n ´ umeros positivos desse vetor. 
import java.util.*;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] vet = new float[10]; int i=0;
        float soma=0; int negativo=0; 
        for( i =0; i<vet.length; i++){
            System.out.println("Valores: ");
            vet[i] = sc.nextFloat();
        }
        for( i =0; i<vet.length; i++){
            if(vet[i] < 0){
                negativo++;
            } if(vet[i] > 0 ){
                soma = soma + vet[i];
            }
        }
        System.out.println("Soma dos números positivos" + soma);
        System.out.println("Quantidade de números negativos: " + negativo);
        sc.close();
    }
}
