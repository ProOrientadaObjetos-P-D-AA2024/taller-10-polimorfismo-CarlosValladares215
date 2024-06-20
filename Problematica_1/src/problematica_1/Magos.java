package problematica_1;

import java.util.Scanner;

public class Magos extends Personajes {

    double hechizo;

    public Magos(String nombrePersonaje, double pv, int nivel) {
        super(nombrePersonaje, pv, nivel);
        hechizo = 0;
    }

    public void habilidadMagicaF(Personajes victima) {
        hechizo = 54.9;
        victima.setPv(victima.getPv() - hechizo);
        System.out.println("El mago llamado " + getNombrePersonaje() + " ha atacado con un hechizo mortal. \n"
                + "Quitandole " + hechizo + " puntos de vida.\n");
    }

    public void habilidadMagicaDevil(Personajes victima) {
        hechizo = 15.1;
        victima.setPv(victima.getPv() - hechizo);
        System.out.println("El mago llamado " + getNombrePersonaje() + " ha lanzado a corta distancia un ataque electrico. \n"
                + "Quitandole " + hechizo + " puntos de vida.\n");
    }

    public void habilidadMagicaNormal(Personajes victima) {
        hechizo = 27;
        victima.setPv(victima.getPv() - hechizo);
        System.out.println("El mago llamado " + getNombrePersonaje() + " ha lanzado a mediana distancia un hechizo normal. \n"
                + "Quitandole " + hechizo + " puntos de vida.\n");
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
            habilidadMagicaDevil(victima);
        } else {
            if (nHabilidad == 2) {
                habilidadMagicaNormal(victima);
            } else {
                if (nHabilidad == 3) {
                    habilidadMagicaF(victima);
                } else {
                    System.out.println("Usted ha fallado el ataque.");
                }
            }
        }
    }

    @Override
    public void defender() {
        System.out.println("El mago decide defenderse. \n");
        setPv(pv + 40);
    }

}
