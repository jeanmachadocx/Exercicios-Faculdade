/* Escreva um programa que leia 3 valores inteiros e diferentes e mostre-os em ordem
decrescente
*/

using System;
namespace Program1
{
    public class Program1
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Informe 3 valores: ");
            int num1 = int.Parse(Console.ReadLine());
            int num2 = int.Parse(Console.ReadLine());
            int num3 = int.Parse(Console.ReadLine());

           
            if(num1 > num2 && num1 > num3 && num2 > num3) 
            {
                Console.WriteLine("Ordem decrescente: " + num1 +" " + num2 +" " + num3);
            }else if(num1 > num2 && num1 > num3 && num3 > num2)
            {
                Console.WriteLine("Ordem decrescente: " + num2 + " " + num3 + " " + num1);

            }else if(num2 >  num1 && num2 > num3 && num3 > num1)
            {
                Console.WriteLine("Ordem decrescente: " + num2 + " " + num3 + " " + num1);

            }else if(num2 >  num1 && num2 > num3 && num3 < num1)
            {
                Console.WriteLine("Ordem decrescente: " + num3+ " " + num1 + " " + num2);

            }
            else if (num3 > num1 && num3 > num2 && num2 > num1)
            {
                Console.WriteLine("Ordem decrescente: " + num3 + " " + num2 + " " + num1);

            }
            else if (num3 > num1 && num3 > num2 && num2 < num1)
            {
                Console.WriteLine("Ordem decrescente: " + num3 + " " + num1 + " " + num2);

            }
            else
            {
                Console.WriteLine("Digite outros valores");
            }
        }
    }
}