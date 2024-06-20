
package problematica_2;

public class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorInicialMenu,double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public void setValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void setValorPastel(double valorPastel) {
        this.valorPastel = valorPastel;
    }

    @Override
    public void calcularMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }
    
}
