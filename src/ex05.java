import java.util.Random;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Me diga um número de 1 a 5");
        int escolha = scanner.nextInt();

        int n = random.nextInt(5) + 1;

        if(escolha != n) {

            System.out.println("Você errou! O número escolhido seria " + n);
        } else {

            System.out.println("Você acertou! O número escolhido seria " + n);

        }

    }

}