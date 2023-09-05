package r2;


public class AddOrRemove10 implements Command2
{
    @Override
    public int execute(int counter) {
        return counter + 10;
    }

    @Override
    public int unexecute(int counter) {
        return counter -10;
    }
}
