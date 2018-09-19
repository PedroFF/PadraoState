package state;

public interface AlunoEstado {

    public void matricular(Aluno aluno);
    public void jubilar(Aluno aluno);
    public void trancar(Aluno aluno); 
    public void evadir(Aluno aluno);
    public void formar(Aluno aluno);
    public String getNomeEstado();
    
}
