public class Fundo extends ElementoBasico{

    public Fundo(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "floor.png", linInicial, colInicial, tabuleiro);
        
    }

    @Override
    public void acao(ElementoBasico outro) {
        throw new UnsupportedOperationException("Unimplemented method 'acao'");
    }
}
