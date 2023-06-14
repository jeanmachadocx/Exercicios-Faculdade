/*5) Faça um método que receba um número inteiro N como parâmetro e retorne o número de divisores de
N. No método main implemente a leitura de uma sequência de números, terminada pelo flag zero, e
calcule o número de divisores de cada um deles, usando o método desenvolvido anteriormente.
*/

using System;
public class Ex5
{
    public static int verifica(int num)
    {
        int contador = 0;

        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                contador++;
            }
        }

        return contador;
    }
    public static void Main(string[] args)
    {
        Console.WriteLine("Digite uma sequência de números (termina com zero):");
        int num;
        do
        {
            num = Convert.ToInt32(Console.ReadLine());

            if (num != 0)
            {
                int divisor = verifica(num);
                Console.WriteLine("O número " + num + " possui " + divisor + " divisores.");
            }
        } while (num != 0);
    }

}
