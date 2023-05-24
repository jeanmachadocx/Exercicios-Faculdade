
/*Faça um programa que leia os elementos de uma matriz 5  5 e crie dois vetores de cinco
posições cada um, que contenham, respectivamente, as somas das linhas e das colunas da
matriz. Escreva a matriz e os vetores criados */

using System;

public class Num5
{
    public static void Main(string[] args)
    {
        int[,] matriz = new int[5,5];
        int[] somaLinha = new int[5];
        int[] somaColuna = new int[5];
        Random rd = new Random();

        for(int i = 0; i < matriz.GetLength(0); i++)
        {
            for(int j = 0; j < matriz.GetLength(1); j++)
            {
                matriz[i, j] = rd.Next(0,11);
            }
        }
        Console.WriteLine("Matriz: ");

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.Write(matriz[i, j]+ " ");
            }Console.WriteLine();
        }
        
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                somaLinha[i] += matriz[i,j];
                somaColuna[j] += matriz[i,j];
            }
        }

        Console.WriteLine("A soma das linhas é = ");
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
           Console.Write(somaLinha[i] + " ");
        }Console.WriteLine();
     
        Console.WriteLine("A soma das colunas é = ");
        for(int i = 0; i < matriz.GetLength(0); i++)
        { 
           Console.Write(somaColuna[i]+ " ");
        }Console.WriteLine();

    }
}