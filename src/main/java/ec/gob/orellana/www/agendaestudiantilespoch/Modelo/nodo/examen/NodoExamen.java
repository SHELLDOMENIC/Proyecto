package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.examen;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.examen.Examen;

/**
 *
 * @author and_j
 */
public class NodoExamen {

    public Examen dato;

    public NodoExamen siguiente;

    public NodoExamen(Examen dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "NodoExamen{dato=" + dato + "}";
    }

}
