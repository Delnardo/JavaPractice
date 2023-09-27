
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;



public class EjercicioExcepciones02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = obtenerNumeroValido(scanner);

            System.out.print("Ingrese el segundo número: ");
            double num2 = obtenerNumeroValido(scanner);

            System.out.print("Ingrese la operación (+, -, *, /): ");
            char operacion = obtenerOperacionValida(scanner);

            double resultado;

            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: No se puede dividir por cero.");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Operación no válida.");
            }

            System.out.println("Resultado: " + resultado);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double obtenerNumeroValido(Scanner scanner) {
        double numero;
        do {
            try {
                numero = scanner.nextDouble();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar el búfer del teclado
            }
        } while (true);
    }

    private static char obtenerOperacionValida(Scanner scanner) {
        char operacion;
        do {
            try {
                operacion = scanner.next().charAt(0);
                if (operacion == '+' || operacion == '-' || operacion == '*' || operacion == '/') {
                    return operacion;
                } else {
                    throw new IllegalArgumentException("Operación no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese una operación válida.");
                scanner.nextLine(); // Limpiar el búfer del teclado
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Limpiar el búfer del teclado
            }
        } while (true);
    }
}

