using ConsoleApp1.Relogio;
using System;

public class Ex1
{
    public static void Main(string[] args)
    {
         Relogio relogio = new Relogio();


        // Exibe a data e hora atual
        relogio.print();

        // Ajusta a data e hora para 10/06/2023 14:30:00
        relogio.ajustar(10, 6, 2023, 14, 30, 0);
        relogio.print();

        // Avança o tempo em 1 hora, 30 minutos e 45 segundos
        relogio.avancarTempo(1, 30, 45);
        relogio.print();

        // Atualiza o tempo para a data e hora atuais do sistema
        relogio.atualizarTempo();
        relogio.print();

        // Reinicializa o relógio para 0h00 de 01/01/2000
        relogio.reinicia();
        relogio.print();

    }
}

