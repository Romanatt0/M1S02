

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Me diga a nota do seu primeiro trimestre");
        Double n1 = scanner.nextDouble();

        System.out.print("Me diga a nota do seu segundo trimestre");
        Double n2 = scanner.nextDouble();

        System.out.print("Me diga a nota do seu terceiro trimestre");
        Double n3 = scanner.nextDouble();

        Double media = (n1 + n2 + n3)/3;

        System.out.printf("Sua média final é %.2f", media);



    }

}
