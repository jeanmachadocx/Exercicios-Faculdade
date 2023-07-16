/*
O registro dos alunos é realizado através dos seguintes dados:
Nome do aluno
Nota obtida ao longo do semestre
Nota obtida na avaliação especial
Pede-se:
a) Criar um tipo para aluno (struct).
b) Construir um programa que permita o registro de dois alunos. Em seguida exibir na
tela do monitor de vídeo os seguintes dados de cada aluno:
Nome do aluno
Nota obtida ao longo do semestre
Nota obtida na avaliação especial
Nota final, sabendo que a nota final corresponde à média entre as outras duas
notas
 */

using System;
using System.Diagnostics;

public struct Aluno
{
    public string Nome;
    public double NotaSemestre;
    public double NotaAvaliacaoEspecial;


    public double notaFinal()
    {
        return (NotaSemestre + NotaAvaliacaoEspecial)/2;
    }
}

public class Program1
{
    public static void Main(string[] args)
    {
        Aluno aluno1, aluno2;

        Console.WriteLine("Aluno 1");

        Console.WriteLine("Nome: ");
        aluno1.Nome = Console.ReadLine();

        Console.WriteLine("Nota do semestre: ");
        aluno1.NotaSemestre = double.Parse(Console.ReadLine());

        Console.WriteLine("Nota avaliação especial: ");
        aluno1.NotaAvaliacaoEspecial = double.Parse(Console.ReadLine());
        Console.WriteLine("\n" + "Nome: " + aluno1.Nome);
        Console.WriteLine("\n" + " Nota do semestre: " + aluno1.NotaSemestre);
        Console.WriteLine("\n" + "Nota da avaliação: " + aluno1.NotaAvaliacaoEspecial);
        Console.WriteLine("\n" + "Nota Final: " + aluno1.notaFinal());
        

        //Aluno 2

        Console.WriteLine("\n" + " Aluno 2");

        Console.WriteLine("Nome: ");
        aluno2.Nome = Console.ReadLine();

        Console.WriteLine("Nota do semestre: ");
        aluno2.NotaSemestre = double.Parse(Console.ReadLine());

        Console.WriteLine("Nota avaliação especial: ");
        aluno2.NotaAvaliacaoEspecial = double.Parse(Console.ReadLine());
        Console.WriteLine("\n" + "Nome: " + aluno2.Nome);
        Console.WriteLine("\n" + " Nota do semestre: " + aluno2.NotaSemestre);
        Console.WriteLine("\n" + "Nota da avaliação: " + aluno2.NotaAvaliacaoEspecial);
        Console.WriteLine("\n" + "Nota Final: " + aluno2.notaFinal());
    }
}
   