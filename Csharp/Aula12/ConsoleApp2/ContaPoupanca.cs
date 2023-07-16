using System;

namespace ConsoleApp2
{
    public class ContaPoupanca
    {
        private static double taxaDeJurosAnual;
        private double saldoPoupanca;

        public ContaPoupanca(double saldoPoupanca)
        {
            this.saldoPoupanca = saldoPoupanca;
        }

        public void CalcularJuroMensal(double taxaDeJurosAnual)
        {
            double jurosMensal = saldoPoupanca * taxaDeJurosAnual / 12;
            saldoPoupanca += jurosMensal;

        }

        public static void AlterarTaxaDeJuros(double novaTaxa)
        {
            taxaDeJurosAnual = novaTaxa;
        }

        public void MostrarSaldo()
        {
            Console.WriteLine("Saldo: " + saldoPoupanca);

        }

    }
}
