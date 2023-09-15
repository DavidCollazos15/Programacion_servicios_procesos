package Trimestre_1.Recordatorio;

public class Recordatorio {

    //atributos
    private int edad;
    private String nombre;

    //Constructor

    public Recordatorio(int edad, String nombre) throws ErrorInvalido {
        if(edad<0){
            throw new ErrorInvalido("mensaje");
        }
        this.edad = edad;
        this.nombre = nombre;
    }

    //getters

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    //setters

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
