using System;
public class Aviao
{
    private int numeroVoo;
    private DateTime data;
    private int[] vagasOcupadas;

    public Aviao(int numeroVoo, DateTime data)
    {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.vagasOcupadas = new int[100];
    }

    public int ProximoLivre()
    {
        for (int i = 0; i < vagasOcupadas.Length; i++)
        {
            if (vagasOcupadas[i] == 0)
            {
                return i + 1;
            }
            
        }
        //se estiver todos ocupados 
        return -1;
    }

    public bool Verifica(int cadeira)
    {
        return vagasOcupadas[cadeira - 1] != 0;
    }

    public bool Ocupa(int cadeira)
    {
        if (vagasOcupadas[cadeira - 1] != 0)
        {
            return false;
        }
        else
        {
            vagasOcupadas[cadeira - 1] = 1;
            return true;
        }
    }
    public int Vagas()
    {
        int vagasDisponiveis = 0;
        for (int i = 0; i < vagasOcupadas.Length; i++)
        {
            if (vagasOcupadas[i] == 0)
            {
                vagasDisponiveis++;
            }
        }
        return vagasDisponiveis;
    }

    public int GetVoo()
    {
        return numeroVoo;
    }
}
