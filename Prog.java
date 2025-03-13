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

        System.out.println("\nGostaria que eu montasse um treino para você de acordo com seu IMC?");
        String resposta =scanner.next();
        if (resposta.equalsIgnoreCase("sim")) {
            

        }
        scanner.close();

    }   
}
 class grupomusc {
     
    String peito1 = "Supino-Reto Supino-Inclinado Crucifixo-Máquina";
    String peito2 = "Crossover Pull-Over Supino-Máquina";
    String peito3 = "Peck-Deck Supino-Declinado Dips";
    String quadriceps1 = "Agachamento-Livre Leg-Press Extensora";
    String quadriceps2 = "Hack Afundo Cadeira-Adutora LegPress-Horizontal";
    String quadriceps3 = "Agachamento-Sumo Agachamento-Bulgaro Agachamento Terra";
    String costas1 = "Puxada-Frontal Cavalinho Remada-Baixa";
    String costas2 = "Terra Serrote Face-Pull";
    String costas3 = "Barra-Fixa Puxada-Supinada Remada-Unilateral-de-Joelhos";
    String posterior1 = "Cadeira-Flexora Stiff Cadeira-Abdutora";
    String posterior2 = "Mesa-Flexora Elevação-Pelvica Flexão-de-Pernas-em-Pé";
    String posterior3 = "Hiperextensão-Lombar Terra Búlgaro";
    String ombro1 = "Desenvolvimento Elevação-Lateral Elevação-Frontal";
    String ombro2 = "Crucifixo-inverso Arnold-Press Puxada-Cabo";
    String ombro3 = "Encolhimento-Barra Encolhimento-Halteres Encolhimento-Sentado";
    String biceps1 = "Rosca-Direta Rosca-Neutra Banco-Scott";
    String biceps2 = "Rosca-W Rosca-Banco-Inclinado Rosca-Inversa";
    String biceps3 = "Rosca-Neutra-Corda Rosca-Alternada Rosca-21";
    String triceps1 = "Triceps-Polia Triceps-Corda Triceps-Testa";
    String triceps2 = "Pushdown-V Mergulho Dip";
    String triceps3 = "Triceps-maquina Triceps-Frances Triceps-X-Polia";
    String panturrilha = "Panturrilha-Sentado Panturrilha-Hack Panturrilha-em-Pé Panturrilha-LegPress";
}