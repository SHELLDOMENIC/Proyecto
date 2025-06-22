
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

/**
 *
 * @author and_j
 */
public class Examen {

        private String materia;
        private String fecha;
        private String tema;

        public Examen(String materia, String fecha, String tema) {
            this.materia = materia;
            this.fecha = fecha;
            this.tema = tema;
        }

        @Override
        public String toString() {
            return "Materia: " + materia + " | Fecha: " + fecha + " | Tema: " + tema;
        }

    }

