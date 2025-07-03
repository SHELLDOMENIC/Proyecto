package ec.gob.orellana.www.agendaestudiantilespoch.Controlador;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Cola;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaExamen;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaReporte;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaMateria;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaMeta;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.VistaTarea;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author and_j
 */
public class ControladorInterfaces {

    public void procesoNavegar(String opcion) {

        if ("meta".equals(opcion)) {

            VistaMeta vistaMetas = new VistaMeta();
            vistaMetas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaMetas.setVisible(true);

        } else if ("tarea".equals(opcion)) {

            VistaTarea vistaTareas = new VistaTarea();
            vistaTareas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaTareas.setVisible(true);

        } else if ("materia".equals(opcion)) {

            VistaMateria vistaMaterias = new VistaMateria();
            vistaMaterias.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaMaterias.setVisible(true);

        } else if ("examen".equals(opcion)) {

            VistaExamen vistaExamen = new VistaExamen();
            vistaExamen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaExamen.setVisible(true);
        }else if ("resultado".equals(opcion)) {

            VistaReporte vistaMostrar = new VistaReporte();
            vistaMostrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaMostrar.setVisible(true);
        }
        //cola.mostrarCola();
    }
   
}
