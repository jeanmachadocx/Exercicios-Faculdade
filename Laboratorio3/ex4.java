// Fac¸a um programa que leia um vetor de 8 posic¸oes e, em seguida, leia tamb ˜ ´em dois valores X e Y
// quaisquer correspondentes a duas posic¸oes no vetor. Ao final seu programa dever ˜ a escrever a soma dos ´
// valores encontrados nas respectivas posic¸oes X e Y .
import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[8];
        int x,y, soma=0;
        for(int i=0; i<8; i++){
            System.out.println("Preencha o vetor: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("Posição de X e Y que queira somar: ");
        x = sc.nextInt();
        y = sc.nextInt();
        soma = vet[x] + vet[y];
        System.out.println("A soma é: " + soma);
    }
}
