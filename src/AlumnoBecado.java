import java.util.ArrayList;

public class AlumnoBecado extends Alumno{
    private final float beca = 1000;

    public AlumnoBecado(String nombre, String primerApellido, String segundoApellido, int edad, sexo sexo, String dni, String idAlumno, ArrayList<ArrayList<ArrayList<String>>> notas) {
        super(nombre, primerApellido, segundoApellido, edad, sexo, dni, idAlumno, notas);
    }

    public float getBeca() {
        return beca;
    }

    @Override
    public String toString() {
        return "AlumnoBecado{" +
                "beca=" + beca +
                '}';
    }

}
