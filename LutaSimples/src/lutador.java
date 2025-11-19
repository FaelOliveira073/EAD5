public abstract class lutador {
        private String nome;
        private int vida;
        private int energia;
        private int forca;
        private int velocidade;


        public lutador(String nome, int vida, int energia, int forca, int velocidade){
                this.nome = nome;
                this.vida= vida;
                this.energia=energia;
                this.forca = forca;
        }
        //get e set
        public String getNome(){
                return this.nome;
        }
        public void setNome(String nome){
                this.nome=nome;
        }

        public int getVida(){
                return this.vida;
        }
        public void setVida(int vida){
                this.vida=vida;
        }

        public int getEnergia(){
                return this.energia;
        }
        public void setEnergia(int energia){
                this.energia=energia;
        }

        public int getForca(){
        return this.forca;
        }
        public void setForca(int forca){
                this.forca=forca;
        }

        public int getVelocidade(){
                return this.velocidade;
        }
        public void setVelocidade(int velocidade){
                this.velocidade=velocidade;
        }

        public abstract void atacar(lutador inimigo);
        public abstract void especial(lutador inimigo);
        public abstract void defender();
        public abstract void mostrarStatus();



}


