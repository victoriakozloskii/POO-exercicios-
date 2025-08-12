
public class app4 {
    public static void main(String[] args) {

        // criando 5 objetos circulo com diferentes

        Circulo c1 = new Circulo(2.0);
        Circulo c2 = new Circulo(3.5);
        Circulo c3 = new Circulo(1.0);
        Circulo c4 = new Circulo(4.25);
        Circulo c5 = new Circulo(5.0);

        System.out.println("Área do círculo 1: " + c1.calcularArea());
        System.out.println("Área do círculo 2: " + c2.calcularArea());
        System.out.println("Área do círculo 3: " + c3.calcularArea());
        System.out.println("Área do círculo 4: " + c4.calcularArea());
        System.out.println("Área do círculo 5: " + c5.calcularArea());



    }
}