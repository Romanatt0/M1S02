import java.util.Scanner;
public class ex04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Me informe um número: ");
        int n1 = scanner.nextInt();

        System.out.print("Me informe um  outro número: ");
        int n2 = scanner.nextInt();

        System.out.println("Me informe qual regra aritimética você quer usar");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");



        if(!scanner.hasNextInt()){

            System.out.println("Opção invalida!");
        } else {

            int  escolha = scanner.nextInt();

            switch(escolha) {

                case 1:

                    int soma = n1 + n2;

                    System.out.println("A soma é " + soma);

                    break;

                case 2:

                    int sub = n1 - n2;

                    System.out.println("O resultado é " + sub);

                    break;

                case 3:

                    int multi = n1 * n2;

                    System.out.println("O resultado é " + multi);

                    break;

                case 4:

                    double divi = n1 / n2;

                    System.out.println("O resultado é " + divi);

                    break;

            }
        }

    }

}