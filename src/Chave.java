import javax.swing.JOptionPane;

public class Chave extends ElementoBasico{
    public Chave(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "Key.png", linInicial, colInicial, tabuleiro);
    }

    @Override
    public void acao(ElementoBasico outro) {
        Tabuleiro tabuleiro = this.getTabuleiro();
        Personagem personagem = tabuleiro.getPrincipal();
        personagem.setChave(true);
        JOptionPane.showMessageDialog(null, "Você adquiriu uma chave", "Novo item", JOptionPane.WARNING_MESSAGE);
        tabuleiro.insereElemento(new Fundo("Fundo",getLin(),getCol(),this.getTabuleiro()));
        System.out.println("chave" + personagem.getChave());
    }
}
