package views;

import java.util.Scanner;

import models.Person;

public class ShowConsole {
    private Scanner scanner = new Scanner (System.in);

    public void showMenu(){
        System.out.println("Método Búsqueda");
    }

    public int getCode(){
        System.out.println("Ingrese el código");
        int codgio = scanner.nextInt();
        System.out.println("Código ingresado: " + codgio);
        return codgio;
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public void showMessage(Person person) {
        throw new UnsupportedOperationException("Unimplemented method 'showMessage'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}