package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author and_j
 */
public class Cola {

    private static Cola instancia = new Cola(); // Singleton
    private Queue<Object> cola = new LinkedList<>();

    public Queue<Object> obtenerTodos() {
        return new LinkedList<>(cola); // Devuelve una COPIA de la cola original
    }

    private Cola() {
    } // Constructor privado

    public static Cola getInstancia() { // Método global para acceder
        return instancia;
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
