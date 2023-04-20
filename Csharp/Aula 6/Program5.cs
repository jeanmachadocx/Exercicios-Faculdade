/*/Dados dois vetores:
A – 8 elementos do tipo inteiro
B – 12 elementos do tipo inteiro
Faça um programa que leia os dois vetores A e B, gere o vetor C correspondente a
união dos vetores A e B.*/

using System;
public class Num5
{
    public static void Main(string[] args)
    {
        int[] vetA = new int[8];
        int[] vetB = new int[12];
        int[] vetC= new int[20];
        for(int i=0; i<vetA.Length; i++)
        {
            Console.WriteLine("Preencha o vetor A:");
            vetA[i] = int.Parse(Console.ReadLine());
        }
        for (int j= 0; j< vetB.Length; j++)
        {
            Console.WriteLine("Preencha o vetor B:");
            vetB[j] = int.Parse(Console.ReadLine());
        }

        for(int i=0; i< vetA.Length; i++)
        {
            vetC[i] = vetA[i];
        }
        for(int i=0; i < vetB.Length; i++)
        {
            vetC[vetA.Length+i] = vetB[i];
        }

        Console.WriteLine("uniao de A + B: ");

        for (int i=0; i< vetC.Length; i++)
        {
            Console.Write(vetC[i] + " ");
        }

    }
}
