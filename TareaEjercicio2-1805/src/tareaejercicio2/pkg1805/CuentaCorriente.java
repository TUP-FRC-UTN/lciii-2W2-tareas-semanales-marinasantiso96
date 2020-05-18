/*
2. En un banco hay dos tipos de cuentas: cajas de ahorro y cuentas corrientes.
Programar una clase Cuenta y dos derivadas correspondientes a cada uno de los
tipos de cuenta.
La clase Cuenta debe poseer dos métodos para operar con las mismas llamados
Depositar y Extraer.
mientras que las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo
negativo admisible. 
La clase cuenta debe poseer al menos los atributos número,
nombre y saldo.
 */
package tareaejercicio2.pkg1805;

public class CuentaCorriente extends Cuenta {

    double acuerdo;

    public CuentaCorriente(double acuerdo, int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.acuerdo = acuerdo;
    }

    public CuentaCorriente() {
    }

    public double getAcuerdo() {
        return acuerdo;
    }

    public void setAcuerdo(double acuerdo) {
        this.acuerdo = acuerdo;
    }

    public boolean extraer(double dinero) {
        boolean extraido = false;
        if (dinero <= saldo + acuerdo) {
            saldo = saldo - dinero;
            extraido = true;
        }

        return extraido;
    }

}
