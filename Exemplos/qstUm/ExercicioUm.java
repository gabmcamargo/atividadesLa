import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "";
        int horas, valor, salario;
        System.out.printf("Informe seu nome:");
        nome = input.next();
        System.out.printf("Informe o número de horas trabalhadas:");
        horas = input.nextInt();
        System.out.printf("Informe o valor pago por hora:");
        valor = input.nextInt();
        int valorTotal = (horas * valor);
        System.out.println("O valor total recebido é:" +valorTotal);
    }
}
