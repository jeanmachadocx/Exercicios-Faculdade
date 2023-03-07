//Todo restaurante cobra 10% sobre o valor do consumo do cliente para o garçom, embora 
//por lei não possa obrigar o cliente a pagar. Fazer um algoritmo que leia o valor gasto com 
//as despesas realizadas em um restaurante e imprima o valor da gorjeta e o valor total a 
//ser pago (despesa mais gorjeta). 

using System;
namespace Program7
{
    public class Program7
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Insira o valor de consumação: ");
            double consumo = double.Parse(Console.ReadLine());
            double gorjeta = consumo * 0.10;
            double total = gorjeta + consumo;
            Console.WriteLine("O valor da gorjeta é: " + gorjeta);
            Console.WriteLine("O valor total é: " + total);

        }
    }
}
