// 3. Fac¸a um programa que fac¸a a soma de duas matrizes.

import java.util.*;
public class lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,j=0;
        int mat1[][]  = new int [4][4];
        int  mat2 [][] = new int [4][4];
        int mat3 [][]  = new int [4][4];

        for(i=0; i<mat1.length; i++){
            for(j=0; j<mat1.length; j++){
                System.out.println("Matriz 1: ");
                mat1[i][j] = sc.nextInt();
            }
        } System.out.println();
        for(i=0; i<mat1.length; i++){
            for(j=0; j<mat1.length; j++){
                System.out.println("Matriz 2: ");
                mat2[i][j] = sc.nextInt();
            }
        }System.out.println();
        for(i=0; i<mat1.length; i++){
            for(j=0; j<mat1.length; j++){
            mat3[i][j] = mat1[i][j] + mat2[i][j];
            System.out.print(mat3[i][j]);
            System.out.println("");
            }
        }


        sc.close();
}
}