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

// Único constructor
    public AgendaController(Cola cola) {
        this.cola = cola;
    }

    // Métodos para asignar vistas
    public void setVistaMetas(NewJFrameMetas vista) {
        this.vistaMetas = vista;
    }

    public void setVistaMaterias(NewJFrameMaterias vista) {
        this.vistaMaterias = vista;
    }

    public void setVistaExamen(NewJFrameExamen vista) {
        this.vistaExamen = vista;
    }

    public void setVistaTareas(NewJFrameTareas vista) {
        this.vistaTarea = vista;
    }

    // Método unificado para procesar elementos
    public void procesarElemento(String tipo, Object datos) {
        switch (tipo) {
            case "meta":
                // Lógica para metas
                break;
            case "materia":
                // Lógica para materias
                break;
            case "examen":
                // Lógica para exámenes
                break;
            case "tarea":
                // Lógica para tareas
                break;
        }
        cola.mostrarCola(); // Opcional: para depuración
    }

/* public AgendaController(NewJFrameMetas vistaMetas) {

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
    }*/

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
