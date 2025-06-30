
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

    public Tarea() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    

    public void marcarCompletado() {
        completado = true;
    }
    public void editar(String descripcion, String fechaEntrega) {
        this.descripcion = descripcion;
        this.fecha = fechaEntrega;
    }

    @Override
    public String toString() {
        return descripcion + " | Fecha: " + fecha + " | Estado: " + (completado ? "Completada" : "Pendiente");
    }
}
    

