import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resultados = new double[10];
        int contador = 0;

        while (contador < 10) {
            System.out.println("\nCalculadora Geométrica");
            System.out.println("Elija una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Salir del programa");
            System.out.print("Ingrese el número de tu elección: ");

            int figueleg;
            try {
                figueleg = scanner.nextInt();
                if (figueleg == 6) {
                    break;
                }
                if (figueleg < 1 || figueleg > 5) {
                    System.out.println("Error: ingrese una opción válida.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Error: ingrese una opción válida.");
                scanner.next();
                continue;
            }

            int operacion;
            System.out.println("Escoja una operación:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.print("Ingresa el número de tu elección: ");
            try {
                operacion = scanner.nextInt();
                if (operacion != 1 && operacion != 2) {
                    System.out.println("Error: ingrese una opción válida.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Error: ingrese una opción válida.");
                scanner.next();
                continue;
            }

            double result = 0;
            switch (figueleg) {
                case 1:
                    if (operacion == 1) {
                        System.out.print("Ingresa el radio del círculo: ");
                        double radi = scanner.nextDouble();
                        result = 3.1416 * radi * radi;
                    } else {
                        System.out.print("Ingresa el diámetro del círculo: ");
                        double diamet = scanner.nextDouble();
                        result = 3.1416 * diamet;
                    }
                    break;
                case 2:
                    if (operacion == 1) {
                        System.out.print("Ingresa la longitud del lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        result = lado * lado;
                    } else {
                        System.out.print("Ingresa la longitud de un lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        result = 4 * lado;
                    }
                    break;
                case 3:
                    if (operacion == 1) {
                        System.out.print("Ingresa la base y la altura del triángulo (separados por un espacio): ");
                        double base = scanner.nextDouble();
                        double altu = scanner.nextDouble();
                        result = 0.5 * base * altu;
                    } else {
                        System.out.print("Ingresa la longitud de los tres lados del triángulo (separados por un espacio): ");
                        double lado1 = scanner.nextDouble();
                        double lado2 = scanner.nextDouble();
                        double lado3 = scanner.nextDouble();
                        result = lado1 + lado2 + lado3;
                    }
                    break;
                case 4:
                    if (operacion == 1) {
                        System.out.print("Ingresa la longitud y el ancho del rectángulo (separados por un espacio): ");
                        double longi = scanner.nextDouble();
                        double anchu = scanner.nextDouble();
                        result = longi * anchu;
                    } else {
                        System.out.print("Ingresa la longitud y el ancho del rectángulo (separados por un espacio): ");
                        double longi = scanner.nextDouble();
                        double anchu = scanner.nextDouble();
                        result = 2 * (longi + anchu);
                    }
                    break;
                case 5:
                    if (operacion == 1) {
                        System.out.print("Ingresa la longitud de un lado del pentágono: ");
                        double lad = scanner.nextDouble();
                        result = 0.5 * lad * lad * (2.2361 + 5) * 0.2;
                    } else {
                        System.out.print("Ingresa la longitud de un lado del pentágono: ");
                        double lad = scanner.nextDouble();
                        result = 5 * lad;
                    }
                    break;
            }

            resultados[contador] = result;
            contador++;

            System.out.println("Resultado: " + result);
        }

        System.out.println("Resultados almacenados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Operación " + (i + 1) + ": " + resultados[i]);
        }
    }
}


