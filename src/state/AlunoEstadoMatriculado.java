/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ice
 */
public class AlunoEstadoMatriculado implements AlunoEstado{

    @Override
    public void matricular(Aluno aluno) {
        return ;
    }

    @Override
    public void jubilar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoJubilado());
    }

    @Override
    public void trancar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoTrancado());
    }

    @Override
    public void evadir(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoEvadido());
    }

    @Override
    public void formar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoFormado());
    }

    @Override
    public String getNomeEstado() {
        return "MATRICULADO";
    }
    
}
