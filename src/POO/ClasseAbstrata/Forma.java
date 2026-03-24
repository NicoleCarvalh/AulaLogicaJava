package POO.ClasseAbstrata;

public abstract class Forma {

    // Metodo abstrato: sem corpo
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // Metodo concreto: com corpo
    public void descrever(){
        System.out.printf("Área: %.2f, Perímetro: %.2f %n", calcularArea(), calcularPerimetro());
    }
}
