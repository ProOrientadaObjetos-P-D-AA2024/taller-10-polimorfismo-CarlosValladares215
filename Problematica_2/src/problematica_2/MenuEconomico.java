
package problematica_2;

public class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(double porcentajeDescuento, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }


    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void calcularMenu() {
        double porcentaje = (valorInicialMenu * porcentajeDescuento)/ 100;
        valorMenu = valorInicialMenu - porcentaje;
    }

}
