/*Elabore um programa que leia uma matriz 4 x 4 e indique se é uma matriz triangular superior.
Matriz triangular superior é uma matriz quadrada onde todos os elementos abaixo da diagonal
principal são nulos (valor zero). */

using System;
public class Num4
{
    public static void Main(string[] args)
    {
        int[,] matriz = new int[4, 4];
        bool flag = true;

        Console.Write("Preencha a matriz");
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                matriz[i, j] = int.Parse(Console.ReadLine());


            }
        }


        Console.Write("Matriz: ");
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.Write(matriz[i, j] + " ");
            }Console.WriteLine();
        }

                for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j <i; j++)
            {
                if (matriz[i, j] != 0)
                {
                    flag = false;
                    break;
                }
            }
            if (!flag)
            {
                break;
            }

        }
        if (flag)
        {
            Console.WriteLine("A matriz é triangular superior");
        }
        else
        {
            Console.WriteLine("A matriz não é triangular superior");
        }
    }
}