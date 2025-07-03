
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author and_j
 */
public class Cola {
   private Queue<Object> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    public void agregar(Object nodo) {
        cola.offer(nodo);
    }

    public Object obtener() {
        return cola.poll();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void mostrarCola() {
        for (Object nodo : cola) {
            System.out.println(nodo.toString());
        }
    }
    
}
