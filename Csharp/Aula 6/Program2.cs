/*Faça um programa para preencher um vetor com 100 valores inteiros e verificar
se existem elementos iguais a zero. Se existirem, imprima as posições em que
estão armazenados. */

using System;
public class num2
{
    public static void Main(string[] args)
    {
        int[] vetor = new int[100];
        
        Random rd = new Random();

        for (int i = 0; i < vetor.Length; i++)
        {
            vetor[i] = rd.Next(0, 10);
          
        }
        for(int i=0 ; i < vetor.Length; i++) {
            if (vetor[i] == 0)
            {
                Console.Write(i + " ");
            }

        }
    }
}