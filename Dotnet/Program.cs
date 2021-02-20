using System;

namespace DIO{
    class Program{
        static void Main(string[] args){
            Console.WriteLine("Digite a opção desejada");
            Console.WriteLine("1 - Inserir novo aluno");
            Console.WriteLine("2 - Listar alunos");
            Console.WriteLine("3 - Calcular média geral");
            Console.WriteLine("X - Sair\n");
            Console.WriteLine(" ");

            string opcaoUsuario = Console.ReadLine();

            while (opcaoUsuario.ToUpper() != "X"){
                switch (opcaoUsuario){
                    case "1":

                        break;
            
                    case "2":
                    
                        break;

                    case "3":
                    
                        break;

                    default:
                        throw new ArgumentOutOfRangeException();
                }
            }
            
            Console.WriteLine("Digite a opção desejada");
            Console.WriteLine("1 - Inserir novo aluno");
            Console.WriteLine("2 - Listar alunos");
            Console.WriteLine("3 - Calcular média geral");
            Console.WriteLine("X - Sair\n");
            Console.WriteLine(" ");
        }
    }
}
