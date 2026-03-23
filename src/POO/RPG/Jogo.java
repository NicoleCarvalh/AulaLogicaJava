package POO.RPG;

public class Jogo {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Alex", false);
        Mago m = new Mago("Claudio");

        g.apresentar();
        m.apresentar();

        System.out.println();
        System.out.println("====== BATALHA ======");

        do {
            m.atacar(g);

            if (g.getVida() <= 0){
                break;
            }

            g.atacar(m);
        } while(g.getVida() > 0 && m.getVida() > 0);

    }
}
