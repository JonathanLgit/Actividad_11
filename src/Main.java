import com.sun.source.tree.IfTree;

import java.util.InputMismatchException;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        int opc1 = 0;
        int opc2 = 0;
        int opc3 = 0;

        boolean val = true;
        boolean val2 = true;
        boolean val3 = true;

        int loop = 0;
        boolean val4 = true;

    do {
        do {
            System.out.println("Selecciona la propiedad a calcular:" + '\n' + "1. Area" + '\n' + "2. Perimetro");

            try {
                System.out.print("Opcion: ");
                Scanner scanner = new Scanner(System.in);
                opc1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("--- Solo admite valores numericos ---");
            }

            if (opc1 > 2 || opc1 < 1) {
                System.out.println(" --- Digite un numero de opcion correcto ---");
            } else {
                val = false;
            }

        } while (val);

        if (opc1 == 1) {
            do {
                System.out.println("Selecciona la figura a calcular:" + '\n' + "1. Circulo" + '\n' + "2. Triangulo" + '\n' + "3. Cuadrado");
                try {
                    System.out.print("Opcion: ");
                    Scanner scanner = new Scanner(System.in);
                    opc2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("--- Solo admite valores numericos ---");
                }

                if (opc2 > 3 || opc2 < 1) {
                    System.out.println(" --- Digite un numero de opcion correcto ---");
                } else {
                    val2 = false;
                }
            } while (val2);

            switch (opc2) {
                case 1:
                    System.out.print("Ingrese el radio del circulo: ");
                    Scanner scanner = new Scanner(System.in);
                    circle.setRadio(scanner.nextDouble());
                    System.out.println("El area del circulo es: " + circle.getArea());
                    break;
                case 2:
                    System.out.print("Ingrese el valor correpondinete a la base: ");
                    scanner = new Scanner(System.in);
                    triangle.setBase(scanner.nextDouble());
                    System.out.print("Ingrese el valor correpondinete a la altura: ");
                    scanner = new Scanner(System.in);
                    triangle.setAltura(scanner.nextDouble());
                    System.out.println("El area del triangulo es: " + triangle.getArea());
                    break;
                case 3:
                    System.out.print("Ingresa el valor correpondinete a cualquier lado: ");
                    scanner = new Scanner(System.in);
                    square.setLado(scanner.nextDouble());
                    System.out.println("El area del cuadrado es: " + square.getArea());
                    break;
            }
        } else {
            do {
                System.out.println("Selecciona la figura a calcular:" + '\n' + "1. Circulo" + '\n' + "2. Triangulo" + '\n' + "3. Cuadrado");
                try {
                    System.out.print("Opcion: ");
                    Scanner scanner = new Scanner(System.in);
                    opc3 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("--- Solo admite valores numericos ---");
                }

                if (opc3 > 3 || opc3 < 1) {
                    System.out.println(" --- Digite un numero de opcion correcto ---");
                } else {
                    val3 = false;
                }
            } while (val3);

            switch (opc3) {
                case 1:
                    System.out.print("Ingrese el radio del circulo: ");
                    Scanner scanner = new Scanner(System.in);
                    circle.setRadio(scanner.nextDouble());
                    System.out.println("El area del circulo es: " + circle.getPerimeter());
                    break;
                case 2:
                    System.out.print("Ingrese el valor correpondinete a lado1: ");
                    scanner = new Scanner(System.in);
                    triangle.setLado1(scanner.nextDouble());
                    System.out.print("Ingrese el valor correpondinete a la lado2: ");
                    scanner = new Scanner(System.in);
                    triangle.setLado2(scanner.nextDouble());
                    System.out.print("Ingrese el valor correpondinete a la lado3: ");
                    scanner = new Scanner(System.in);
                    triangle.setLado3(scanner.nextDouble());
                    System.out.println("El area del triangulo es: " + triangle.getPerimeter());
                    break;
                case 3:
                    System.out.print("Ingresa el valor correpondinete a cualquier lado: ");
                    scanner = new Scanner(System.in);
                    square.setLado(scanner.nextDouble());
                    System.out.println("El area del cuadrado es: " + square.getPerimeter());
                    break;
            }
        }


        do {
            System.out.print("¿Desea realizar otro calculo? ( 1. Si | 2. No ): ");
            try {
                Scanner scanner = new Scanner(System.in);
                loop = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("--- Seleccione una opcion valida ---");
            }
            if (opc2 > 2 || opc2 < 1) {
                System.out.println(" --- Digite un numero de opcion correcto ---");
            } else {
                val4 = false;
            }
        } while (val4);

    }while (loop == 1);

    }
}
