/*
2. En un banco hay dos tipos de cuentas: cajas de ahorro y cuentas corrientes.
Programar una clase Cuenta y dos derivadas correspondientes a cada uno de los
tipos de cuenta.
La clase Cuenta debe poseer dos métodos para operar con las mismas llamados
Depositar y Extraer.
Las cajas de ahorro no permiten extracciones si el saldo no es suficiente,
mientras que las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo
negativo admisible. 
La clase cuenta debe poseer al menos los atributos número,nombre y saldo.
 */
package tareaejercicio2.pkg1805;

import java.util.Scanner;

public class TareaEjercicio21805 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qué cuenta desea crear?\n 1. Caja de Ahorro. \n 2. Cuenta Corriente.");
        int tipoCuenta = sc.nextInt();

        if (tipoCuenta == 1) {
            CajaAhorro ca1 = new CajaAhorro();
            System.out.println("Ingrese el número: ");
            ca1.setNumero(sc.nextInt());
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            ca1.setNombre(sc.nextLine());
            System.out.println("Ingrese el saldo: ");
            ca1.setSaldo(sc.nextDouble());

            System.out.println("Qué desea hacer?\n 1. Extraer. \n 2. Depositar.");
            int tipoAccion = sc.nextInt();
            if (tipoAccion == 1) {
                System.out.println("Ingrese el dinero a extraer: ");
                double dinero = sc.nextDouble();

                if (ca1.extraer(dinero)) {
                    System.out.println("Se extrajo.");
                } else {
                    System.out.println("No se extrajo.");
                }
                System.out.println("Su saldo es: " + ca1.getSaldo());

            } else {
                if (tipoAccion == 2) {
                    System.out.println("Ingrese el dinero a depositar: ");
                    double dinero = sc.nextDouble();
                    ca1.depositar(dinero);
                    System.out.println("Su saldo es: " + ca1.getSaldo());

                } else {
                    System.out.println("No ingreso una opción correcta.");

                }
            }
            System.out.println(ca1.toString());

        } else {
            if (tipoCuenta == 2) {
                CuentaCorriente cc1 = new CuentaCorriente();
                cc1.setAcuerdo(100);
                System.out.println("Ingrese el número: ");
                cc1.setNumero(sc.nextInt());
                sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                cc1.setNombre(sc.nextLine());
                System.out.println("Ingrese el saldo: ");
                cc1.setSaldo(sc.nextDouble());

                System.out.println("Qué desea hacer?\n 1. Extraer. \n 2. Depositar.");
                int tipoAccion = sc.nextInt();
                if (tipoAccion == 1) {

                    System.out.println("Ingrese el dinero a extraer: ");
                    double dinero = sc.nextDouble();
                    if (cc1.extraer(dinero)) {
                        System.out.println("Se extrajo.");
                    } else {
                        System.out.println("No se extrajo.");
                    }
                    System.out.println("Su saldo es: " + cc1.getSaldo());

                } else {
                    if (tipoAccion == 2) {

                        System.out.println("Ingrese el dinero a extraer: ");
                        double dinero = sc.nextDouble();
                        cc1.depositar(dinero);
                        System.out.println("Su saldo es: " + cc1.getSaldo());

                    } else {
                        System.out.println("No ingreso una opción correcta.");
                    }

                }
                System.out.println(cc1.toString());
            } else {
                System.out.println("No ingreso una opción correcta.");
            }
        }

    }

}
