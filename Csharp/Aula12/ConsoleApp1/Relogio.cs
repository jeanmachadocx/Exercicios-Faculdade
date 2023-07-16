using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    namespace Relogio
    {
        using System;
        public class Relogio
        {
            private int segundos;
            private int minutos;
            private int horas;
            private int dia;
            private int mes;
            private int ano;

            public Relogio()
            {
                reinicia();
            }

            public void reinicia()
            {
                segundos = 0;
                minutos = 0;
                horas = 00;
                dia = 1;
                mes = 1;
                ano = 2000;
            }
            public void ajustar(int dia, int mes, int ano, int horas, int minutos, int segundos)
            {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
                this.horas = horas;
                this.minutos = minutos;
                this.segundos = segundos;
            }
            public void avancarTempo(int horas, int minutos, int segundos)
            {
                this.horas += horas;
                this.minutos += minutos;
                this.segundos += segundos;

                if (this.segundos >= 60)
                {
                    this.minutos += this.segundos / 60;
                    this.segundos = this.segundos % 60;
                }

                if (this.minutos >= 60)
                {
                    this.horas += this.minutos / 60;
                    this.minutos = this.minutos % 60;
                }
            }
            public void atualizarTempo()
            {
                //vou utilizar a classe DateTime para receber data e hora atual
                DateTime now = DateTime.Now;

                segundos = now.Second;
                minutos = now.Minute;
                horas = now.Hour;
                dia = now.Day;
                mes = now.Month;
                ano = now.Year;
            }
            public void print()
            {
                Console.WriteLine($"Data e hora atual: {dia:00}/{mes:00}/{ano} {horas:00}:{minutos:00}:{segundos:00}");
            }
        }

    }
}
