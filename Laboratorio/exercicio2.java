//  Escreva uma func¸ao recursiva ImprimeSerie(i,j,k). Esta fun ˜ c¸ao imprime na tela a s ˜ ´erie de valores do
// intervalo [i,j], com incremento k.
import java.util.*;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j, k;
        System.out.println("Defina o intervalo que queira somar: ");
        i = sc.nextInt();
        j = sc.nextInt();
        System.out.println("Qual o valor do incremento: ");
        k = sc.nextInt();
        System.out.println(somaSerie(i, j, k));
        sc.close();
    }
     public static int somaSerie(int i, int j, int k){
        if(i < j){
            System.out.println(i);
            return i + somaSerie(i + k, j, k);
        }else{
            return 0;
        }
        }


}
