import java.util.Scanner;
import java.util.Random;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int y, tentativas = 3;
        int x = ran.nextInt(11);
        while (tentativas>0) {
            System.out.printf("Informe um numero");
            y = input.nextInt();
            if (x == y) {
                System.out.println("Acertou!");
                tentativas = 0;
            }else {
                --tentativas;
                System.out.println("Errou!");
            }
        }
        System.out.printf("O número era: %d \n", x);
    }
}
