package controllers;
import models.Person;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    private Person[] people; //crear variable privada arreglo
    private ShowConsole pantalla; //variable showConsole
    private int comparacion;

    public MetodosBusquedaBinaria(Person[] personas){ //obligado poner entre los parentesis
        this.pantalla=new ShowConsole(); 
        this.people=personas; //Instanciar
        pantalla.showMessage("Metodo de busqueda binaria");
        System.out.println("Clase MBB creada");
        
    }
    
    public int findPersonByCode(int code){
        int bajo=0;
        int alto= people.length-1; //da el tamaño

        while(bajo<=alto){
            int central= bajo+(alto-bajo)/2;

            if(people[central].getCode()==code){ //si es igual
                return central;
            }

            if(people[central].getCode()< code){
                bajo = central+1; 
            }else{
                alto=central-1;
            }
        }
        return -1; //por si no encuentra nada
    }

    public void showPersonByCode(){
        int codeToFind = pantalla.getCode();
        int indexPerson= findPersonByCode(codeToFind);
        if(indexPerson==-1){
            pantalla.showMessage("No hay la persona con ese codigo");
        }else{
            pantalla.showMessage("Persona con codigo " + codeToFind + " Encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    private int findPersonByCode(String name){
        int bajo = 0;
        int alto = people.length - 1;
    
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            int comparacion = people[central].getName().compareToIgnoreCase(name);
    
            if (comparacion == 0);
            }
    
            int central = 0;
            if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        return -1;
    }

    public void showPersonByName(){
        String nameToFind = pantalla.getName();
        int indexPerson = findPersonByCode(nameToFind);
        if (indexPerson == -1) {
            pantalla.showMessage("No existe persona con ese nombre");
        } else {
            pantalla.showMessage("Persona con nombre '" + nameToFind + "' encontrada: "
             + people[indexPerson].toString());
        }


    }
    
}     //return rompe el ciclo y se acaba el metodo
        //break solo rompe el bucle pero no se acaba el metodo


