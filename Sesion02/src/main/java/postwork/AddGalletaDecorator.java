package postwork;

public class GalletaDecorator implements Helado {
    private Helado helado;

    public GalletaDecorator(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String description() {
        return helado.description() + ", con galleta extra";
    }

    @Override
    public int price() {
        return helado.price() + 15;
    }
}
