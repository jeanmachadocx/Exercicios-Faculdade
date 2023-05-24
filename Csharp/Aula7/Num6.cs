/* Escreva um programa que preencha uma matriz 5 x 5 com números aleatórios de 1 a 50. Depois
mostre a matriz gerada, encontre e mostre todos os números primos e a posição onde cada
um deles se encontra no formato */

using System;
public class Num6
{
    public static void Main(string[] args)
    {
        int[,] matriz = new int[5, 5];

        Random rd = new Random();

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                matriz[i, j] = rd.Next(0, 51);
            }
        }
        Console.WriteLine("Matriz");

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine();
        }

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                if (matriz[i, j] % 2 != 0)
                {
                    Console.WriteLine("O número: " + matriz[i, j] + " é primo e está na linha: " + i + " coluna: " + j);

                }
            }
        }
    
    }
}