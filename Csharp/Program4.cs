//Escreva um programa que pergunte qual o tempo transcorrido em um cronômetro em 
//horas, minutos e segundos e transforme (e mostre) todo este tempo em segundos. 

using System;
namespace Program4
{
    public class Program4
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Informe as horas: ");
            double horas = double.Parse(Console.ReadLine());
            Console.WriteLine("Minutos: ");
            double minutos = double.Parse(Console.ReadLine());
            Console.WriteLine("Segundos: ");
            double segundos = double.Parse(Console.ReadLine());
            double tempoTotal = (horas * 3600 + minutos * 60 + segundos);
            Console.WriteLine("O tempo total em segundos é: " + tempoTotal + " segundos");

        }
    }
}
