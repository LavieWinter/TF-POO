import javax.swing.JOptionPane;

public class Porta extends ElementoBasico {
    public Porta(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "Porta.png", linInicial, colInicial, tabuleiro);
    }

    @Override
    public void acao(ElementoBasico outro) {
        Tabuleiro tabuleiro = this.getTabuleiro();
        Personagem personagem = tabuleiro.getPrincipal();
        if(personagem.getChave()){
            JOptionPane.showMessageDialog(null, "Parabéns!! Você Escapou", "Vitória!!!", JOptionPane.INFORMATION_MESSAGE);
            tabuleiro.setVisible(false);
        }
    }

}
