package problematica_1;

import java.util.Scanner;

public class Guerreros extends Personajes {

    private double fuerza;


    public Guerreros(String nombrePersonaje,double pv, int nivel) {
        super(nombrePersonaje, pv, nivel);
        fuerza = 0;
    }


    public void habilidadAtaqueF(Personajes victima) {
        fuerza = 100;
        victima.setPv(victima.getPv() - fuerza);
        System.out.println("El guerrero llamado " + getNombrePersonaje() + " ha golpeado al oponente en la cara. \n"
                + "Quitandole " + fuerza +" puntos de vida.");
    }

    public void habilidadAtaqueDevil(Personajes victima) {
        fuerza = 10;
        victima.setPv(victima.getPv() - fuerza);
        System.out.println("El guerrero llamado " + getNombrePersonaje() + " ha empujado al oponente. \n"
                + "Quitandole " + fuerza +" puntos de vida.");
    }
    
    public void habilidadAtaqueNormal(Personajes victima) {
        fuerza = 50;
        victima.setPv(victima.getPv() - fuerza);
        System.out.println("El guerrero llamado " + getNombrePersonaje() + " ha pateado al oponente. \n"
                + "Quitandole " + fuerza +" puntos de vida.");
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
            habilidadAtaqueDevil(victima);
        }else{
            if (nHabilidad == 2) {
                habilidadAtaqueNormal(victima);
            }else{
                if (nHabilidad == 3) {
                    habilidadAtaqueF(victima);
                }else{
                    System.out.println("Usted ha fallado el ataque.");
                }
            }
        }
    }
    @Override
    public void defender() {
        System.out.println("El guerrero decide defenderse. \n");
        setPv(pv + 20);
    }
    
}
