/*Faça um programa que receba a temperatura média de cada mês do ano,
armazenando-as em um vetor. Calcule e mostre a maior e a menor
temperatura do ano e em que mês ocorreram (quando for imprimir, mostrar o
mês por extenso: 1 - Janeiro, 2 - fevereiro, ...) Desconsidere empates. */

using System;
public class Num4
{
    public static void Main(string[] args)
    {
        double []vetor = new double[12];
        string[] meses =  {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double maior = vetor[0], menor = vetor[0], temperatura;
        int indiceMaior=0, indiceMenor=0;
        
        for(int i = 0; i <vetor.Length; i++)
        {
            Console.WriteLine("Escreva a temperatura média do mês: ");
           temperatura = double.Parse(Console.ReadLine());
            if(temperatura > maior)
            {
                maior = temperatura;
                indiceMaior = i;
            }if(temperatura < menor)
            {
                maior = temperatura;
                indiceMenor = i;
            }
        }
        Console.WriteLine("A maior temperatura foi: " + maior + " no mês de: " + meses[indiceMaior]);
        Console.WriteLine("A menor temperatura foi: " + menor + " no mês de: " + meses[indiceMenor]);

    }
}