// Fac ̧a um programa que construa uma matriz 50 por 50 de n ́umeros reais e ap ́os constru ́ıda, colocar o
// conte ́udo de sua diagonal principal dentro de um vetor, depois do vetor montado, imprimir o vetor.
import java.util.*;
public class lista1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        float [][] mat = new float[50][50];
        float []vetPrincipal = new float[50];
        int i=0; int k=0;
        for( i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
            mat[i][j] = rd.nextFloat();
            if(i==j){
                System.out.print(i);
                vetPrincipal[k] = mat[i][j];
                k++;
                System.out.println(" Diagonal principal: " + vetPrincipal[i]);
            }
        }
    } 
}
}
