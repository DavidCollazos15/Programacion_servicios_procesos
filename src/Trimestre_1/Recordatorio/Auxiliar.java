package Trimestre_1.Recordatorio;

public class Auxiliar extends Recordatorio implements IImplementacion{

    float salario;
    Semaforo var_semaforo;

    final double PI=3.14;

    public Auxiliar(int edad, String nombre, float salario) throws ErrorInvalido {
        super(edad, nombre);
        this.salario = salario;
    }


    //funcion
    public final float recalculo(){

        return salario+1000;
    }

    //procedimiento
    public void imprimirsalario(){
        System.out.println("El salario nuevo es: "+salario);
    }

    @Override
    public String toString() {
        return "Auxiliar{" +
                "salario=" + salario +
                ", PI=" + PI +
                '}';
    }

    @Override
    public void imprimir() {

    }

    @Override
    public void insertar() {

    }

    @Override
    public void borrar() {

    }
}
