import javax.swing.JOptionPane;

public class Espada extends ElementoBasico {

  public Espada(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
    super(id, "Espada.png", linInicial, colInicial, tabuleiro);
  }

  @Override
  public void acao(ElementoBasico outro) {
    String s = String.format("Action: %s (%d, %d)",
        this.getId(), getLin(), getCol());
    System.out.println(s);
    Tabuleiro tabuleiro = this.getTabuleiro();
    Personagem personagem = tabuleiro.getPrincipal();
    if (this.getId() == "Espada") {
      personagem.setEspada(true);
      tabuleiro.insereElemento(new Fundo("Fundo", "floor.png", getLin(), getCol(), this.getTabuleiro()));
      JOptionPane.showMessageDialog(null, "Você adquiriu uma espada", "Novo item", JOptionPane.WARNING_MESSAGE);
    }
    System.out.println(this.getTabuleiro().getPrincipal().getEspada());
  }

}