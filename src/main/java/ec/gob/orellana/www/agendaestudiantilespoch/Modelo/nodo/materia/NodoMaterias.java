
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.materia;

/**
 *
 * @author and_j
 */
public class NodoMaterias {
    public Materia dato;
    public NodoMaterias siguiente;

    public NodoMaterias(Materia dato) {
        this.dato = dato;
        this.siguiente = null;
    }
     @Override
    public String toString() {
        return "NodoMateria{dato=" + dato + "}";
    }
}
    

