import br.ifsp.bra.servidor.*;
import br.ifsp.bra.util.ImpressoraDadosServidor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImpressoraDadosServidor impressora = new ImpressoraDadosServidor();

        System.out.println("_____ Menu _____");
        System.out.println("1 - Criar Professor");
        System.out.println("2 - Criar Aluno");
        System.out.println("3 - Criar Técnico");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Nome do professor: ");
                String nomeProf = sc.nextLine();
                System.out.print("Disciplina: ");
                String disc = sc.nextLine();
                Professor p = new Professor(nomeProf, disc);
                impressora.imprimir(p);
                break;

            case 2:
                System.out.print("Nome do aluno: ");
                String nomeAluno = sc.nextLine();
                System.out.print("Curso: ");
                String curso = sc.nextLine();
                Aluno a = new Aluno(nomeAluno, curso);
                impressora.imprimir(a);
                break;

            case 3:
                System.out.print("Nome do técnico: ");
                String nomeTec = sc.nextLine();
                System.out.print("Area: ");
                String area = sc.nextLine();
                Tecnico t = new Tecnico(nomeTec, area);
                impressora.imprimir(t);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}