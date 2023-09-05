package postwork;

public class CoberturaDecorator implements Helado{

    private Helado helado;

    public CoberturaDecorator(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String description() {
        return helado.description() + ", con cobertura extra";
    }

    @Override
    public int price() {
        return helado.price() + 20;
    }
}
