// Fac¸a um programa que gere uma matriz transposta (Matriz transposta ´e toda matriz onde sao trocadas ˜
// as linhas pelas colunas, ou vice-versa).
import java.util.*;
public class lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha=0, coluna=0;
        int [][] matrizA = new int [4][4];
        int [][] matrizB = new int [4][4];
        for( linha=0; linha<matrizA.length; linha++){
            for( coluna=0; coluna<matrizA.length; coluna++){
                System.out.print("Valores da matriz: ");
                matrizA[linha][coluna] = sc.nextInt();
            }
        }
        for( linha=0; linha<matrizA.length; linha++){
            for( coluna=0; coluna<matrizA.length; coluna++){
                matrizB[coluna][linha] = matrizA[coluna][linha]; 
                System.out.println(matrizB[coluna][linha]);
            }
        }

    }
}
