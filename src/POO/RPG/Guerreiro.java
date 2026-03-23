package POO.RPG;

public class Guerreiro extends Personagem{
    boolean estaComEscudo;

    public Guerreiro(String nome, boolean estaComEscudo) {
        super(nome, 100, 50);
        this.estaComEscudo = estaComEscudo;
    }

    public void usarEscudo(){
        estaComEscudo = true;
        System.out.println(getNome() + " está com o escudo ativado");
    }

    @Override
    public void receberDano(int danoRecebido) {
        if(estaComEscudo){
            System.out.println(getNome() + " está com escudo. Nenhum dano foi recebido, vida atual: " + getVida());
            estaComEscudo = false;
        } else {
            super.receberDano(danoRecebido);
        }



    }
}
