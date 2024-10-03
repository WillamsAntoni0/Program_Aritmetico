import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Declaração de variáveis
        float materia1, materia2, materia3, materia4, materia5;
        int aprovados = 0, reprovados = 0;
        int numAlunos;

        // Cria um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Pergunta quantos alunos serão avaliados
        System.out.print("Informe o número de alunos a serem avaliados: ");
        numAlunos = scanner.nextInt();
        
        for (int i = 1; i <= numAlunos; i++) {
            // Entrada de dados
            System.out.println("\nAluno " + i + ":");
            
            System.out.print("Informe a nota da matéria 1: ");
            materia1 = scanner.nextFloat();
            
            System.out.print("Informe a nota da matéria 2: ");
            materia2 = scanner.nextFloat();
            
            System.out.print("Informe a nota da matéria 3: ");
            materia3 = scanner.nextFloat();
            
            System.out.print("Informe a nota da matéria 4: ");
            materia4 = scanner.nextFloat();
            
            System.out.print("Informe a nota da matéria 5: ");
            materia5 = scanner.nextFloat();
            
            // Cálculo da média
            float soma = materia1 + materia2 + materia3 + materia4 + materia5;
            float media = soma / 5;
            System.out.printf("Resultado da média: %.2f\n", media);

            // Verifica se o aluno foi aprovado
            if (media >= 6) {
                System.out.println("Aluno aprovado");
                aprovados++;
            } else {
                System.out.println("Aluno reprovado");
                reprovados++;
            }
        }
        
        // Exibe o número de alunos aprovados e reprovados
        System.out.println("\nTotal de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos reprovados: " + reprovados);

        // Fecha o scanner
        scanner.close();
    }
}
