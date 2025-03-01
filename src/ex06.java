import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Me informe um número:");
        int number = scanner.nextInt();

        System.out.println("Escolha uma raiz: ");
        int raiz = scanner.nextInt();

        System.out.println("Escolha uma das opções: \n 1 - P.A \n 2 -P.G");
        int opcao = scanner.nextInt();

        switch (opcao) {

            case 1:

                for(int i = 0; i < 10; i++){

                    System.out.print(number + ",");

                    number = number + raiz;;

                }

                break;

            case 2:

                for(int i = 0; i < 10; i++){

                    System.out.print(number + ",");

                    number = number * raiz;;

                }

                break;


        }
    }
}
