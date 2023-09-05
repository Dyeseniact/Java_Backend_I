package postwork;

public class GranolaDecorator implements Helado{

    private Helado helado;

    public GranolaDecorator(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String description() {
        return helado.description() + ", con granola extra";
    }

    @Override
    public int price() {
        return helado.price() + 10;
    }
}
