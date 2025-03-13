import java.util.Scanner;
public class Prog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao montador de treino");

        System.out.println("Digite seu peso(kg): ");
        if (!scanner.hasNextDouble()){
            System.out.println("Por favor digite um valor válido para o peso. (Por exemplo: 70)");
            return;
        } double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura(m): ");
        if (!scanner.hasNextDouble()){
            System.out.println("Digite um valor válido para sua altura.(Por exemplo: 1,70)");
            return;
        } double altura = scanner.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser maior que zero.");
            return;
        }
        double imc = peso / (altura * altura);

        System.out.printf("\nSeu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 39.9) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III (mórbida)");
        }

        
        scanner.close();

    }   
}