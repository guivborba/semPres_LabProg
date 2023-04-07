public class circulo {
    double pi;
    double raio;

    double calcularArea() {
        return pi * (raio * raio);
    }
    double calcularPerimetro(){
        return 2 * pi * raio;
    }
}
