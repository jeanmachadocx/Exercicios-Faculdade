using System;

struct Contato
{
    public string nome;
    public string telefone;
    public string celular;
    public string email;
    public string dataAniversario;
}

public class AgendaTelefonica
{
    private Contato[] contatos;
    private int quantidadeContatos;
    private int tamanhoMaximo;

    public AgendaTelefonica(int tamanhoMaximo)
    {
        this.tamanhoMaximo = tamanhoMaximo;
        contatos = new Contato[tamanhoMaximo];
        quantidadeContatos = 0;
    }

    public void CadastrarContato()
    {
        if (quantidadeContatos < tamanhoMaximo)
        {
            Contato novoContato;

            Console.WriteLine("Nome do contato: ");
            novoContato.nome = Console.ReadLine();

            Console.WriteLine("Telefone: ");
            novoContato.telefone = Console.ReadLine();

            Console.WriteLine("Celular: ");
            novoContato.celular = Console.ReadLine();

            Console.WriteLine("E-mail:");
            novoContato.email = Console.ReadLine();

            Console.WriteLine("Aniversário: (DD/MM)");
            novoContato.dataAniversario = Console.ReadLine();

            contatos[quantidadeContatos] = novoContato;
            quantidadeContatos++;

            Console.WriteLine("Cadastro concluído");
        }
        else
        {
            Console.WriteLine("A Agenda está cheia, não é possível cadastrar!!");
        }
    }

    public void EditarContato(string nome)
    {
        int indice = EncontrarContatoPorNome(nome);

        if (indice != -1)
        {
            Console.WriteLine("Digite o novo telefone do contato:");
            contatos[indice].telefone = Console.ReadLine();

            Console.WriteLine("Digite o novo celular do contato:");
            contatos[indice].celular = Console.ReadLine();

            Console.WriteLine("Digite o novo e-mail do contato:");
            contatos[indice].email = Console.ReadLine();

            Console.WriteLine("Digite a nova data de aniversário do contato (DD/MM):");
            contatos[indice].dataAniversario = Console.ReadLine();

            Console.WriteLine("Contato atualizado com sucesso.");
        }
        else
        {
            Console.WriteLine("Contato não encontrado.");
        }
    }

    public void RemoverContato(string nome)
    {
        int indice = EncontrarContatoPorNome(nome);

        if (indice != -1)
        {
            for (int i = indice; i < quantidadeContatos - 1; i++)
            {
                contatos[i] = contatos[i + 1];
            }

            quantidadeContatos--;

            Console.WriteLine("Contato removido com sucesso.");
        }
        else
        {
            Console.WriteLine("Contato não encontrado.");
        }
    }

    public void BuscarContatoPorNome(string nome)
    {
        int indice = EncontrarContatoPorNome(nome);

        if (indice != -1)
        {
            ImprimirContato(contatos[indice]);
        }
        else
        {
            Console.WriteLine("Contato não encontrado.");
        }
    }

    public void BuscarContatoPorCelular(string celular)
    {
        int indice = EncontrarContatoPorCelular(celular);

        if (indice != -1)
        {
            ImprimirContato(contatos[indice]);
        }
        else
        {
            Console.WriteLine("Contato não encontrado.");
        }
    }

    public void ImprimirTodosContatos()
    {
        if (quantidadeContatos > 0)
        {
            Console.WriteLine("Lista de contatos:");

            for (int i = 0; i < quantidadeContatos; i++)
            {
                ImprimirContato(contatos[i]);
                Console.WriteLine();
            }
        }
        else
        {
            Console.WriteLine("A agenda está vazia. Não há contatos cadastrados.");
        }
    }

    private int EncontrarContatoPorNome(string nome)
    {
        for (int i = 0; i < quantidadeContatos; i++)
        {
            if (contatos[i].nome.Equals(nome, StringComparison.OrdinalIgnoreCase))
            {
                return i;
            }
        }

        return -1;
    }

    private int EncontrarContatoPorCelular(string celular)
    {
        for (int i = 0; i < quantidadeContatos; i++)
        {
            if (contatos[i].celular.Equals(celular))
            {
                return i;
            }
        }

        return -1;
    }

    private void ImprimirContato(Contato contato)
    {
        Console.WriteLine("Nome: " + contato.nome);
        Console.WriteLine("Telefone: " + contato.telefone);
        Console.WriteLine("Celular: " + contato.celular);
        Console.WriteLine("E-mail: " + contato.email);
        Console.WriteLine("Data de aniversário: " + contato.dataAniversario);
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        AgendaTelefonica agenda = new AgendaTelefonica(5);
        int opcao = 0;
        while (opcao != 6)
        {
            Console.WriteLine("Escolha uma opção:");
            Console.WriteLine("1 - Cadastrar contato");
            Console.WriteLine("2 - Editar contato");
            Console.WriteLine("3 - Remover contato");
            Console.WriteLine("4 - Buscar contato por nome");
            Console.WriteLine("5 - Buscar contato por celular");
            Console.WriteLine("6 - Sair");
            opcao = int.Parse(Console.ReadLine());

            switch (opcao)
            {
                case 1:
                    agenda.CadastrarContato();
                    break;
                case 2:
                    Console.WriteLine("Nome do contato a ser editado:");
                    string nomeEditar = Console.ReadLine();
                    agenda.EditarContato(nomeEditar);
                    break;
                case 3:
                    Console.WriteLine("Nome do contato a ser removido:");
                    string nomeRemover = Console.ReadLine();
                    agenda.RemoverContato(nomeRemover);
                    break;
                case 4:
                    Console.WriteLine("Nome do contato a ser buscado:");
                    string nomeBuscar = Console.ReadLine();
                    agenda.BuscarContatoPorNome(nomeBuscar);
                    break;
                case 5:
                    Console.WriteLine("Número do celular a ser buscado:");
                    string celularBuscar = Console.ReadLine();
                    agenda.BuscarContatoPorCelular(celularBuscar);
                    break;
                case 6:
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