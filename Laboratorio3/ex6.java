// . Fac¸a um programa que receba do usuario um vetor com 10 posi ´ c¸oes. Em seguida dever ˜ a ser impresso o ´
// maior e o menor elemento do vetor.
import java.util.*;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [10]; int menor=0; int maior=0;
        for(int i=0; i<vet.length; i++){
            System.out.println("Preencha os valores: ");
            vet[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(vet[i] > maior){
                maior= vet[i];
                }
                if(menor < vet[i]){
                    menor=vet[i];
                }
        }
        System.out.printf("O maior número digitado foi " + maior + " e o menor foi " + menor);
        sc.close();
    }
}
