
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.meta;

/**
 *
 * @author and_j
 */
public class Meta {
    private String descripcion;
    private String fecha;
    private boolean completado;

    public Meta(String descripcion, String fecha,boolean completado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.completado = false;
        
    }

    public Meta() {
    }
    

    public void marcarCompletado() {
        this.completado = true;
    }

    public void marcarPendiente() {
        this.completado = false;
    }

    public boolean estaCompletado() {
        return completado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }
      public void editar(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return " | Descripcion "+descripcion + " | Fecha: \n" + fecha + "\n | Estado: \n " + (completado ? " Completada \n" : " Pendiente \n");
    }
}
    

