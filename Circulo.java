public class Circulo {

        // Atributo
        private double raio; // Declara o atributo raio, que armazena o raio do círculo. É private para proteger o dado (encapsulamento).

        // Construtor
        public Circulo(double raio) {
            this.raio = raio;
        }

        // Método para calcular a área
        public double calcularArea() {
            return Math.PI * raio * raio; // O Math.PI fornece o valor de π com precisão.
        }

        // Getter (opcional)
        public double getRaio() { // getter , usado caso você queira acessar o valor do raio fora da classe.
            return raio;
        }
    }

