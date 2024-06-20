package problematica_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Menu> listaMenus = new ArrayList<>();

        MenuNinos menuInfantes = new MenuNinos("Dulce de leche", 2, 1.5, 10);
        menuInfantes.calcularMenu();
        listaMenus.add(menuInfantes);

        MenuNinos menuInfantes2 = new MenuNinos("Patatas fritas", 3.5, 2, 40);
        menuInfantes2.calcularMenu();
        listaMenus.add(menuInfantes2);

        MenuEconomico menuEconomico = new MenuEconomico(15, "Lentejas", 2);
        menuEconomico.calcularMenu();
        listaMenus.add(menuEconomico);

        MenuDia menuDia = new MenuDia("Ceviche", 3, 1.6, 0.5);
        menuDia.calcularMenu();
        listaMenus.add(menuDia);

        MenuCarta menuCarta = new MenuCarta("pizza", 15, 3, 1, 5);
        menuCarta.calcularMenu();
        listaMenus.add(menuCarta);

        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("");

        Cuenta usuarioCuenta = new Cuenta(usuario, listaMenus);
        usuarioCuenta.calcularValorCancelar();
        usuarioCuenta.setTotal();

        System.out.println(usuarioCuenta.toString());
    }

}
