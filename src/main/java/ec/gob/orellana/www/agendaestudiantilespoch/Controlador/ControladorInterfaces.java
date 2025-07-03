package ec.gob.orellana.www.agendaestudiantilespoch.Controlador;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Cola;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameExamen;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameMaterias;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameMetas;
import ec.gob.orellana.www.agendaestudiantilespoch.Vista.NewJFrameTareas;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author and_j
 */
public class ControladorInterfaces {

    private Cola cola;

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public ControladorInterfaces() {
    }

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

        } else if ("examen".equals(opcion)) {

            NewJFrameExamen vistaExamen = new NewJFrameExamen();
            vistaExamen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vistaExamen.setVisible(true);
        }
        cola.mostrarCola();
    }
    public void mostrarResumen(JTextArea txtResumen) {
    if (cola.estaVacia()) {
        txtResumen.setText("No hay elementos para mostrar.");
        return;
    }

    StringBuilder sb = new StringBuilder("═ RESUMEN AGENDA ═\n\n");
    cola.obtenerTodos().forEach(elemento -> 
        sb.append(elemento.toString()).append("\n\n")
    );

    txtResumen.setText(sb.toString());
}

}
