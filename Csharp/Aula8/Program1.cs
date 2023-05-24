//Faça um programa que leia uma string do teclado e diga se ela é palíndromo. 

using System;
public class Program8
{
    public static void Main(string[] args)
    {
        string palavra;
        Console.WriteLine("Escreva uma palavra: ");
        palavra = Console.ReadLine();

        int i = 0, j = palavra.Length-1;

        while (i < j)
        {
            if (palavra[i] == palavra[j])
            {
                Console.WriteLine($" A palavra: {palavra} é palíndromo");
            }
            else
            {
                Console.WriteLine($"A palavra: {palavra} não é palíndromo");
            }
            i++; j--;
        }
    }
} 