public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 12345, 11.5);
        aluno1.exibirInformacoes();

        System.out.println("-----------------------------");
        AlunoGraduacao alunoGrad = new AlunoGraduacao("Maria", 54321, 8.0);
        AlunoPosGraduacao alunoPosGrad = new AlunoPosGraduacao("Carlos", 67890, 8.0);
        System.out.println("Média do aluno de graduação: " + alunoGrad.calcularMedia());
        System.out.println("Média do aluno de pós-graduação: " + alunoPosGrad.calcularMedia());
    }
}
