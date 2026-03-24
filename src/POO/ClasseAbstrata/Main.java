package POO.ClasseAbstrata;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);

        Retangulo r = new Retangulo(4,6);

        c.descrever();
        r.descrever();
    }
}
