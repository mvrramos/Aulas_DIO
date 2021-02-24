using System;

namespace DIO{
    class Program{
        static void Main(string[] args){

            Aluno[] alunos = new Aluno[5];
            var indiceAluno = 0;
            string opcao = ObterOpcao();
            

            while (opcao.ToUpper() != "X"){
                switch (opcao){
                    case "1":
                        Console.WriteLine("informe o nome do aluno: ");
                        var aluno = new Aluno();
                        aluno.Nome = Console.ReadLine();

                        Console.WriteLine("informe a nota do aluno: ");

                        if (decimal.TryParse(Console.ReadLine(), out decimal nota)){
                            aluno.Nota = nota;
                        }else{
                            throw new ArgumentException("A nota deve ser em decimal: ");
                        }

                        alunos[indiceAluno] = aluno; 
                        indiceAluno++;

                        break;

                    case "2":
                        foreach (var a in alunos){
                            Console.WriteLine($"Aluno: {a.Nome} - Nota: {a.Nota}");
                            if (!string.IsNullOrEmpty(a.Nome)){
                                Console.WriteLine($"Aluno: {a.Nome} - Nota: {a.Nota}");
                            }
                        }
                        
                        break;

                    case "3":
                        decimal notaTotal = 0;
                        var numAlunos = 0;

                        for (int i = 0; i < alunos.Length; i++){
                            if (!string.IsNullOrEmpty(alunos[i].Nome)){
                                notaTotal = notaTotal + alunos[i].Nota;
                                numAlunos++;
                            }
                        }

                        var mediaGeral = notaTotal/numAlunos;
                        Console.WriteLine($"Média:{mediaGeral}"); 
                        break;

                    default:
                        throw new ArgumentOutOfRangeException();
                }
                
                opcao = ObterOpcao();
            }
        }

        private static string ObterOpcao(){
            Console.WriteLine("Digite a opção desejada");
            Console.WriteLine("1 - Inserir novo aluno");
            Console.WriteLine("2 - Listar alunos");
            Console.WriteLine("3 - Calcular média geral");
            Console.WriteLine("X - Sair\n");
            Console.WriteLine(" ");

            string opcao = Console.ReadLine();
            return opcao;
        }

    }
}
