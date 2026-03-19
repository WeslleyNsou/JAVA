
public abstract class OperacaoMatematica {
    public abstract double calcular(double a, double b) throws Exception;
    
}

class Soma extends OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }

}

class Divisao extends OperacaoMatematica {

    @Override
    public double calcular(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception(DivisaoPorZeroException.MSG);
        }
        return a / b;
    }
    
}

class DivisaoPorZeroException extends Exception {
    public static final String MSG = "Não é possível dividir por zero.";
    
    public DivisaoPorZeroException() {
        super(MSG);
    }
}

class Principal {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica divisao = new Divisao();
        
        try {
            double resultadoSoma = soma.calcular(5, 3);
            System.out.println("Resultado da soma: " + resultadoSoma);
            
            double resultadoDivisao = divisao.calcular(10, 0);
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    
}