//Criar um algoritmo que obtenha 4 números reais e exiba a sua média ponderada, sabendo-
//se que os pesos são 2, 1, 3 e 4, nesta ordem. 

using System;
namespace Program4
{
    public class Program5{
        public static void Main(string[] args){
            Console.WriteLine("Número 1: ");
            double numero1 = double.Parse(Console.ReadLine());
            Console.WriteLine("Número 2 ");
            double numero2 = double.Parse(Console.ReadLine());
            Console.WriteLine("Número 3 ");
            double numero3 = double.Parse(Console.ReadLine());
            Console.WriteLine("Número 4 ");
            double numero4 = double.Parse(Console.ReadLine());

            double mediaPonderada = (numero1 *2) + numero2 + (numero3 *3) + (numero4 * 4);

            Console.WriteLine("A média ponderada é: " + mediaPonderada);
        }
    }
}
