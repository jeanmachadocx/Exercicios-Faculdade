/* 
 Cada avaliação é descrita pelos seguintes dados:
Nome da disciplina
Valor da avaliação
Data da aplicação
Pede-se:
a) Crie um tipo para data (struct).
b) Crie um tipo para avaliação.
Construa um programa que permita o cadastro de duas avaliações e em seguida exiba os
dados cadastrados na tela do monitor de vídeo.
 
 */


using System;
public class Program2
{
    struct data
    {
       public string dia;
    }

    struct avaliacao
    {
        public string disciplina;
        public double valor;
        public double notaObtida;
    }

    public static void Main(string[] args)
    {
        data data1, data2;
        avaliacao prova1, prova2;
        
        //Aluno1
        Console.WriteLine("Data da avaliação: ");
        data1.dia = Console.ReadLine();
        Console.WriteLine("Informe a disciplina: ");
        prova1.disciplina = Console.ReadLine();
        Console.WriteLine("Quanto vale essa avaliação? ");
        prova1.valor = double.Parse(Console.ReadLine());
        Console.WriteLine("\n" + "Pontuação obtida: ");
        prova1.notaObtida = double.Parse(Console.ReadLine());

        Console.WriteLine("\n" + "Dia da avaliação: " + data1.dia);
        Console.WriteLine("\n" + "Disciplina da prova 1: " + prova1.disciplina); 
        Console.WriteLine("\n" + "Valor: " + prova1.valor);
        Console.WriteLine("\n" + "Pontuação obtida: " + prova1.notaObtida);

        //Aluno2

        Console.Write("\n" + s"Segunda avaliação: ");
        Console.WriteLine("Data da avaliação: ");
        data2.dia = Console.ReadLine();
        Console.WriteLine("Informe a disciplina: ");
        prova2.disciplina = Console.ReadLine();
        Console.WriteLine("Quanto vale essa avaliação? ");
        prova2.valor = double.Parse(Console.ReadLine());
        Console.WriteLine("\n" + "Pontuação obtida: ");
        prova2.notaObtida = double.Parse(Console.ReadLine());

        Console.WriteLine("\n" + "Dia da avaliação: " + data2.dia);
        Console.WriteLine("\n" + "Disciplina da prova 1: " + prova2.disciplina);
        Console.WriteLine("\n" + "Valor: " + prova2.valor);
        Console.WriteLine("\n" + "Pontuação obtida: " + prova2l.notaObtida);


    }

}
