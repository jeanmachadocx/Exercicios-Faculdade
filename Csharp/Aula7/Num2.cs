/*Faça um programa que:
a) leia uma matriz quadrada de 10 x 10 elementos inteiros
b) imprima essa matriz
c) calcule e imprima a soma dos elementos situados na diagonal secundária e abaixo dela */

using System;
using System.Runtime.Serialization;

public class Num2
{
    public static void Main(string[] args)
    {
        int[,] matriz = new int[10, 10];
       int  contador = 0;
       Random rd = new Random();


        for (int linha =0; linha < matriz.GetLength(0); linha++)
        {
            for(int coluna =0; coluna< matriz.GetLength(0); coluna++)
            {
                matriz[linha, coluna] = rd.Next(0, 2);
               
                if (coluna > linha )
                {
                    contador += matriz[linha, coluna];
                }
            }
        }

        Console.WriteLine("Matriz: ");
        for (int linha = 0; linha < matriz.GetLength(0); linha++)
        {
            for (int coluna = 0; coluna < matriz.GetLength(0); coluna++) {
                Console.Write(" " +matriz[linha, coluna]);
            }
            Console.WriteLine();
        }
        Console.WriteLine(contador);


    }
}