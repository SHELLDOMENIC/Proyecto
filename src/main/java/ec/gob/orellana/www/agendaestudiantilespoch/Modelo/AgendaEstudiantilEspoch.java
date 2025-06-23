
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Controlador.AgendaController;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Vista.PrincipalView;
import javax.swing.SwingUtilities;

/**
 *
 * @author and_j
 */
public class AgendaEstudiantilEspoch {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AgendaController controller = new AgendaController();
            PrincipalView view = new PrincipalView(controller);
            view.setVisible(true);
        });
    }
    
}
