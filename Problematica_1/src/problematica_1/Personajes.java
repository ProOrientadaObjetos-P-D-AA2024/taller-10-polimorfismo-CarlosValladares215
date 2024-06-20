package problematica_1;

import java.util.Scanner;

public abstract class Personajes {

    protected String nombrePersonaje;
    protected double pv;
    protected int nivel;

    public Personajes(String nombrePersonaje, double pv, int nivel) {
        this.nombrePersonaje = nombrePersonaje;
        this.pv = pv;
        this.nivel = nivel;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void enfrentarEnemigo(Personajes oponente) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("------La batalla ha iniciado en contra de " + oponente.nombrePersonaje + "------");
        while (oponente.pv > 0 && pv > 0) {
            System.out.println("-| El turno de " + nombrePersonaje + " ha comenzado |-");
            int accion;
            System.out.println("¿Qué accion desea realizar?");
            do {
                System.out.println(""
                        + "1. Atacar \n"
                        + "2. Defenderse \n"
                        + "3. Huir\n"
                        + "4, Observar Estadisticas");
                accion = entrada.nextInt();
                if (accion == 4) {
                    System.out.println(toString(oponente));
                } else {
                    if (accion > 5 || accion < 1) {
                        System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
                    }
                }
            } while (accion > 5 || accion < 1);

            if (accion == 1) {
                atacar(oponente);
            } else {
                if (accion == 2) {
                    defender();
                } else {
                    if (accion == 3) {
                        System.out.println("Usted ha decidido escapar.");
                        break;
                    }
                }
            }
            if (oponente.pv > 0) {
                System.out.println("-| El turno de " + oponente.nombrePersonaje + " ha comenzado |-");
                System.out.println("¿Qué accion desea realizar?");
                do {
                    System.out.println(""
                            + "1. Atacar \n"
                            + "2. Defenderse \n"
                            + "3. Huir\n"
                            + "4, Observar Estadisticas");
                    accion = entrada.nextInt();
                    if (accion == 4) {
                        System.out.println(toString(oponente));
                    } else {
                        if (accion > 5 || accion < 1) {
                            System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
                        }
                    }
                } while (accion > 5 || accion < 1);

                // el uso de this pasa el objeto actual como argumento, esto es
                // para que el oponente pueda atacar
                if (accion == 1) {
                    oponente.atacar(this);
                } else {
                    if (accion == 2) {
                        oponente.defender();
                    } else {
                        if (accion == 3) {
                            System.out.println("Usted ha decidido escapar.");
                            break;
                        }
                    }
                }
            }

        }

        if (pv <= 0) {
            System.out.println("La batalla ha terminado " + oponente.nombrePersonaje + " ha ganado.");
            oponente.setNivel(nivel + 1);
            System.out.println("El personaje " + oponente.nombrePersonaje + " ha subido de nivel.");
            System.out.println("Su nivel es: " + oponente.getNivel());
        } else {
            if (oponente.pv <= 0) {
                System.out.println("La batalla ha terminado " + nombrePersonaje + " ha ganado.");
                setNivel(nivel + 1);
                System.out.println("El personaje " + nombrePersonaje + " ha subido de nivel.");
                System.out.println("Su nivel es: " + getNivel());
            }

        }

    }

    public String toString(Personajes oponente) {
        String cadena = ""
                + "-----------------Estadisticas Propias-----------------------"
                + "\nNombre del Jugador: " + nombrePersonaje
                + "\nPuntos de vida: " + pv
                + "\nNivel: " + nivel + "\n"
                + "\n"
                + "---------------Estadisticas del Oponente--------------------"
                + "\nNombre del Jugador: " + oponente.nombrePersonaje
                + "\nPuntos de vida: " + oponente.pv
                + "\nNivel: " + oponente.nivel + "\n";

        return cadena;
    }

    public abstract void atacar(Personajes personaje);

    public abstract void defender();
}
