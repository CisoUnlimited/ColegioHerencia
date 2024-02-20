import java.lang.reflect.Array;
import java.util.ArrayList;

public class Alumno extends Persona{
    private String idAlumno;
    private ArrayList<ArrayList<ArrayList<String>>> notas;

    public Alumno(String nombre, String primerApellido, String segundoApellido, int edad, sexo sexo, String dni, String idAlumno, ArrayList<ArrayList<ArrayList<String>>> notas) {
        super(nombre, primerApellido, segundoApellido, edad, sexo, dni);
        this.idAlumno = idAlumno;
        this.notas = notas;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public ArrayList<ArrayList<ArrayList<String>>> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<ArrayList<ArrayList<String>>> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno='" + idAlumno + '\'' +
                ", notas=" + notas +
                '}';
    }
}
