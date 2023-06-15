import javax.swing.JOptionPane;

public class Porta extends ElementoBasico {
    public Porta(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "Porta.png", linInicial, colInicial, tabuleiro);
    }

    @Override
    public void acao(ElementoBasico outro) {
        Tabuleiro tabuleiro = this.getTabuleiro();
        Personagem personagem = tabuleiro.getPrincipal();
        if (personagem.getChave()) {
            JOptionPane.showMessageDialog(null, "Parabéns!! Você passou de fase", "Vitória!!!",
                    JOptionPane.INFORMATION_MESSAGE);
            tabuleiro.loadLevel(2);
            personagem = tabuleiro.getPrincipal();
            personagem.setAnterior(personagem.getAnterior());

        } else {
            JOptionPane.showMessageDialog(null, "Porta Trancada, procure a chave", "Trancado",
                    JOptionPane.INFORMATION_MESSAGE);
            tabuleiro.setVisible(true);
        }
    }

}
