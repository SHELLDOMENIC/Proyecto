
package ec.gob.orellana.www.agendaestudiantilespoch.Modelo;

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

    @Override
    public String toString() {
        return nombre + " | Docente: " + docente + " | Horario: " + horario + " | Aula: " + aula;
    }
}


    

