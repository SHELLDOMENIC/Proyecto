
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Controlador.AgendaController;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Vista.AgendaView;
import javax.swing.SwingUtilities;

/**
 *
 * @author and_j
 */
public class AgendaEstudiantilEspoch {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AgendaController controller = new AgendaController();
            AgendaView view = new AgendaView(controller);
            view.setVisible(true);
        });
    }
    
}
