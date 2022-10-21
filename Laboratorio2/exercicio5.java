// Crie um programa que solicite a entrada de 10 n ́umeros pelo usu ́ario, armazenando-os em um vetor,
// e ent ̃ao monte outro vetor com os valores do primeiro multiplicados por 5. Exiba os valores dos dois
// vetores na tela, simultaneamente, em duas colunas (um em cada coluna), uma posic ̧ ̃ao por linha.
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int [] vetA = new int[10];
        int [] vetB = new int [10];
        for(i =0; i < vetA.length; i++){
            System.out.println("Digite um valor: ");
            vetA[i] = sc.nextInt();
        }
        for(i =0; i <= 9; i++){
        System.out.println("Vetor A = " + vetA[i]);
        vetB[i] = vetA[i]* 5;
        System.out.println("vezes 5 = " + vetB[i]);
            // Sysout usado para formatar 
        System.out.println();
        }
        sc.close();
    }
}
