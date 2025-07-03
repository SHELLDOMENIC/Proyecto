package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.meta;

/**
 *
 * @author and_j
 */
public class NodoMeta {

    public Meta dato;
    public NodoMeta siguiente;

    public NodoMeta(Meta dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "NodoMeta{dato=" + dato + "}";
    }
}
