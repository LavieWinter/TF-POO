import javax.swing.JOptionPane;

public class Vilao extends ElementoBasico {
    public Vilao(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "Vilao.png", linInicial, colInicial, tabuleiro);
    }

    @Override
    public void acao(ElementoBasico outro) {
        Tabuleiro tabuleiro = this.getTabuleiro();
        Personagem personagem = tabuleiro.getPrincipal();
        if(personagem.getEspada()){
          System.out.println("Matou");
          tabuleiro.insereElemento(new Fundo("Fundo",getLin(),getCol(),this.getTabuleiro()));
        }
        else{
          // Se não tiver a espada ele morre. Printar no centro em branco que o personagem morreu
          System.out.println("morreu");
          JOptionPane.showMessageDialog(null, "Se fodeu!", "Wasted!", JOptionPane.WARNING_MESSAGE);
          tabuleiro.setVisible(false);
        }
    }
}
