package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author and_j
 */
public class Cola {

    //private static Cola instancia = new Cola(); // Singleton
    private final Queue<Object> cola = new LinkedList<>();

   /* public Queue<Object> obtenerTodos() {
        return new LinkedList<>(cola); // Devuelve una COPIA de la cola original
    }*/


  /*  public static Cola getInstancia() { // Método global para acceder
        return instancia;
    }*/

    public void agregar(Object nodo) {
        cola.offer(nodo);
    }

    public Object obtener() {
        return cola.poll();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public String mostrarCola() {
        String resultado="-";
        for (Object nodo : cola) {
           resultado= resultado + nodo.toString();
        }
        return resultado;
    }

}
