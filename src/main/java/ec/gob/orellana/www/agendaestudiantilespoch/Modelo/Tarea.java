
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

/**
 *
 * @author and_j
 */
public class Tarea {
      private String descripcion;
    private String fecha;
    private boolean completado = false;

    public Tarea(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public void marcarCompletado() {
        completado = true;
    }

    @Override
    public String toString() {
        return descripcion + " | Fecha: " + fecha + " | Estado: " + (completado ? "Completada" : "Pendiente");
    }
}
    

