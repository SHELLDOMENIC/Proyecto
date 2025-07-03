package ec.gob.orellana.www.agendaestudiantilespoch.Controlador;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.AgendaEstudiantilEspochClassPrincipal;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Cola;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.examen.Examen;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.materia.Materia;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.meta.Meta;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.examen.NodoExamen;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.materia.NodoMaterias;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.meta.NodoMeta;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.tarea.NodoTarea;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.tarea.Tarea;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaExamen;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaReporte;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaMateria;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaMeta;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaTarea;
import javax.swing.JTextArea;

/**
 *
 * @author and_j
 */
public class ControladorAgenda {

    private AgendaEstudiantilEspochClassPrincipal modelo;
    private VistaMeta vistaMetas;
    private VistaMateria vistaMateria;
    private VistaExamen vistaExamen;
    private VistaTarea vistaTarea;
    private VistaReporte vistaReporte;
    private static Cola cola = new Cola();
    //private Cola cola;

    public ControladorAgenda(VistaMeta vistaMetas) {
        this.vistaMetas = vistaMetas;

    }

    public ControladorAgenda(VistaTarea vistaTarea) {
        this.vistaTarea = vistaTarea;

    }

    public ControladorAgenda(VistaExamen vistaExamen) {
        this.vistaExamen = vistaExamen;

    }

    public ControladorAgenda(VistaMateria vistaMateria) {
        this.vistaMateria = vistaMateria;

    }
    public ControladorAgenda(VistaReporte vistaReporte) {
        this.vistaReporte = vistaReporte;

    }

//NEW COINTROLLER
    public void porcesoControlador(String tipo) {
        //obtengo desde vista
        String resultado;
        if ("meta".equals(tipo)) {

            String descripcion = vistaMetas.getDescripcionMetas();
            String fecha = vistaMetas.getFecha();
            boolean estado = vistaMetas.getEstadoMetas();
            Meta meta = new Meta(descripcion, fecha, estado);
            cola.agregar(new NodoMeta(meta));

        } else if ("tarea".equals(tipo)) {

            String descripcion = vistaTarea.getDescripcionTaeas();
            String fecha = vistaTarea.getFecha();
            String hora = vistaTarea.getHora();
            boolean estado = vistaTarea.getEstadoTareas();
            Tarea tarea = new Tarea(descripcion, fecha, hora, estado);
            cola.agregar(new NodoTarea(tarea));

        } else if ("examen".equals(tipo)) {

            String nombreMateria = vistaExamen.getMateria();
            String tema = vistaExamen.getTema();
            String dia = vistaExamen.getDia();
            String hora = vistaExamen.getHora();
            Examen examen = new Examen(nombreMateria, dia, tema, hora);//revisar
            cola.agregar(new NodoExamen(examen));

        } else if ("materia".equals(tipo)) {

            String nombreMateria = vistaMateria.getMateria();
            String docente = vistaMateria.getDocente();
            String dia = vistaMateria.getDia();
            String aula = vistaMateria.getAula();
            Materia materia = new Materia(nombreMateria, docente, dia, aula);//revisar 
            cola.agregar(new NodoMaterias(materia));
        } else if ("resultado".equals(tipo)) {

            // System.out.println("Pedro:"+cola.mostrarCola());
            //String resultado;
            /*if (cola.estaVacia() == true) {
                resultado = "No hay elementos";
            } else {*/
            //}
            resultado = cola.mostrarCola();

            vistaReporte.mostrarResultados(resultado);
        }
        //System.out.println("Pedro:" + cola.mostrarCola());

    }

}
