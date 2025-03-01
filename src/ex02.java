
import java.util.Scanner;
public class ex02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.print("Me diga a sua altura");
        Double altura = scanner.nextDouble();

        System.out.print("Me diga o seu peso");
        Double peso = scanner.nextDouble();

        Double IMC = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f", IMC);

    }

}
