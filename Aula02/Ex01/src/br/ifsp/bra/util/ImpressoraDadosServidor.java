package br.ifsp.bra.util;

import br.ifsp.bra.servidor.*;

public class ImpressoraDadosServidor {

    public void imprimir(Professor professor) {
        System.out.println("Professor: " + professor.getNome() +
                           ", Disciplina: " + professor.getDisciplina());
    }

    public void imprimir(Aluno aluno) {
        System.out.println("Aluno: " + aluno.getNome() +
                           ", Curso: " + aluno.getCurso());
    }

    public void imprimir(Tecnico tecnico) {
        System.out.println("Tecnico: " + tecnico.getNome() +
                           ", Area: " + tecnico.getArea());
    }
}