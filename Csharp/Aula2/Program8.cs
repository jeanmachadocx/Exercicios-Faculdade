/* 8.O governo acaba de liberar US$ 10.000.000,00 dólares para construção de casas populares, a qual
contratou a Construtora Solidez Engenharia S.A. Cada casa custa o equivalente a 150 salários mínimos.
Faça um algoritmo que leia o valor do salário mínimo (você deve digitar um valor. Pode ser fictício) e
calcule a quantidade de casas possíveis de se construir com a verba americana. Considere a cotação do
dólar como US$ 1,00 = R$5,15. */

using System;
namespace Program8
{
    public class Program8
    {
        public static void Main(string[] args)
        {
            const double verba = 10000000 * 5.15;
             Console.WriteLine("Informe o valor do salário mínimo: ");
            double salario = double.Parse(Console.ReadLine());
            double casa = verba / (salario * 150);
            Console.WriteLine("Serão construídas: " + casa);

        }
    }
}