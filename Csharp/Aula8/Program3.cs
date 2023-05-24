/* Elaborar um programa que leia uma frase (string) e crie dois vetores: um para vogais
e outro para consoantes. Transfira para o vetor vogal todas as vogais da frase lida e
para o vetor consoante todas as consoantes da frase lida. Mostre os dois vetores
gerados */

using System;
public class Program3
{
    public static void Main(string[] args)
    {
        string frase;

        Console.WriteLine("Escreva uma frase: ");
        frase = Console.ReadLine();
        Console.WriteLine("Frase digitada: " + frase);
        frase.ToLower();
        int tamanho = frase.Length;
        char[] vogal = new char[tamanho];
        char[] consoante = new char[tamanho];


        int iVogal = 0, iConsoante = 0;

        for (int i = 0; i < frase.Length; i++)
        {
            char letra = frase[i];

            if (char.IsLetter(letra))
            {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                {
                    vogal[iVogal] = letra;
                    iVogal++;
                }
                else
                {
                    consoante[iConsoante] = letra;
                    iConsoante++;
                }
            }
        }

        Console.WriteLine("Vogais encontradas: ");
        for (int i = 0; i < iVogal; i++)
        {
            Console.Write(vogal[i]);
        }
        Console.WriteLine();

        Console.WriteLine("Consoantes encontradas: ");
        for (int i = 0; i < iConsoante; i++)
        {
            Console.Write(consoante[i]);
        }
    }
}