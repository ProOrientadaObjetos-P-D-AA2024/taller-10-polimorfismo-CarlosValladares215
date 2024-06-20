
package problematica_2;

public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombrePlato, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorInicialMenu = valorInicialMenu;
        valorMenu = 0;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    public double getValorInicialMenu() {
        return valorInicialMenu;
    }

    public void setValorInicialMenu(double valorInicialMenu) {
        this.valorInicialMenu = valorInicialMenu;
    }
    
    public abstract void calcularMenu();
    
}
