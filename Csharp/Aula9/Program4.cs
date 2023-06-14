/*4) Um número primo é aquele que é divisível apenas por ele mesmo e por 1. Faça um método que receba como
entrada um inteiro qualquer e imprima uma mensagem informando se o número é primo ou não. */
using System;
public class Ex4
{ 
  public static bool verifica(int n)
  {
        bool resposta= true;
        if (n < 2)
        {
           resposta= false;
        }
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
  }
    public static void Main(string[] args)
    {
        Console.Write("Digite um número: ");
        int num = int.Parse(Console.ReadLine());
        if (verifica(num))
        {
            Console.WriteLine($"O número: {num} é primo");
        }
        else
        {
            Console.WriteLine($"O número: {num} não é primo");
        }
    }
}