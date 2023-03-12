/* 6.Faça um programa que leia o número total de prestações de um consórcio, o total de prestações pagas e 
o valor atual da prestação. O programa deve calcular e mostrar o saldo devedor atual */

using System;
using System.Xml.Schema;

namespace Program
{
    class Program6
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Informe a quantidade de prestações: ");
            int quantidade = int.Parse(Console.ReadLine());
            Console.WriteLine("Valor atual das parcelas: ");
            double valor = double.Parse(Console.ReadLine());
            Console.WriteLine("Prestações pagas: ");
            int pagas = int.Parse(Console.ReadLine());
            int resto = quantidade - pagas;
            double total = resto * valor;
            Console.WriteLine("Saldo devedor: R$" + total);
        }
    }
}