import java.util.ArrayList;

public class AlumnoNoBecado extends Alumno{
    private final float beca = 0;

    public AlumnoNoBecado(String nombre, String primerApellido, String segundoApellido, int edad, sexo sexo, String dni, String idAlumno, ArrayList<ArrayList<ArrayList<String>>> notas) {
        super(nombre, primerApellido, segundoApellido, edad, sexo, dni, idAlumno, notas);
    }

    public float getBeca() {
        return beca;
    }

    @Override
    public String toString() {
        return "AlumnoNoBecado{" +
                "beca=" + beca +
                '}';
    }

}
