
package problematica_2;

public class MenuCarta extends Menu {
    protected double porcionGuarnicion;
    protected double bebida;
    protected double porcentajeAdicional;

    public MenuCarta(String nombrePlato, double valorInicialMenu,double porcionGuarnicion, double bebida, double porcentajeAdicional) {
        super(nombrePlato, valorInicialMenu);
        this.porcionGuarnicion = porcionGuarnicion;
        this.bebida = bebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public double getPorcionGuarnicion() {
        return porcionGuarnicion;
    }

    public void setPorcionGuarnicion(double porcionGuarnicion) {
        this.porcionGuarnicion = porcionGuarnicion;
    }

    public double getBebida() {
        return bebida;
    }

    public void setBebida(double bebida) {
        this.bebida = bebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    @Override
    public void calcularMenu() {
        valorMenu = valorInicialMenu + porcionGuarnicion + bebida;
        double porcentaje = (valorMenu * porcentajeAdicional)/100;
        valorMenu = porcentaje + valorMenu;
    }
    
}
