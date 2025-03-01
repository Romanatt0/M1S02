import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Me diga seu nome: ");
            String nome = scanner.next();

            System.out.print("Me diga seu sobrenome: ");
            String sobrenome = scanner.next();

            int n = nome.length() + sobrenome.length();

            System.out.print("Olá " + nome + " " +  sobrenome + " Seu nome tem " + n + " letras " );
        }
}