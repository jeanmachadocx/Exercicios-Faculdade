using System;
public class num1
{
    public static void Main(string[] args)
    {
        /* Faça um programa para preencher um vetor com 30 valores quaisquer do tipo
         inteiro e contabilizar o número de elementos iguais a ‘10`. */
        int[] vetor = new int[30];
        int contador = 0;
        for (int i = 0; i < vetor.Length; i++)
        {
            Console.WriteLine("Preencha o vetor: ");
            vetor[i] = Convert.ToInt32(Console.ReadLine());
            if (vetor[i] == 10)
            {
                contador++;
            }
        }
        Console.WriteLine("O número 10 aparece: " + contador + " vezes");
    }
}