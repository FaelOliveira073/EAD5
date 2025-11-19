public class inimigo extends lutador {

    public inimigo() {
        super("Apollo Creed", 350, 60, 40, 30);
    }

    @Override
    public void atacar(lutador inimigo) {
        System.out.println("Apollo realizou um jab veloz!");

        int dano = this.getForca();
        inimigo.setVida(inimigo.getVida() - dano);

        if (this.getVelocidade() < 30) {
            this.setVelocidade(this.getVelocidade() + 1);
            System.out.println("PASSIVA ATIVADA: velocidade aumentou para " + this.getVelocidade());
        }

        System.out.println("Dano causado: " + dano);
    }

    @Override
    public void especial(lutador inimigo) {
        System.out.println("Apollo usou seu especial: FLURRY COMBO!");

        if (this.getEnergia() < 30) {
            System.out.println("Energia insuficiente!");
            return;
        }

        this.setEnergia(this.getEnergia() - 30);

        int danoTotal = 0;
        for (int i = 0; i < 3; i++) {
            int dano = this.getForca() / 2;
            danoTotal += dano;
        }

        inimigo.setVida(inimigo.getVida() - danoTotal);

        if (this.getVelocidade() < 30) {
            this.setVelocidade(this.getVelocidade() + 1);
        }

        System.out.println("Dano total causado: " + danoTotal);
    }

    @Override
    public void defender() {
        System.out.println("\nApollo adotou uma postura defensiva e recuperou energia!");

        this.setEnergia(this.getEnergia() + 10);

        System.out.println("Energia atual: " + this.getEnergia());
    }

    @Override
    public void mostrarStatus() {
        System.out.println("=== STATUS DO APOLLO CREED ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Energia: " + getEnergia());
        System.out.println("Força: " + getForca());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("================================");
    }

}
