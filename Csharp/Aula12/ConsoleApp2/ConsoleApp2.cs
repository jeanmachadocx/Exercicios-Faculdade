using ConsoleApp2;
using System;


public class Exercicio2
{
    public static void Main(string[] args)
    {
        ContaPoupanca.AlterarTaxaDeJuros(0.04);

        ContaPoupanca poupador1 = new ContaPoupanca(2000);
        ContaPoupanca poupador2 = new ContaPoupanca(3000);

        Console.WriteLine("Saldo inicial:");
        poupador1.MostrarSaldo();
        poupador2.MostrarSaldo();

        poupador1.CalcularJuroMensal(0.04);
        poupador2.CalcularJuroMensal(0.04);

        Console.WriteLine("Saldo após taxa de juros de 4%:");
        poupador1.MostrarSaldo();
        poupador2.MostrarSaldo();

        ContaPoupanca.AlterarTaxaDeJuros(0.05);

        poupador1.CalcularJuroMensal(0.05);
        poupador2.CalcularJuroMensal(0.05);

        Console.WriteLine("Saldo após taxa de juros de 5%:");
        poupador1.MostrarSaldo();
        poupador2.MostrarSaldo();

    }
}