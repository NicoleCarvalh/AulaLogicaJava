package POO.RPG;

public class Personagem {
    private String nome;
    private int vida;
    private int dano;

    public Personagem(){

    }

    public Personagem(String nome, int vida, int dano){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void apresentar(){
        System.out.println("Nome: " + nome + " | HP: " + vida + " | Dano: " + dano);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public void atacar(Personagem alvo){
        System.out.println(getNome() + " ataca " + alvo.getNome());
        alvo.receberDano(getDano());
    }

    public void receberDano(int danoRecebido){
        if(danoRecebido >= vida){
            System.out.println("Golpe muito forte. " + nome + " morreu.");
            vida = 0;
        } else {
            vida-= danoRecebido;
            System.out.println(nome + " recebeu " + danoRecebido + " de dano, vida restante: " + vida);
        }
    }
}
