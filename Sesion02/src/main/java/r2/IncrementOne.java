package r2;

public class IncrementOne implements Command2 {

    @Override
    public int execute(int counter) {
        return counter + 1;
    }

    @Override
    public int unexecute(int counter) {
        return counter -1;
    }
}
