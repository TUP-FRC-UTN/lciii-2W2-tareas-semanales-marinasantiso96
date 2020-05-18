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

public abstract class Cuenta {

    int numero;
    String nombre;
    double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double dinero) {
        saldo = saldo + dinero;
    }

    public boolean extraer(double dinero) {
        boolean extraido = true;
        saldo = saldo - dinero;
        return extraido;
    }

    public Cuenta(int numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }

}
