package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Controlador;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.AgendaEstudiantilEspochClassPrincipal;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Examen;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Materia;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Meta;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Tarea;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Vista.PrincipalView;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author and_j
 */
public class AgendaController {

    private AgendaEstudiantilEspochClassPrincipal modelo;
    private PrincipalView vista;

    public AgendaController(AgendaEstudiantilEspochClassPrincipal modelo, PrincipalView vista) {
        this.modelo = modelo;
        this.vista = vista;
        
    }

    public AgendaController() {
    }
    
     // Vectores y contadores
    public String[] vectorMaterias = new String[100];
    public int contadorMaterias = 0;

    public String[] vectorTareas = new String[100];
    public int contadorTareas = 0;

    public String[] vectorExamenes = new String[100];
    public int contadorExamenes = 0;

    public String[] vectorMetas = new String[100];
    public int contadorMetas = 0;

    // Métodos para agregar datos

    public void agregarMateria(Materia m) {
        if (contadorMaterias < 100) {
            vectorMaterias[contadorMaterias] = m.toString();
            contadorMaterias++;
        }
    }

    public void agregarTarea(Tarea t) {
        if (contadorTareas < 100) {
            vectorTareas[contadorTareas] = t.toString();
            contadorTareas++;
        }
    }

    public void agregarExamen(Examen e) {
        if (contadorExamenes < 100) {
            vectorExamenes[contadorExamenes] = e.toString();
            contadorExamenes++;
        }
    }

    public void agregarMeta(Meta meta) {
        if (contadorMetas < 100) {
            vectorMetas[contadorMetas] = meta.toString();
            contadorMetas++;
        }
    }

    public String getResumen() {
        StringBuilder sb = new StringBuilder("--- RESUMEN GENERAL ---\n\n");

        sb.append("Materias:\n");
        for (int i = 0; i < contadorMaterias; i++) {
            sb.append(" - ").append(vectorMaterias[i]).append("\n");
        }

        sb.append("\nTareas:\n");
        for (int i = 0; i < contadorTareas; i++) {
            sb.append(" - ").append(vectorTareas[i]).append("\n");
        }

        sb.append("\nExámenes:\n");
        for (int i = 0; i < contadorExamenes; i++) {
            sb.append(" - ").append(vectorExamenes[i]).append("\n");
        }

        sb.append("\nMetas:\n");
        for (int i = 0; i < contadorMetas; i++) {
            sb.append(" - ").append(vectorMetas[i]).append("\n");
        }

        return sb.toString();
    }
}

