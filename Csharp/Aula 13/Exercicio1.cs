// /*Faça um método que receba e preencha um vetor com as notas de uma turma de
// 10 alunos. Faça um outro método que receba um vetor preenchido com as notas,
// calcule a média da turma e conte quantos alunos obtiveram nota acima da média.
// Esse método deve exibir a média e o resultado da contagem. Faça um programa
// que declare as devidas variáveis e acione os métodos.*/

// using System;

// public class Program
// {
//     public static void preencheNotas(double[] notas)
//     {
//         Console.WriteLine("Informe as notas: ");
//         for (int i = 0; i < notas.Length; i++)
//         {
//             Console.WriteLine("Valor: ");
//             notas[i] = double.Parse(Console.ReadLine());
//         }
//     }

//     public static double mediaNotas(double[] notas)
//     {
//         int soma = 0;
//         Console.WriteLine("Notas digitadas: ");
//         for (int i = 0; i < notas.Length; i++)
//         {
//             Console.Write(notas[i] + " ");
//         }

//         for (int j = 0; j < notas.Length; j++)
//         {
//             soma += j;
//         }
//         double media = soma / notas.Length;


//         return media;
//     }

//     public static double acimaMedia(double[] notas, double media)
//     {
//         int contador = 0;
//         for (int i = 0; i < notas.Length; i++)
//         {
//             if (notas[i] > media)
//             {
//                 contador++;
//             }
//         }
//         return contador;
//     }

//     public static void Main(string[] args)
//     {
//         double[] notas = new double[10];
//         preencheNotas(notas);
//         double media = mediaNotas(notas);
//         double numeroAcimaMedia = acimaMedia(notas, media);

//         Console.WriteLine("\n Média: " + media);
//         Console.WriteLine("Quantidade de alunos acima da média: " + numeroAcimaMedia);
//     }
// }
