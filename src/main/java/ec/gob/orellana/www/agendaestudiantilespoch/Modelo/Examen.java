
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

    public Examen() {
    }
          

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

      
        public void editar(String materia, String fecha, String tema) {
        this.materia = materia;
        this.fecha = fecha;
        this.tema = tema;
        }

        @Override
    public String toString() {
        return "Materia: " + materia + " | Fecha: " + fecha + " | Tema: " + tema;
    }
}

