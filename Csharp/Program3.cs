//Escreva um programa que pergunte os seguintes dados referentes ao pneu de um 
//automóvel: P = pressão  V = volume T = temperatura
//calcule a massa de ar desse pneu segundo a fórmula (M = massa de ar):  
//PV = 0.37M(T + 460) 

using System;

public class Program3
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite a pressão do pneu: ");
        double pressao = double.Parse(Console.ReadLine());

        Console.WriteLine("Digite o volume do pneu: ");
        double volume = double.Parse(Console.ReadLine());
        Console.WriteLine("Informe a temperatura");        
        double temp = double.Parse(Console.ReadLine());

        // Constantes para o cálculo 
        double R = 0.7302; 
        double M = 28.97; 

        // Cálculo da massa de ar do pneu
        double massaAr = (pressao * volume * M) / (R * (temp + 460));

        Console.WriteLine("A massa de ar do pneu é: " + massaAr.ToString("F2") + " lbmol.");
    }
}
