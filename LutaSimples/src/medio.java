public class medio extends lutador {
    public medio() {
        super("Cesar", 150, 50, 20, 15);
    }
    @Override
    public void atacar(lutador inimigo){
        System.out.println("Cesar desferiu um golpe normalmente normal");
        int dano = this.getForca();
        inimigo.setVida(inimigo.getVida() - dano);

        System.out.println("Dano causado: "+ dano);
    }
@Override
    public void especial(lutador inimigo) {
    System.out.println("Cesar deu seu golpe normalmente especial");

    if (this.getEnergia() < 30){
        System.out.println("Energia insuficiente");
        return;
    }

    int dano = this.getForca() * 2;
    this.setEnergia(this.getEnergia()-30);

    inimigo.setVida(inimigo.getEnergia()-dano);
    System.out.println("Cesar deu um golpe normalmente forte e causou: "+ dano);

}
}