import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese la operacion que desea realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir por 0");
                } else {
                    System.out.println("El resultado de la division es: " + ((double) num1 / (double)num2));
                }
                break;
            default:
                System.out.println("El dato introducido es incorrecto");
        }
        System.out.println("Seleccione una opcion");
        System.out.println("1. Celcius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celcius");

        int grados = scanner.nextInt();

        if (grados > 2){
            System.out.println("los datos ingresados son incorrectos");
        }
        System.out.println("Ingrese los grados Celsius");
        double grado1 = scanner.nextDouble();
        System.out.println("Ingrese los grados Fahrenheit");
        double grado2 = scanner.nextDouble();

        switch (grados){
            case 1:
                System.out.println("La conversion de Celcius a Fahrenheit es: " + ((grado1 * 9/5) + 32));
                break;
            case 2:
                System.out.println("La conversion de Fahrenheit a Celcius es: " + ((grado2 - 32) + 5/9));
                break;
        }
    }
}

