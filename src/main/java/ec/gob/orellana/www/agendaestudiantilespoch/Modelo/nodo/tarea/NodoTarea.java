package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.tarea;
/**
 *
 * @author and_j
 */
public class NodoTarea {

    public Tarea dato;
    public NodoTarea siguiente;

    public NodoTarea(Tarea dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "\n - NodoTarea: \n" + dato ;
    }
}
