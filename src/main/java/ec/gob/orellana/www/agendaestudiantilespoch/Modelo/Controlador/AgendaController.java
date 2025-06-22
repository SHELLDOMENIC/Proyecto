
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Controlador;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Examen;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Materia;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Tarea;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author and_j
 */
public class AgendaController {
    public List<Materia> materias = new ArrayList<>();
    public List<Tarea> tareas = new ArrayList<>();
    public List<Examen> examenes = new ArrayList<>();

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void agregarExamen(Examen examen) {
        examenes.add(examen);
    }

    public String listarResumen() {
        StringBuilder resumen = new StringBuilder("--- RESUMEN GENERAL ---\n\n");
        resumen.append("Materias:\n");
        for (Materia m : materias) resumen.append(m).append("\n");
        resumen.append("\nTareas:\n");
        for (Tarea t : tareas) resumen.append(t).append("\n");
        resumen.append("\nExámenes:\n");
        for (Examen e : examenes) resumen.append(e).append("\n");
        return resumen.toString();
    }
}
    
    

