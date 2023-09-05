package r2;

public class MultiplyOrSplitBy2 implements Command2 {

    @Override
    public int execute(int counter) {
        return counter * 2;
    }

    @Override
    public int unexecute(int counter) {
        return counter / 2;
    }
}
