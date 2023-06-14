/* 2) Crie um método que receba como parâmetro um valor inteiro e positivo N e retorne o valor de S, obtido pelo
seguinte cálculo:
S = 1 + 1/2 + 1/4 + 1/8 ... + 1/2N
*/

using System;
public class Ex3
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Valor de N: ");
        int num = int.Parse(Console.ReadLine());
        Console.WriteLine(Soma(num));

    }
    public static int Soma(int num)
    {
        int numerador = 1;
        int denominador = 2;
        int s = numerador / denominador;

        for (int i = 0; i < num; i++)
        {

            Console.WriteLine(numerador + " / " + denominador);
            
            denominador += 2;
        }

        return s;
    }
}