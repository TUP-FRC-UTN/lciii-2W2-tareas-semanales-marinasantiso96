/*
 2. Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización de un software para obtener resultados
sobre sus clientes y sus respectivas mascotas. (Suponer que cada cliente posee una sola mascota)
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una Mascota.
De la Mascota se dispone los siguientes datos: el nombre y la edad.
El software requiere cargar un número n de Clientes (este valor deberá ser cargado por teclado). Almacenar la información de los clientes en un arreglo.
Se pide:
1. Mostrar la cantidad de clientes.
2. Mostrar el promedio de edad de las mascotas.
3. Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
 */
package tareaejercicio2.pkg0405;

import java.util.Scanner;

/**
 * @author Marina
 */
public class TareaEjercicio20405 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente[] clientes;
        System.out.println("Ingrese la cantidad de clientes: ");
        int cantClientes = sc.nextInt();
        clientes = new Cliente[cantClientes];

        int acumuladorEdadM = 0;
        int clientesAnt = 0;

        for (int i = 0; i < clientes.length; i++) {
            sc.nextLine();
            Cliente nuevoCliente = new Cliente();
            System.out.println("Ingrese el número del cliente: ");
            nuevoCliente.nroCliente = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del cliente: ");
            nuevoCliente.nombreCliente = sc.nextLine();
            System.out.println("Ingrese la antigüedad del cliente: ");
            nuevoCliente.antigCliente = sc.nextInt();
            
            if (nuevoCliente.antigCliente >= 5) {
                clientesAnt++;
            }
            sc.nextLine();
            System.out.println("Ingrese el nombre de la mascota: ");
            nuevoCliente.mascotaCliente.nombreMascota = sc.nextLine();
            System.out.println("Ingrese la edad de la mascota: ");
            nuevoCliente.mascotaCliente.edadMascota = sc.nextInt();
            

            acumuladorEdadM = acumuladorEdadM + nuevoCliente.mascotaCliente.edadMascota;

            clientes[i] = nuevoCliente;
        }
        //1.
        System.out.println("La cantidad de clientes es: " + cantClientes);

        //2.
        System.out.println("El promedio de edad de las mascotas es: " + (double)(acumuladorEdadM / cantClientes));

        //3.
        System.out.println("La cantidad de clientes con una antigüedad mayor a 5 años es de: " + clientesAnt);

    }

}
