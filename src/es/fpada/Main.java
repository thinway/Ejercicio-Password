package es.fpada;

public class Main {

    public static void main(String[] args) {
        final int LONGITUD = 25;

        Password secureTable[] = new Password[10];

        for(int i=0;i<secureTable.length; i++){
            // Creo los objetos de tipo Password
            secureTable[i] = new Password(LONGITUD);
            System.out.println("Password "+i+":"+secureTable[i].getContrasena());
        }
    }
}
