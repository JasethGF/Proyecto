/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenido a la Calculadora Basica");

        while (continuar) {
           
            System.out.println("\nElige una opcion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Mostrar numeros del 1 al 10 (par/impar)");
            System.out.println("6. Salir");
            System.out.print("Ingresa el numero de la opcion deseada: ");
            
            int opcion = scanner.nextInt();

            if (opcion == 6) {
                continuar = false;
                System.out.println("Gracias por usar la Calculadora Basica. ¡Hasta luego!");
                break;
            }

            if (opcion >= 1 && opcion <= 4) {
                
                System.out.print("Ingresa el primer numero: ");
                double numero1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo numero: ");
                double numero2 = scanner.nextDouble();

                
                double resultado = 0;
                boolean operacionValida = true;

                switch (opcion) {
                    case 1: 
                        resultado = numero1 + numero2;
                        System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
                        break;
                    case 2: 
                        resultado = numero1 - numero2;
                        System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
                        break;
                    case 3: 
                        resultado = numero1 * numero2;
                        System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
                        break;
                    case 4: 
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                            System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                            operacionValida = false;
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        operacionValida = false;
                }

                if (!operacionValida) {
                    System.out.println("Intenta de nuevo.");
                }
            } else if (opcion == 5) {
                
                System.out.println("Numeros del 1 al 10 con su clasificacion:");
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " es par");
                    } else {
                        System.out.println(i + " es impar");
                    }
                }
            } else {
                System.out.println("Opcion no valida. Por favor, elige una opcion del menu.");
            }
        }

        scanner.close();
        
        
        
        
        
        
    }
    
}
