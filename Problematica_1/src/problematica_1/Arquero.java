package problematica_1;

import java.util.Scanner;

public class Arquero extends Personajes {

    private double disparo;
    private String disparoDevil;
    private String disparoNormal;
    private String disparoFuerte;

    public Arquero(String nombrePersonaje, double pv, int nivel) {
        super(nombrePersonaje, pv, nivel);
        disparo = 0;
    }

    public void disparoDevil(Personajes victima) {
        disparo = 1;
        victima.setPv(victima.getPv() - disparo);
        System.out.println("El arquero llamado " + getNombrePersonaje() + " ha disparado a corta distancia. \n"
                + "Quitandole " + disparo + " puntos de vida.\n");
    }

    public void disparoNormal(Personajes victima) {
        disparo = 19;
        victima.setPv(victima.getPv() - disparo);
        System.out.println("El arquero llamado " + getNombrePersonaje() + " ha disparado en una distancia media. \n"
                + "Quitandole " + disparo + " puntos de vida.\n");
    }

    public void disparoFuerte(Personajes victima) {
        disparo = 100;
        victima.setPv(victima.getPv() - disparo);
        System.out.println("El arquero llamado " + getNombrePersonaje() + " ha disparado a larga distancia. \n"
                + "Quitandole " + disparo + " puntos de vida.\n");
    }

    @Override
    public void atacar(Personajes victima) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero del ataque del cual quiera realizar:");
        System.out.println(""
                + "1. Habilidad Debil. \n"
                + "2. Habilidad Normal. \n"
                + "3. Habilidad Fuerte.");
        int nHabilidad = entrada.nextInt();
        if (nHabilidad == 1) {
            disparoDevil(victima);
        } else {
            if (nHabilidad == 2) {
                disparoNormal(victima);
            } else {
                if (nHabilidad == 3) {
                    disparoFuerte(victima);
                } else {
                    System.out.println("Usted ha fallado el ataque.");
                }
            }
        }
    }

    @Override
    public void defender() {
        System.out.println("El arquero decide defenderse. \n");
        setPv(pv + 10);
    }

}
