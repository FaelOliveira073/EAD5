public class infighter extends lutador {

    public infighter() {
        super("Punch Up", 300, 30, 50, 10);

    }

    @Override
    public void atacar(lutador inimigo) {
        System.out.println("Punch Up desferiu um soco pesado!");

        int dano = this.getForca();
        inimigo.setVida(inimigo.getVida() - dano);

        reduzirVelocidadeInimigo(inimigo);

        System.out.println("Dano causado: " + dano);
    }

    @Override
    public void especial(lutador inimigo) {
        System.out.println("Punch Up usou seu golpe especial: UPPERCUT DEMOLIDOR!");

        if (this.getEnergia() < 30) {
            System.out.println("Energia insuficiente para golpe especial!");
            return;
        }

        int dano = this.getForca() * 2;
        this.setEnergia(this.getEnergia() - 30);

        inimigo.setVida(inimigo.getVida() - dano);

        reduzirVelocidadeInimigo(inimigo);

        System.out.println("Dano MASSIVO causado: " + dano);
    }

    @Override
    public void defender() {
        System.out.println("Punch Up resistiu ao golpe e recuperou energia!");

        this.setEnergia(this.getEnergia() + 20);

        System.out.println("Energia atual: " + this.getEnergia());
    }


    private void reduzirVelocidadeInimigo(lutador inimigo) {
        int novaVelocidade = inimigo.getVelocidade() - 2;

        if (novaVelocidade < 1) {
            novaVelocidade = 1;
        }

        inimigo.setVelocidade(novaVelocidade);

        System.out.println("HABILIDADE PASSIVA: Velocidade do inimigo reduzida para " + novaVelocidade);
    }

    @Override
    public void mostrarStatus() {
        System.out.println("=== STATUS DO INFIGHTER ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Energia: " + getEnergia());
        System.out.println("Força: " + getForca());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("============================");
    }
}
