import java.util.regex.Matcher;
import java.util.regex.Pattern;

enum sexo{MASCULINO,FEMENINO,HELICOPTERO}

public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private sexo sexo;
    private String dni;

    private Persona(String nombre, String primerApellido, String segundoApellido, int edad, sexo sexo, String dni) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
    }

    public static Persona makePersona(String nombre, String primerApellido, String segundoApellido, int edad, String sexo, String dni){

        boolean checkNombre = false;
        boolean checkPrimerApellido = false;
        boolean checkSegundoApellido = false;
        boolean checkEdad = false;
        boolean checkSexo = false;

        if(checkNombre(nombre) && checkPrimerApellido(primerApellido) && checkSegundoApellido(segundoApellido) && checkEdad(edad) && checkSexo(sexo) && checkDNI(dni)){
            return new Persona(nombre, primerApellido, segundoApellido, edad, sexoParser(sexo), dni);
        } else {
            return null;
        }
    }

    //CREAR TODAS LAS CONDICIONES COMPROBADORAS
    public static boolean checkNombre(String nombre){
        boolean check = false;
        String comprobador = "";

        Pattern pattern = Pattern.compile(comprobador);
        Matcher unir = pattern.matcher(nombre);
        return check;
    }

    public static boolean checkPrimerApellido(String primerApellido){
        boolean check = false;
        String comprobador = "";

        Pattern pattern = Pattern.compile(comprobador);
        Matcher unir = pattern.matcher(primerApellido);
        return check;
    }

    public static boolean checkSegundoApellido(String segundoApellido){
        boolean check = false;
        String comprobador = "";

        Pattern pattern = Pattern.compile(comprobador);
        Matcher unir = pattern.matcher(segundoApellido);
        return check;
    }

    public static boolean checkEdad(int edad){
        boolean check = false;

        return check;
    }

    public static boolean checkSexo(String sexo){
        boolean check = false;
        String comprobador = "";

        Pattern pattern = Pattern.compile(comprobador);
        Matcher unir = pattern.matcher(sexo);
        return check;
    }

    public static boolean checkDNI(String dni){
        boolean check = false;
        String comprobador = "[0-9]{8}[A-Z]{1}";

        Pattern pattern = Pattern.compile(comprobador);
        Matcher unir = pattern.matcher(dni);

        return check;
    }

    //PARSEAR EL STRING SEXO A ENUM
    public static sexo sexoParser(String sexo) {
        sexo parsed = null;

        return parsed;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public sexo getSexo() {
        return sexo;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", dni='" + dni + '\'' +
                '}';
    }

    public calculateSalary() {

    }
}
