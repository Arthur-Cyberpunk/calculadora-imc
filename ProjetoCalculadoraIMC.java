public class ProjetoCalculadoraIMC {

    double peso;
    double altura;

    public ProjetoCalculadoraIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {

        ProjetoCalculadoraIMC pessoa = new ProjetoCalculadoraIMC(67, 1.65);

        double imc = pessoa.calcularIMC();

        System.out.printf("Seu IMC é: %.2f%n", imc);
    }
}