/*
 2. Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización de un software para obtener resultados
sobre sus clientes y sus respectivas mascotas. (Suponer que cada cliente posee una sola mascota)
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una Mascota.
De la Mascota se dispone los siguientes datos: el nombre y la edad.
El software requiere cargar un número n de Clientes (este valor deberá ser cargado por teclado). Almacenar la información de los clientes en un arreglo.
Se pide:
- Mostrar la cantidad de clientes.
- Mostrar el promedio de edad de las mascotas.
- Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
 */
package tareaejercicio2.pkg0405;

/**
 * @author Marina
 */
public class Cliente {

    int nroCliente;
    String nombreCliente;
    int antigCliente;
    Mascota mascotaCliente = new Mascota();

    Cliente() {

    }

    public int getNroCliente() {
        return nroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getAntigCliente() {
        return antigCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setAntigCliente(int antigCliente) {
        this.antigCliente = antigCliente;
    }

    public void setMascotaCliente(Mascota mascotaCliente) {
        this.mascotaCliente = mascotaCliente;
    }

    public Mascota getMascotaCliente() {
        return mascotaCliente;
    }

    public Cliente(int nroCliente, String nombreCliente, int antigCliente, Mascota mascotaCliente) {
        this.nroCliente = nroCliente;
        this.nombreCliente = nombreCliente;
        this.antigCliente = antigCliente;
        this.mascotaCliente = mascotaCliente;
    }

}
