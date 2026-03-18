public class AlunoPosGraduacao extends Aluno implements Avaliacao {
   public AlunoPosGraduacao(String nome, int idade, double nota) {
        super(nome, idade, nota);
    }

    @Override
    public double calcularMedia() {
        return getNota() * 1.0;
    }
}
