import javax.swing.JOptionPane;

public class Armadilha extends ElementoBasico{
    
    public Armadilha(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
    super(id, "Floor.png", linInicial, colInicial, tabuleiro);
    }


    
    @Override
  public void acao(ElementoBasico outro) {
    Tabuleiro tabuleiro = this.getTabuleiro();               
    System.out.println("morreu");
    JOptionPane.showMessageDialog(null, "Você caiu na armadilha, preste mais atenção", "Morreu", JOptionPane.WARNING_MESSAGE);
    //tabuleiro.setVisible(false);
    System.exit(ABORT);
    }
  }


