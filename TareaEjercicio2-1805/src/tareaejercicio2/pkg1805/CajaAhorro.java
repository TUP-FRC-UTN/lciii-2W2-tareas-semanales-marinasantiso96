/*
2. En un banco hay dos tipos de cuentas: cajas de ahorro y cuentas corrientes.
Programar una clase Cuenta y dos derivadas correspondientes a cada uno de los
tipos de cuenta.
La clase Cuenta debe poseer dos métodos para operar con las mismas llamados
Depositar y Extraer.
Las cajas de ahorro no permiten extracciones si el saldo no es suficiente,

 */
package tareaejercicio2.pkg1805;

public class CajaAhorro extends Cuenta {

    public CajaAhorro(int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
    }

    public CajaAhorro() {
    }

    public boolean extraer(double dinero) {
        boolean extraido = false;
        if (dinero <= saldo) {
            saldo = saldo - dinero;
            extraido = true;
        }
        return extraido;
    }

}
