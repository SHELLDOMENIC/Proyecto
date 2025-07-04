
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.examen;

/**
 *
 * @author and_j
 */
public class Examen {

        private String materia;
        private String fecha;
        private String tema;
        private String hora;
        
          public Examen(String materia, String fecha, String tema,String hora) {
            this.materia = materia;
            this.fecha = fecha;
            this.tema = tema;
            this.hora= hora;
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

      
        public void editar(String materia, String fecha, String tema, String hora) {
        this.materia = materia;
        this.fecha = fecha;
        this.tema = tema;
        this.hora =hora;
        }

        @Override
    public String toString() {
        return  "| Materia: " + "\n "+ materia + "\n  | Fecha:\n  " + fecha + ","+hora+" \n | Tema:\n " + tema+"\n";
    }
}

