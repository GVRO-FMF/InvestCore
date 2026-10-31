import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a ser investido: ");
        double valueInvestment = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o prazo em meses: ");
        int term = Integer.parseInt(scanner.nextLine());

        double amount = calcularMontante(valueInvestment, term);

        System.out.printf("Montante final: R$ %.2f%n", amount);

        scanner.close();
    }

    public static double calcularMontante(double valueInvestment, int term) {
        double interestRate = 0.12;

        return valueInvestment * Math.pow(1 + interestRate, term / 12.0);
    }
}
