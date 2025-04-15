import controllers.metodoBusqueda;
import models.Persona;

public class App {
    public static void main(String[] args) {

        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofía");
        personas[6] = new Persona(107, "Pedro");

        metodoBusqueda metodo = new metodoBusqueda(personas);

        int[] arreglo = {5, 8, 12, 20, 25};
        int valor = 12;

        int resultado = metodo.busquedaLineal(arreglo, valor);

        if (resultado != -1) {
            System.out.println("El valor " + valor + " está en la posición: " + resultado);
        } else {
            System.out.println("El valor " + valor + " no está en el arreglo.");
        }

        metodo.showPersonByCode(104); // Ejemplo de uso de búsqueda por código de persona
    }
}
