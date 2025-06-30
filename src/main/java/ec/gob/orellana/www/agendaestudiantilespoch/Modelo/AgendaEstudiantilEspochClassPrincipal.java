package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Controlador.AgendaController;
import ec.gob.orellana.www.agendaestudiantilespoch.Modelo.Vista.PrincipalView;

/**
 *
 * @author and_j
 */
public class AgendaEstudiantilEspochClassPrincipal {

    public static void main(String[] args) {
        System.out.println("Aplicacion iniciada correctamente");
        AgendaController controller = new AgendaController();
        PrincipalView view = new PrincipalView(controller);
        view.setVisible(true);
           
    }
}


