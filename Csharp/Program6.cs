//Para vários tributos a base de calculo é o salário mínimo. Fazer um algoritmo que leia o o 
//valor do salário de uma pessoa. Calcular e exibir quantos salários mínimos essa pessoa 
//ganha. Considere que o valor do salário mínimo é: R$1.212,00. 

using System;
public class Program6{
    public static void Main(string[] args) {
        double salario, salarioMinimo = 1212.00;
        double quantidadeSalarios;
        Console.Write("Digite o valor do salário: ");
        salario = double.Parse(Console.ReadLine());
        quantidadeSalarios = salario / salarioMinimo;
        Console.WriteLine("O salário informado equivale a " + quantidadeSalarios);

}
   }
