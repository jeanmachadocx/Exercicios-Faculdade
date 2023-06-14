/* ) Faça um programa que tenha um método para calcular o valor de co-seno de x através dos 25 primeiros
termos da seguinte série: */

using System;
public class Ex1
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Informe o valor de x: ");
        double num = Convert.ToDouble(Console.ReadLine());

        double cosseno = Calcular(num);
        Console.WriteLine("O cosseno de: " + num + " é: " + cosseno);
    }
    public static double Calcular(double num)
    {
        double cosseno = 1.0;
        double termo = 1.0;
        double fatorial = 1.0;

        for (int i = 1; i < 25; i++)
        {
            termo *= -num * num / (2 * i);
            fatorial *= (2 * i) * (2 * i - 1);
            cosseno += termo / fatorial;

        }
        return cosseno;
    }  
}