
public class Eca extends ElementoBasico {

    public Eca(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "wall.png", linInicial, colInicial, tabuleiro);
    }

    @Override
    public void acao(ElementoBasico outro) {

    }
}
