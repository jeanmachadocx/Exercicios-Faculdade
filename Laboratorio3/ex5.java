// Leia um vetor de 10 posic¸oes. Contar e escrever quantos valores pares ele possui
import java.util.*;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[10]; int contador=0;
        for(int i=0; i<10; i++){
            System.out.println("Preencha o vetor: ");
            vet[i] = sc.nextInt();   
        }
        for(int i=0;i<10;i++){
            if(vet[i]%2==0){
            contador=contador+1;
            }
        }
        System.out.println("O total de número pares é: " + contador);
    }
}

