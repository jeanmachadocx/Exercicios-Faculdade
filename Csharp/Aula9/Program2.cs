/* Escreva um algoritmo que receba um número inteiro positivo N e apresente um quadro de números
como o que se segue abaixo. Este é o caso de N = 5. Use um método para gerar e mostrar o quadro
abaixo.
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
*/

using System;
using System.Globalization;

public class Ex2
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Escreva o número: ");
        int numero = int.Parse(Console.ReadLine());
       
        Console.WriteLine(Matriz(numero));
    }

    public static int Matriz(int numero)
    {
        //linha 
        for (int i = 1; i <= numero; i++)
        {
         // coluna 
            for (int j = i; j <= i + numero-1; j++)
            {
                Console.Write(j);
            }
            Console.WriteLine();
        }
        return numero;
    }
}