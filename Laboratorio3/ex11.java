// Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos juntamente com o
// maior, o menor e a m´edia dos valores.
import java.util.*;
public class ex11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int [] vet = new int[5];
      int maior=0; int menor=0; int media; int soma=0;
      for(int i=0; i<vet.length; i++){
        System.out.println("Preencha os valores: ");
        vet[i] = sc.nextInt();
        soma =  soma + vet[i];
    }
    for(int i=0;i<vet.length;i++){
        if(vet[i] > maior){
            maior= vet[i];
            }
            if(menor < vet[i]){
                menor=vet[i];
            }
    }
    media = soma/5;
    System.out.println("A média é: " + media);
    System.out.printf("O maior número digitado foi " + maior + " e o menor foi " + menor);
    sc.close();
    }
}
