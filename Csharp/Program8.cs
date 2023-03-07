//Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os 
//cavalos comprados para um haras. 

using System;
namespace Program
{
    public class Program8
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Informe a quantidade de cavalos: ");
            int cavalos = int.Parse(Console.ReadLine());
            int ferraduras = cavalos * 4;
            Console.WriteLine("Serão necessárias: " + ferraduras + " ferraduras");
        }
    }
}
