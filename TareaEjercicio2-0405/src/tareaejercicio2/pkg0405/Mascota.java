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
public class Mascota {
    String nombreMascota;
    int edadMascota;
    
    Mascota(){
        
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public Mascota(String nombreMascota, int edadMascota) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }
    
    
}
