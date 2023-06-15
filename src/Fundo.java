public class Fundo extends ElementoBasico {

    public Fundo(String id, String iconPath, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, iconPath, linInicial, colInicial, tabuleiro);

    }

    @Override
    public void acao(ElementoBasico outro) {
        throw new UnsupportedOperationException("Unimplemented method 'acao'");
    }
}
