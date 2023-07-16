using System;

struct Veiculo
{
    public string Placa;
    public TimeSpan TempoEntrada; // pesquisei e encontrei essa estrutura que permite fazer operacoes com valores de tempo (TimeSpan)
    public TimeSpan TempoSaida;
}

public class Estacionamento
{
    private Veiculo[] veiculos;
    private int quantidadeVeiculos;
    private const double ValorPorMinuto = 0.10;

    public Estacionamento(int tamanhoMaximo)
    {
        veiculos = new Veiculo[tamanhoMaximo];
        quantidadeVeiculos = 0;
    }

    public void CadastrarEntrada()
    {
        if (quantidadeVeiculos < veiculos.Length)
        {
            Veiculo novoVeiculo = new Veiculo();

            Console.WriteLine("Placa do veículo: ");
            novoVeiculo.Placa = Console.ReadLine();

            Console.WriteLine("Tempo de entrada (horas minutos):");
            string[] tempoEntrada = Console.ReadLine().Split(' ');
            int horas = int.Parse(tempoEntrada[0]);
            int minutos = int.Parse(tempoEntrada[1]);
            novoVeiculo.TempoEntrada = new TimeSpan(horas, minutos, 0);

            veiculos[quantidadeVeiculos] = novoVeiculo;
            quantidadeVeiculos++;

            Console.WriteLine("Entrada cadastrada com sucesso.");
        }
        else
        {
            Console.WriteLine("O estacionamento está cheio. Não é possível cadastrar uma nova entrada.");
        }
    }

    public void RegistrarSaida()
    {
        Console.WriteLine("Placa do veículo a ser retirado:");
        string placa = Console.ReadLine();

        Veiculo veiculo = BuscarVeiculoPorPlaca(placa);

        if (veiculo.Placa != null)
        {
            Console.WriteLine("Tempo de entrada: " + veiculo.TempoEntrada);
            Console.WriteLine("Tempo de saída (horas minutos):");
            string[] tempoSaida = Console.ReadLine().Split(' ');
            int horas = int.Parse(tempoSaida[0]);
            int minutos = int.Parse(tempoSaida[1]);
            veiculo.TempoSaida = new TimeSpan(horas, minutos, 0);

            double valorPago = CalcularValorAPagar(veiculo);
            Console.WriteLine("Valor a ser pago: R$ " + valorPago.ToString("F2"));
        }
        else
        {
            Console.WriteLine("Veículo não cadastrado.");
        }
    }

    private Veiculo BuscarVeiculoPorPlaca(string placa)
    {
        Veiculo veiculoNaoEncontrado = new Veiculo();

        for (int i = 0; i < quantidadeVeiculos; i++)
        {
            if (veiculos[i].Placa.Equals(placa, StringComparison.OrdinalIgnoreCase))
            {
                return veiculos[i];
            }
        }

        return veiculoNaoEncontrado;
    }

    private double CalcularValorAPagar(Veiculo veiculo)
    {
        TimeSpan tempoEstacionado = veiculo.TempoSaida - veiculo.TempoEntrada;
        double minutosEstacionados = tempoEstacionado.TotalMinutes;
        double valorPago = minutosEstacionados * ValorPorMinuto;
        return valorPago;
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        Estacionamento estacionamento = new Estacionamento(10);
        int opcao = 0;

        while (opcao != 3)
        {
            Console.WriteLine("Escolha uma opção:");
            Console.WriteLine("1 - Cadastrar entrada de veículo");
            Console.WriteLine("2 - Registrar saída de veículo");
            Console.WriteLine("3 - Sair");
            opcao = int.Parse(Console.ReadLine());

            switch (opcao)
            {
                case 1:
                    estacionamento.CadastrarEntrada();
                    break;
                case 2:
                    estacionamento.RegistrarSaida();
                    break;
                case 3:
                    Console.WriteLine("Saindo...");
                    break;
                default:
                    Console.WriteLine("Opção inválida");
                    break;
            }

            Console.WriteLine();
        }
    }
}