package problematica_1;

import java.util.Scanner;

public class Ejecutor001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Personajes guerrero, mago, arquero;

        System.out.println("Ingrese el tipo de personaje que desea utilizar");
        System.out.println(""
                + "1. Guerrero\n"
                + "2. Mago\n"
                + "3. Arquero");
        int eleccion = entrada.nextInt();
        if (eleccion == 1) {
            guerrero = new Guerreros("Juan",100, 1);
            enfrentamiento(guerrero);
        } else {
            if (eleccion == 2) {
                mago = new Magos("Pedro", 200, 1);
                enfrentamiento(mago);
            } else {
                if (eleccion == 3) {
                    arquero = new Arquero("Maria", 70, 1);
                    enfrentamiento(arquero);
                }
            }
        }

    }

    public static void enfrentamiento(Personajes personaje) {
        // Este metodo existe para ahorrar lineas de codigo,
        // asumiendo directamente que "personaje" es el personaje anteriormente seleccionado.
        Scanner entrada = new Scanner(System.in);
        Personajes oponenteG, oponenteM, oponenteA;

        System.out.println("¿Desea iniciar el combate?(s/n)");
        String eleccion2 = entrada.nextLine();
        if (eleccion2.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el tipo de oponente que desea enfrentar");
            System.out.println(""
                    + "1. Guerrero\n"
                    + "2. Mago\n"
                    + "3. Arquero");
            int eleccion3 = entrada.nextInt();
            if (eleccion3 == 1) {
                oponenteG = new Guerreros("Juan",100, 1);
                personaje.enfrentarEnemigo(oponenteG);
            } else {
                if (eleccion3 == 2) {
                    oponenteM = new Magos("Pedro", 200, 1);
                    personaje.enfrentarEnemigo(oponenteM);
                } else {
                    if (eleccion3 == 3) {
                        oponenteA = new Arquero("Maria", 70, 1);
                        personaje.enfrentarEnemigo(oponenteA);
                    }
                }
            }
        }
        
    }
}
