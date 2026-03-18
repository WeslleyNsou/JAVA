public class AlunoGraduacao extends Aluno implements Avaliacao{
    public AlunoGraduacao(String nome, int idade, double nota) {
        super(nome, idade, nota);
    }

    @Override
    public double calcularMedia() {
        return getNota() * 1.0;
    }
}
