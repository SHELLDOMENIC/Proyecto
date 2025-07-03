
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo.nodo.materia;

/**
 *
 * @author and_j
 */
public class Materia {
    private String nombre;
    private String docente;
    private String horario;
    private String aula;

    public Materia(String nombre, String docente, String horario, String aula) {
        this.nombre = nombre;
        this.docente = docente;
        this.horario = horario;
        this.aula = aula;
    }

    public Materia() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
    

    @Override
    public String toString() {
        return nombre + " | Docente: " + docente + " | Horario: " + horario + " | Aula: " + aula;
    }
}


    

