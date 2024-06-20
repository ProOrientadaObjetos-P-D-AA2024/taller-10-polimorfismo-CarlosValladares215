
package problematica_2;

public class MenuDia extends Menu {
    private double postre;
    private double bebida;

    public MenuDia(String nombrePlato, double valorInicialMenu,double postre, double bebida) {
        super(nombrePlato, valorInicialMenu);
        this.postre = postre;
        this.bebida = bebida;
    }

    public double getPostre() {
        return postre;
    }

    public void setPostre(double postre) {
        this.postre = postre;
    }

    public double getBebida() {
        return bebida;
    }

    public void setBebida(double bebida) {
        this.bebida = bebida;
    }

    @Override
    public void calcularMenu() {
        valorMenu = valorInicialMenu + postre + bebida;
    }


}
