// Felipe Sanches Venancio 251670
// Eduardo Moraes de Almeida 251255
// Guilherme Rodrigues Pereira de Oliveira 251215

import java.util.Scanner;

    public class Ac2 {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in); 

            double mediaAprovacao = 0.0;
            while(mediaAprovacao < 3){

                System.out.println("Digite a nota mínima (não pode ser menor que 3):");
                mediaAprovacao = scn.nextDouble();
                if (mediaAprovacao >= 3){
                    break;
                }
                System.out.println("Média mínima inválida...");
                System.out.println("Digite uma média de no mínimo 3!");
                

            }

            System.out.println("Digite o peso da avaliação 1:");
            double peso1 = scn.nextDouble();
            System.out.println("Digite o peso da avaliação 2:");
            double peso2 = scn.nextDouble();
            System.out.println("Digite o peso da avaliação 3:");
            double peso3 = scn.nextDouble();
            System.out.println("Digite o peso da avaliação 4:");
            double peso4 = scn.nextDouble();

            System.out.println("Qual o tamanho da turma?");
            int numDeAlunos = scn.nextInt();

            String[] listaAlunos = new String[numDeAlunos];
            double[] listaMedias = new double[numDeAlunos];
            String nomeDoAluno, entrada = " ";
            char escolha = 's';
            double nota1, nota2, nota3, nota4, mediaAluno, notaMaxima = 0;
            int i = 0;

            double numDeReprovados = 0.0;
            double numDeRecuperacao = 0.0;
            double numDeAprovadosCom5 = 0.0;
            double numDeAprovados = 0.0;
            double numDeExcelencia = 0.0;

            while(i < numDeAlunos && escolha == 's'){
                System.out.println("Nome do aluno:");
                nomeDoAluno = scn.next();
                listaAlunos[i] = nomeDoAluno;
                

                System.out.println("Digite a nota  da avaliação 1:");
                nota1 = scn.nextDouble();
                System.out.println("Digite a nota da avaliação 2:");
                nota2 = scn.nextDouble();
                System.out.println("Digite a nota  da avaliação 3:");
                nota3 = scn.nextDouble();
                System.out.println("Digite a nota da avaliação 4:");
                nota4 = scn.nextDouble();

                mediaAluno = (peso1 * nota1) + (peso2 * nota2) + (peso3 * nota3) + (peso4 * nota4);
                listaMedias[i] = mediaAluno;

                System.out.println("prova 1: " + "  peso : " + peso1 + "  nota: " + nota1);  
                System.out.println("prova 2: " + "  peso : " + peso2 + "  nota: " + nota2);
                System.out.println("prova 3: " + "  peso : " + peso3 + "  nota: " + nota3);
                System.out.println("prova 4: " + "  peso : " + peso4 + "  nota: " + nota4);
                

                notaMaxima = 10 * (peso1 + peso2 + peso3 + peso4);

                if(mediaAprovacao - 2 >= mediaAluno){
                    System.out.println("  Você esta REPROVADO!");
                    numDeReprovados++;
                }
                else if(mediaAprovacao > mediaAluno){
                    System.out.println("  Você está de RECUPERAÇÃO!");
                    numDeRecuperacao++;
                }   
                else if(mediaAluno == mediaAprovacao){
                    System.out.println("  UFAAAAAAAA... essa foi por pouco, APROVADO!");
                    numDeAprovadosCom5++;
                }
                else if(mediaAluno > mediaAprovacao && mediaAluno != notaMaxima){
                    System.out.println("  APROVADO!");
                    numDeAprovados++;
                }
                else if(mediaAluno == notaMaxima){
                    System.out.println(" APROVADO COM EXCELÊNCIA");
                    numDeExcelencia++;
                } 
                
                i++;


                if(numDeAlunos != i ){
                    System.out.println("Deseja fazer um novo calculo ? sim 's' ou nao 'n': ");
                    entrada = scn.next().toLowerCase();
                    escolha = entrada.charAt(0);

                    if(escolha != 's'){
                        numDeAlunos = 0;
                        System.out.println("Ok saindo...");
                    }
                }
                
                
            }
            double somatoria = 0;

            for(int j = 0; j < listaAlunos.length; j++){
                System.out.printf("\n O aluno: %s tem média igual a: %.2f \n", listaAlunos[j], listaMedias[j]);
                somatoria += listaMedias[j];
                
            }
            double mediaTurma = somatoria / listaAlunos.length;

            double porcentagemAprovados = (numDeAprovados + numDeAprovadosCom5 + numDeExcelencia) * 100 / listaAlunos.length;
            double porcentagemReprovados = numDeReprovados  * 100 / listaAlunos.length;
            double porcentagemRecuperacao = numDeRecuperacao  * 100 / listaAlunos.length;

            if(numDeAlunos != listaAlunos.length){
                System.out.println(" Turma incompleta!");
            }
            else if(numDeAlunos == listaAlunos.length){

                System.out.printf("\nMedia da turma: %.2f", mediaTurma);
                System.out.printf("\nA porcentagem de aprovados é: %.2f%%\n", porcentagemAprovados);
                System.out.printf("\nA porcentagem de recuperação é: %.2f%%\n", porcentagemRecuperacao);
                System.out.printf("\nA porcentagem de reprovados é: %.2f%%\n", porcentagemReprovados);

            }
            scn.close();
        }
    
    }