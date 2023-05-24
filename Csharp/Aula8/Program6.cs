/*implemente um programa que receba um nome completo e apresente apenas o
último nome e o 1º nome 
 */

using System;
public class Program6
{
    static void Main()
    {
        Console.Write("Digite um nome completo: ");
        string nome = Console.ReadLine();

        string ultimoNome = "";
        string primeiroNome = "";

        int i = nome.Length - 1;
        while (i >= 0 && nome[i] != ' ')
        {
            ultimoNome = nome[i] + ultimoNome;
            i--;
        }

        int j = 0;
        while (j < nome.Length && nome[j] != ' ')
        {
            primeiroNome += nome[j];
            j++;
        }
            string nomeFormatado = ultimoNome + ", " + primeiroNome;
            Console.WriteLine("Saída: " + nomeFormatado);
        
        Console.ReadLine();
    }
}