/*Crie uma classe chamada "Círculo" com um atributo público chamado "raio".
Crie um método chamado "calcularArea" que retorne a área do círculo.
Crie outro método chamado "calcularPerimetro" que retorne o perímetro do círculo.*/
public class Main {
    public static void main(String[] args) {
        circulo circulo1 = new circulo();
        circulo1.pi = 3.14;
        circulo1.raio = 5;
        double area = circulo1.calcularArea();
        double perimetro = circulo1.calcularPerimetro();
        System.out.println("A área do circulo é: " + area);
        System.out.println("O perímetro é: " + String.format("%.2f", perimetro));

    }
}