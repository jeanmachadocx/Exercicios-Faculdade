/* 5.Suponha que você foi ao supermercado e comprou: N latas de chocolate em pó a um custo unitário Q, L 
litros de leite a um custo unitário P e B quilos de banana a um custo unitário T. Faça um programa que 
escreva: o nome do produto, total gasto com cada produto e total gasto no mercado. */

using System;
namespace Program
{
    public class Program5
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Informe a quantidade e o valor das latas de chocolate em pó: ");
            int N = int.Parse(Console.ReadLine());
            double Q = double.Parse(Console.ReadLine());
            Console.WriteLine("Quantidade de litros de leites e valor");
            int L = int.Parse(Console.ReadLine());
            double P = double.Parse(Console.ReadLine());
            Console.WriteLine("Quantidade e quilo da Banana: ");
            int B = int.Parse(Console.ReadLine());
            double T = double.Parse(Console.ReadLine());
            double total;

            Console.WriteLine("Quantidade de latas: " + N + " Valor: " + Q + " Preço  latas: " + N*Q);
            Console.WriteLine("Quantidade de leite: " + L + " Valor: " + P + " Preço leies: " + L * P);
            Console.WriteLine("Quantidade de banana: " + B + " Valor: " + T + " Preço Banana: " + B * T);
            total = N * Q + L * P + B * T;
            Console.WriteLine("VALOR TOTAL GASTO: " + total);


        }
    }
}