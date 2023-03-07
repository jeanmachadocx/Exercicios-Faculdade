//Escreva um programa que leia uma temperatura em graus Farenheit e a imprima em graus 
//Centígrados. A conversão de graus Farenheit para Centígrados é obtida por C=(5/9)(F - 32). 

using System;
namespace Program2.cs
{
    public class Program2
    {
        static void Main(string[] args)
        {
            double farenheit, celsius;
            Console.WriteLine("Informe a temperatura em Farenheit: ");
            farenheit = double.Parse(Console.ReadLine());
            celsius = ((farenheit -32)* 5/9);
            Console.WriteLine("A temperatura: " + farenheit + " em Celsius é: " + celsius);
        }
    }
}
