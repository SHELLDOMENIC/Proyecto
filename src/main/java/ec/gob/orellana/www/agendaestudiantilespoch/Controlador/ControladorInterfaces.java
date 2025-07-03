package ec.gob.orellana.www.agendaestudiantilespoch.Controlador;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Cola;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.examen.NodoExamen;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.materia.NodoMaterias;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.meta.NodoMeta;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.tarea.NodoTarea;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameExamen;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameMaterias;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameMetas;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameTareas;
import java.util.Queue;
import javax.swing.JFrame;
import javax.swing.JTextArea;


/**
 *
 * @author and_j
 */
public class ControladorInterfaces {
     private Cola cola;
     
    public void procesoNavegar(String opcion) {
        
        if ("meta".equals(opcion)) {
            
            NewJFrameMetas vistaMetas = new NewJFrameMetas();
            vistaMetas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaMetas.setVisible(true);
            
        } else if ("tarea".equals(opcion)) {
            
            NewJFrameTareas vistaTareas = new NewJFrameTareas();
            vistaTareas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaTareas.setVisible(true);
            
        } else if ("materia".equals(opcion)) {
            
            NewJFrameMaterias vistaMaterias = new NewJFrameMaterias();
            vistaMaterias.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaMaterias.setVisible(true);
            
        }else if ("examen".equals(opcion)) {
            
            NewJFrameExamen vistaExamen = new NewJFrameExamen();
            vistaExamen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaExamen.setVisible(true);
        }
          cola.mostrarCola();
    }
    public void mostrarResumen(JTextArea txtResultado) {
        if (cola.estaVacia()) {
            txtResultado.setText("No hay elementos para mostrar.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("════════ RESUMEN DE LA AGENDA ════════\n\n");
        
        int contador = 1;
        for (Object obj : cola.obtener()) {
            sb.append(contador++).append(". ");
            
            if (obj instanceof NodoMaterias) {
                NodoMaterias nodo = (NodoMaterias) obj;
                sb.append("[MATERIA] ").append(nodo.getClass().getNombre())
                  .append(" | Docente: ").append(nodo.getMateria().getDocente())
                  .append(" | Aula: ").append(nodo.getMateria().getAula())
                  .append(" | Día: ").append(nodo.getMateria().getDia());
            } 
            else if (obj instanceof NodoExamen) {
                NodoExamen nodo = (NodoExamen) obj;
                sb.append("[EXAMEN] ").append(nodo.getExamen().getTema())
                  .append(" | Materia: ").append(nodo.getExamen().getNombreMateria())
                  .append(" | Día: ").append(nodo.getExamen().getDia())
                  .append(" | Hora: ").append(nodo.getExamen().getHora());
            }
            else if (obj instanceof NodoTarea) {
                NodoTarea nodo = (NodoTarea) obj;
                sb.append("[TAREA] ").append(nodo.getDescripcion())
                  .append(" | Fecha: ").append(nodo.getTarea().getFecha())
                  .append(" | Hora: ").append(nodo.getTarea().getHora())
                  .append(" | Estado: ").append(nodo.getTarea().isEstado() ? "Completado" : "Pendiente");
            }
            else if (obj instanceof NodoMeta) {
                NodoMeta nodo = (NodoMeta) obj;
                sb.append("[META] ").append(nodo.getMeta().getDescripcion())
                  .append(" | Fecha: ").append(nodo.getMeta().getFecha())
                  .append(" | Estado: ").append(nodo.getMeta().isEstado() ? "Cumplida" : "En progreso");
            }
            
            sb.append("\n\n");
        }

        txtResultado.setText(sb.toString());
    }
}
    /*public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
        
        System.out.println("════════ CONTENIDO DE LA COLA ════════");
        int contador = 1;
        for (Object Queue: cola) {
            System.out.println(contador++ + ". " + Queue.toString());
        }
    }*/

    

  

}

