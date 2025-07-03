package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

/**
 *
 * @author and_j
 */
public class Tarea {

    private String descripcion;
    private String Dia;
    //private String Hora;
    private boolean completado = false;

    public Tarea(String descripcion, String Dia,boolean completado) {
        this.descripcion = descripcion;
        this.Dia = Dia;
        //this.Hora = Hora;
        this.completado = false;
    }
    
    

    public Tarea() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

   /* public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }*/

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return descripcion + " | Fecha: " + Dia  + " | Estado: " + (completado ? "Completada" : "Pendiente");
    }
}
