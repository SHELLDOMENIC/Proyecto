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
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameExamen;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameMaterias;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameMetas;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameTareas;

/**
 *
 * @author and_j
 */
public class AgendaController {

    private AgendaEstudiantilEspochClassPrincipal modelo;
    private NewJFrameMetas vistaMetas;
    private NewJFrameMaterias vistaMaterias;
    private NewJFrameExamen vistaExamen;
    private NewJFrameTareas vistaTarea;
    private Cola cola;

    public AgendaController(NewJFrameMetas vistaMetas) {

        this.vistaMetas = vistaMetas;
        this.cola = new Cola();
    }

    public AgendaController(NewJFrameTareas vistaTarea) {
        this.vistaTarea = vistaTarea;
        this.cola = new Cola();
    }

    public AgendaController(NewJFrameMaterias vistaMaterias) {
        this.vistaMaterias = vistaMaterias;
        this.cola = new Cola();
    }

    public AgendaController(NewJFrameExamen vistaExamen) {
        this.vistaExamen = vistaExamen;
        this.cola = new Cola();
    }

    //NEW COINTROLLER
    public void porcesoControlador(String tipo) {
        //obtengo desde vista
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

            String nombreMateria = vistaMaterias.getMateria();
            String docente = vistaMaterias.getDocente();
            String dia = vistaMaterias.getDia();
            String aula = vistaMaterias.getAula();
            Materia materia = new Materia(nombreMateria, docente, dia, aula);//revisar 
            cola.agregar(new NodoMaterias(materia));
        }

        cola.mostrarCola();
    }

}


