import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MachineImplements machine = new MachineImplements();

        System.out.println("Escolha um nivel, nivel 1 ou nivel 2:");
        String nivel = scanner.nextLine();

        System.out.println("aperte enter para iniciar..");
        scanner.nextLine();

        String resultado = machine.getRandomFruits(nivel);
        System.out.println(resultado);

    }
}
