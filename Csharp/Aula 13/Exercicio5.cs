using System;
public class Exercicio5
{
    public static void Main(string[] args)
    {
        Aviao voo = new Aviao(777, DateTime.Now); //.Now usa a hora atual
        Console.WriteLine("Número do voo: " + voo.GetVoo());
        Console.WriteLine("Próxima cadeira livre: " + voo.ProximoLivre());

        int cadeira = 3;
        if (voo.Verifica(cadeira))
        {
            Console.WriteLine("A cadeira " + cadeira + " está ocupada.");
        }
        else
        {
            bool ocupado = voo.Ocupa(cadeira);
            if (ocupado)
            {
                Console.WriteLine("A cadeira " + cadeira + " foi ocupada com sucesso.");
            }
            else
            {
                Console.WriteLine("A cadeira " + cadeira + " já está ocupada.");
            }
        }

        Console.WriteLine("Número de vagas disponíveis: " + voo.Vagas());
    }
}