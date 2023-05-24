/* Faça um programa que:
a) leia uma matriz quadrada de 20 x 20 elementos reais
b) divida cada elemento de uma linha da matriz pelo elemento da diagonal principal desta linha
c) imprima a matriz assim modificada */

using System;
public class Num3
{
    public static void Main(string[] args)
    {
        double[,] matriz = new double[20, 20];
        double divisor;

        Random rand = new Random();


        Console.WriteLine("Matriz: ");
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                matriz[i, j] = rand.Next(1,101);
                Console.Write(matriz[i, j] + " ");
            } Console.WriteLine();
        }

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            divisor = matriz[i, i];
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                matriz[i, j] /= divisor;       
            } 
        }
        Console.WriteLine("Matriz modificada: ");
       
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.Write("{0,10:F2}", + matriz[i,j]);
            }Console.WriteLine();
        }

    }
}