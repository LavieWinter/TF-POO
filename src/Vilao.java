import javax.swing.JOptionPane;
import java.util.Random;

public class Vilao extends ElementoBasico {
  private ElementoBasico ant;

  public Vilao(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
    super(id, "Vilao.png", linInicial, colInicial, tabuleiro);
  }

  public void setAnt(ElementoBasico ant) {
    this.ant = ant;
  }

  public ElementoBasico getAnterior() {
    return ant;
  }

  public void moveDireita() {
    // Remove o Personagem da posicao atual e avança
    getTabuleiro().insereElemento(ant);
    this.incCol();
    // Verifica se tem algum elemento de interesse na nova posicao
    // e interage de acordo
    ElementoBasico elemento = getTabuleiro().getElementoNaPosicao(this.getLin(), this.getCol());
    if (!(elemento instanceof Fundo)) {
      this.decCol();
      this.ant = getTabuleiro().insereElemento(this);
      if (elemento instanceof Personagem) {
        this.acao(elemento);
      }

    } else {
      this.ant = getTabuleiro().insereElemento(this);
    }
  }

  public void moveEsquerda() {
    // Remove o Personagem da posicao atual e avança
    getTabuleiro().insereElemento(ant);
    this.decCol();
    // Verifica se tem algum elemento de interesse na nova posicao
    // e interage de acordo
    ElementoBasico elemento = getTabuleiro().getElementoNaPosicao(this.getLin(), this.getCol());
    if (!(elemento instanceof Fundo)) {
      this.incCol();
      this.ant = getTabuleiro().insereElemento(this);
      if (elemento instanceof Personagem) {
        this.acao(elemento);
      }
    } else {
      this.ant = getTabuleiro().insereElemento(this);
    }
  }

  public void moveCima() {
    // Remove o Personagem da posicao atual e avança
    getTabuleiro().insereElemento(ant);
    this.decLin();
    // Verifica se tem algum elemento de interesse na nova posicao
    // e interage de acordo
    ElementoBasico elemento = getTabuleiro().getElementoNaPosicao(this.getLin(), this.getCol());
    if (!(elemento instanceof Fundo)) {
      this.incLin();
      this.ant = getTabuleiro().insereElemento(this);
      if (elemento instanceof Personagem) {
        this.acao(elemento);
      }

    } else {
      this.ant = getTabuleiro().insereElemento(this);
    }
  }

  public void moveBaixo() {
    // Remove o Personagem da posicao atual e avança
    getTabuleiro().insereElemento(ant);
    this.incLin();
    // Verifica se tem algum elemento de interesse na nova posicao
    // e interage de acordo
    ElementoBasico elemento = getTabuleiro().getElementoNaPosicao(this.getLin(), this.getCol());
    if (!(elemento instanceof Fundo)) {
      this.decLin();
      this.ant = getTabuleiro().insereElemento(this);
      if (elemento instanceof Personagem) {
        this.acao(elemento);
      }
    } else {
      this.ant = getTabuleiro().insereElemento(this);
    }
  }

  public void Move() {
    Random random = new Random();
    int numeroAleatorio = random.nextInt(4);

    switch (numeroAleatorio) {
      case 0:
        this.moveDireita();
        break;
      case 1:
        this.moveEsquerda();
        break;
      case 2:
        this.moveCima();
        break;
      case 3:
        this.moveBaixo();
        break;
    }
  }

  @Override
  public void acao(ElementoBasico outro) {
    Tabuleiro tabuleiro = this.getTabuleiro();
    Personagem personagem = tabuleiro.getPrincipal();
    if (personagem.getEspada()) {
      System.out.println("Matou");
      tabuleiro.setVilao(null);
      tabuleiro.insereElemento(new Fundo("Restos", "ossos.png", getLin(), getCol(), this.getTabuleiro()));
    } else {
      // Se não tiver a espada ele morre. Printar no centro em branco que o personagem
      // morreu
      System.out.println("morreu");
      JOptionPane.showMessageDialog(null, "Você foi derrotado", "Morreu", JOptionPane.WARNING_MESSAGE);
      tabuleiro.setVisible(false);
    }
  }
}
