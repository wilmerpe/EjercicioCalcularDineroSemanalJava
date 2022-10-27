import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaSemanales;
        float salarioHora, salarioTotal;

        System.out.println("Escriba las horas semanales trabajadas: ");
        horaSemanales = entrada.nextInt();
        System.out.println("Escriba el salario que gana por hora: ");
        salarioHora = entrada.nextFloat();

        salarioTotal = horaSemanales * salarioHora;

        System.out.println("\nEl salario semanal es: " + salarioTotal);
    }
}
