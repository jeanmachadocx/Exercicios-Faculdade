/* 7.Escreva um programa que leia as medidas dos lados de um retângulo, calcule e imprima a 
medida do seu perímetro, da diagonal e da área do retângulo. 
area = b * a
perimetro 2*a + 2*b
diagonal = raiz 2*a + 2*b

*/

using System;
namespace Program
{
    public class Program7
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Informe os lados do retângulo: ");
            double b = double.Parse(Console.ReadLine());
            double a = double.Parse(Console.ReadLine());
            double area = b * a;
            double perimetro = 2 * a + 2 * b;
            double diagonal = Math.Sqrt(perimetro);
            Console.WriteLine(" Perímetro: " + perimetro);
            Console.WriteLine("Área: " + area);
            Console.WriteLine("Diagonal: " + diagonal);
        }
    }
}