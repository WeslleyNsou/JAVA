public class Cachorro extends Animal implements Treinavel {
    @Override
    public void falar() {
        System.out.println("O cachorro late.");
    }

    @Override
    public void excutarComando(String comando) {
        System.out.println("O cachorro executa o comando: " + comando);
    }
    
}
  