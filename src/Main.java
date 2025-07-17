import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        System.out.println("Escreva sua primeira nota: ");
        float nota1 = nota.nextFloat();
        System.out.println("Escreva sua segunda nota: ");
        float nota2 = nota.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("Nota 1: " + nota1 + " Nota 2: " + nota2 + " Media: " + media);
    }
}