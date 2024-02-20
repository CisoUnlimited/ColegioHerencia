import java.util.ArrayList;

public class Profesor extends Persona{
    private ArrayList<String> modulos;
    private String usuario = "IDea";
    private float horasTrabajadas;
    private float sueldoPorHora;

    public Profesor(String nombre, String primerApellido, String segundoApellido, int edad, sexo sexo, String dni, ArrayList<String> modulos, String usuario, float horasTrabajadas, float sueldoPorHora) {
        super(nombre, primerApellido, segundoApellido, edad, sexo, dni);
        this.modulos = modulos;
        this.usuario = usuario;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public ArrayList<String> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<String> modulos) {
        this.modulos = modulos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(float sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "modulos=" + modulos +
                ", usuario='" + usuario + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", sueldoPorHora=" + sueldoPorHora +
                '}';
    }
}
