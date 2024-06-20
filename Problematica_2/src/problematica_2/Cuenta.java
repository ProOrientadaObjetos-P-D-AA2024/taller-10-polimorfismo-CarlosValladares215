package problematica_2;

import java.util.ArrayList;

public class Cuenta {

    private String nombreCliente;
    private ArrayList<Menu> listaMenus;
    private double valorCancelar;
    private double total;
    private double iva;

    public Cuenta(String nombreCliente, ArrayList<Menu> listaMenus) {
        iva = 0.15;
        this.nombreCliente = nombreCliente;
        this.listaMenus = listaMenus;
        valorCancelar = 0;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Menu> getListaMenus() {
        return listaMenus;
    }

    public void setListaMenus(ArrayList<Menu> listaMenus) {
        this.listaMenus = listaMenus;
    }

    public double getValorCancelar() {
        return valorCancelar;
    }

    public void calcularValorCancelar() {
        double valor = 0;
        for (int i = 0; i < listaMenus.size(); i++) {
            valor = listaMenus.get(i).getValorMenu() + valor;
        }
        valorCancelar = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        double porcentaje = valorCancelar * iva;
        this.total = valorCancelar + porcentaje;
    }

    public double getIva() {
        return iva*100;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("-------------------------Cuenta---------------------------"
                + "\nNombre del cliente: %s\nIVA: %.0f %%\nListado de cartas: \n"
                + "--------------------------Menú----------------------------\n",
                getNombreCliente(), getIva());

        for (int i = 0; i < listaMenus.size(); i++) {
            cadena = String.format("%s\t-%-15s.................. $ %.2f\n",
                    cadena,
                    listaMenus.get(i).getNombrePlato(),
                    listaMenus.get(i).getValorMenu());
        }
        cadena = String.format("%s----------------------------------------------------------\n"
                + "- Valor Total: $ %.2f", cadena,getTotal());
        return cadena;
    }
}
