package POO.Empresa;

public class Escritorio {
    public static void main(String[] args) {
        Aprendiz apr = new Aprendiz("Cláudio", "123.456.789-98", 3000,6);
        Gerente gr = new Gerente("Rogério", "456.789.123-88", 10000, 2000);


        apr.apresentar();
        System.out.println();
        gr.apresentar();
    }
}
