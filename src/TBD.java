public class TBD extends ElementoBasico {

  public TBD(String id, String iconPath, int linInicial, int colInicial, Tabuleiro tabuleiro) {
      super(id, iconPath, linInicial, colInicial, tabuleiro);
  }
  @Override
  public void acao(ElementoBasico outro) {
    String s = String.format("Action: %s (%d, %d)",
                      this.getId(),getLin(), getCol());
      System.out.println(s);
      if(this.getId() == "Espada"){
        this.getTabuleiro().getPrincipal().setEspada(true);
        this.getTabuleiro().insereElemento(new Fundo("Fundo",getLin(),getCol(),this.getTabuleiro()));
      }
      System.out.println(this.getTabuleiro().getPrincipal().getEspada());
  }

  //Personagem deve passar a porta(pré requisito ter a chave)
  //Ação do personagem com a chave 
  //Ação do personagem com a porta(quando obtiver a chave}
  public void acao2(ElementoBasico outro){
      //Pegar chave
  }

  public void acao3(ElementoBasico outro){
    //Abrir a porta com a chave
  }


  //Vilão com ação de morte ao personagem
  //Implemntação por turnos.

  
}