/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class AlunoEstadoTrancado implements AlunoEstado {

    @Override
    public void matricular(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoMatriculado());
    }

    @Override
    public void jubilar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoJubilado());
    }

    @Override
    public void trancar(Aluno aluno) {
        return;
    }

    @Override
    public void evadir(Aluno aluno) {
        return;
    }

    @Override
    public void formar(Aluno aluno) {
        return;
    }

    @Override
    public String getNomeEstado() {
        return "TRANCADO";
    }

}
