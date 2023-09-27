
package com.mycompany.ejercicioexcepciones01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioExcepciones01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Ingrese la operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

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
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese un número válido.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
