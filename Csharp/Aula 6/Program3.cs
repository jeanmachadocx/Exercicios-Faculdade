/*Faça um programa que preencha um vetor com dez números inteiros, calcule e
mostre o vetor resultante colocando os elementos em ordem decrescente. */

using System;
using System.Globalization;

public class Num3
{
    public static void Main(string[] args)
    {
        int[] vetor = new int[10];

        for (int i=0; i< vetor.Length; i++)
        {
            Console.Write(" Preencha um vetor: ");
            vetor[i] = int.Parse(Console.ReadLine());
        }
        for(int  i=0;i< vetor.Length; i++)
        {
            for(int j=i + 1; j< 10; j++)
            {
                if (vetor[i] < vetor[j])
                {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        Console.Write("Vetor ordenado em ordem decrescente: ");
        for(int i=0; i<10; i++)
        {
            Console.Write(vetor[i] + " ");
        }
    }
}